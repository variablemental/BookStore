import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by coder-z on 16-12-12.
 */
public class BookAction extends Action {
    private int action;
    private BookDao dao=null;
    private BookForm[] Books;
    private static String SHOW_JSP="book_result";
    private static String result="list";
    private static String NUM="num";

    public static final int FIND_BY_NAME=10;
    public static final int FIND_BY_ISBN=11;
    public static final int FIND_BY_AUTHOR=12;
    public static final int FIND_BY_PRICE=13;
    public static final int FIND_BY_PRESS=14;

    public void setBooks(BookForm[] Books) {
        this.Books=Books;
    }


    /**
     *总是返回showBook.jsp页面，然后在show.jps页面里面循环输出。
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        this.action=Integer.parseInt(request.getParameter("action"));
        dao=new BookDao();
        return selectBook(mapping,form,request,response,action);
    }

    public ActionForward selectBook(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response,int type) {

        List temp=new ArrayList();
        String name="";
        switch (type) {
            case FIND_BY_NAME:
                name = request.getParameter("bookname");
                break;
            case FIND_BY_ISBN:
                name = request.getParameter("ISBN");
                break;
            case FIND_BY_AUTHOR:
                name = request.getParameter("author");
                break;
            case FIND_BY_PRESS:
                name=request.getParameter("press");
                break;
            case FIND_BY_PRICE:
                name=request.getParameter("price");
                break;
        }
        List<BookForm> BookList=dao.selectBooksByAllName(name,type);
        for(BookForm bookForm:BookList) {
            Map<String,String> tempmap=new HashMap<>();
            tempmap.put("id",bookForm.getId()+"");
            tempmap.put("ISBN",bookForm.getISBN());
            tempmap.put("name",bookForm.getName());
            tempmap.put("press",bookForm.getPress());
            tempmap.put("Author",bookForm.getAuthor());
            tempmap.put("price",bookForm.getPrice()+"");
            tempmap.put("num",bookForm.getNum()+"");
            temp.add(tempmap);
        }
//        tempmap.put("id","aa");
//        tempmap.put("name","aa");
//        tempmap.put("ISBN","abc");
//        temp.add(tempmap);
//        request.setAttribute("peso",temp);
//        request.setAttribute("NUM",temp.size()+"");
        request.setAttribute("peso",temp);
        return mapping.findForward(SHOW_JSP);
    }

}
