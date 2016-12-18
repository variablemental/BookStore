import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.util.*;

/**
 * Created by coder-z on 16-12-13.
 */
public class OrderFormAction extends Action {

    private int action=0;
    private FormDao dao=null;
    private BookDao bookDao=null;
    private static String failure="failure";
    public static final int SELECT_ALL_ORDERS=30;
    public static final int CONFIRM_ORDER=31;
    public static final int INSERT_ORDER=34;
    private static String SHOW_FORM="show_form";
    public static final String SUCCESS_PAGE="success";
    public static final String FAIL_PAGE="fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request
                                , HttpServletResponse response) {
        action=Integer.parseInt(request.getParameter("action"));
        dao=new FormDao();
        switch (action) {
            case SELECT_ALL_ORDERS:
                return selectAllOrders(mapping, form, request, response);
            case CONFIRM_ORDER:
                return confirmOrder(mapping, form, request, response);
            case 33:
                return mapping.findForward("success");
            case INSERT_ORDER:
                return insertOrder(mapping, form, request, response);
        }
        return null;
    }


    public ActionForward selectAllOrders(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        List<OrderForm> result=dao.selectAllOrders();
//        request.setAttribute("list",result);
//        request.setAttribute("number",String.valueOf(result.size()));
        List peso=new ArrayList();
        for(OrderForm orderForm:result) {
            Map<String,String> tempMap=new HashMap<String,String>();
            tempMap.put("O_id",orderForm.getId()+"");
            tempMap.put("B_id",orderForm.getB_Id()+"");
            tempMap.put("U_id",orderForm.getU_Id()+"");
            tempMap.put("A_id",orderForm.getA_id()+"");
            tempMap.put("O_num",orderForm.getO_Num()+"");
            tempMap.put("B_up",orderForm.getB_UP()+"");
            tempMap.put("B_tp",orderForm.getB_TP()+"");
            peso.add(tempMap);
        }
        request.setAttribute("peso",peso);
        return mapping.findForward("show_form");
    }

    public ActionForward insertOrder(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request, HttpServletResponse response) {
            int bookid=Integer.valueOf(request.getParameter("bookid"));
            int userid=Integer.valueOf(request.getParameter("vipid"));
            int num=Integer.valueOf(request.getParameter("num"));
            OrderForm orderForm=new OrderForm();
            orderForm.setB_id(bookid);
            orderForm.setU_Id(userid);
            orderForm.seto_Num(num);
            dao.Insert(orderForm);
            return mapping.findForward("success");
    }

    public ActionForward confirmOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        bookDao=new BookDao();
        String ISBN=request.getParameter("ISBN");
        int O_id=Integer.valueOf(request.getParameter("o_id"));
//        BookForm bookForm=bookDao.selectUniqueBook(ISBN);
//        if(bookForm!=null) {
            dao.ProcessOrder(O_id);
//        }
//        else
            request.setAttribute(failure,"已清空");
        return mapping.findForward(SHOW_FORM);
    }

}
