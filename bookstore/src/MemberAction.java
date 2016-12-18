import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by coder-z on 16-12-12.
 */
public class MemberAction extends Action {
    private int action;
    private MemberDao dao=null;
    private String name;
    public static final String SUCCESS_PAGE="success";
    public static final String FAIL_PAGE="fail";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws IOException {
        dao=new MemberDao();
        this.action=Integer.parseInt(request.getParameter("action"));
        String type=request.getParameter("level");
        System.out.println(type);
        if(type!=null) {
            if (type.equals("manager")) {
                action = 2;
            } else
                action = 1;
        }
        switch (action) {
            case 1:
                return checkMember(mapping, form, request, response);
            case 2:
                return admin(mapping, form, request, response);
            case 3:
                return register(mapping, form, request, response);
            case 4:
                return selectMember(mapping, form, request, response);
        }
        return null;
    }

    public ActionForward selectMember(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        String user_id=request.getParameter("usersid");
        MemberForm form1=dao.selectMemberForm(user_id);
        Map<String,String> peso=new HashMap<String,String>();
        System.out.println(form1.getPassword());
        peso.put("username",form1.getUserName());
        peso.put("password",form1.getPassword());
        request.setAttribute("peso",peso);
        return mapping.findForward("showMember");
    }

    public ActionForward register(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        MemberForm memberForm=new MemberForm();
        memberForm.setUserName(request.getParameter("name"));
        memberForm.setPassWord(request.getParameter("password"));
        dao.insertMember(memberForm);
        return mapping.findForward("checkMember");
    }
    public ActionForward admin(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        if(name.equals("admin")&&password.equals("admin"))
            return mapping.findForward("admin");
        else
            return mapping.findForward("checkMember");

    }

    public ActionForward checkMember(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) {
        String name=request.getParameter("name");
        MemberForm memberForm=dao.selectMemberFormbyName(name);
        String password= request.getParameter("password");
        if(memberForm==null||memberForm.getUserName().trim().equals("")) {
            request.setAttribute("result","不存在此会员，请重新登录！！！");
        }else if(memberForm.getPassword().trim().equals(password.trim())) {
            System.out.println("ttt");
            return mapping.findForward("admin");
        }
        request.setAttribute("result","密码错误，请重新登录！！！");
        return mapping.findForward("checkMember");
    }
}
