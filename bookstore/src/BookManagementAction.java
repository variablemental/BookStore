import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.apache.struts.action.*;
import org.apache.struts.config.ActionConfig;
import org.apache.struts.config.ForwardConfig;
import org.apache.struts.config.ModuleConfig;
import org.apache.struts.util.MessageResources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by coder-z on 16-12-12.
 */
public class BookManagementAction extends Action {

    public static final int INSERT_BOOK=20;
    public static final int DELETE_BOOK=21;
    public static final int UPDATE_BOOK=22;
    public static final int SEARCH_ALL_BOOK=23;
    public static final String BOOK_MANAGER="insert_book";
    public static final String SUCCESS_PAGE="success";
    public static final String FAIL_PAGE="fail";

    public int getAction() {
        return action;
    }

    private int action;
    private BookDao dao=null;


    /**
     * 只能把jsp写死进去了，没办法用什么手段获得当前jsp（好像）。
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @delete错误，查找唯一一本书的函数；
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) {

        this.action=Integer.parseInt(request.getParameter("action"));
        dao=new BookDao();
        switch (action) {
            case INSERT_BOOK:
                return InsertBook(mapping, form, request, response);
            case UPDATE_BOOK:
                return UpdateBook(mapping, form, request, response);
            case DELETE_BOOK:
                return deleteBook(mapping,form,request,response);
            case SEARCH_ALL_BOOK:
                return selectAllBook(mapping, form, request, response);
        }
        return mapping.findForward(BOOK_MANAGER);


    }

    public ActionForward InsertBook(ActionMapping mapping,ActionForm form,HttpServletRequest request,
                                    HttpServletResponse response) {
    /*    try {
            request.setCharacterEncoding("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        BookForm bookForm=new BookForm();
        bookForm.setISBN(request.getParameter("bookid"));
        bookForm.setName(request.getParameter("bookname"));
        bookForm.setPrice(Float.valueOf(request.getParameter("bookprice")));
        bookForm.setPress(request.getParameter("bookpress"));
        bookForm.setAuthor(request.getParameter("bookauthor"));
        bookForm.setNum(Integer.valueOf(request.getParameter("rc")));
        List<BookForm> exist=dao.selectBooksByAllName(bookForm.getName(),BookAction.FIND_BY_NAME);
        System.out.println(exist.size());
        if(exist.size()!=0 /*|| exist.get(0).getName().equals(bookForm.getName())*/ ) {

            request.setAttribute("success", "该书已经存在！");
            dao.delete(exist.get(0).getISBN());
            bookForm.setNum(exist.get(0).getNum()+bookForm.getNum());
            System.out.println(bookForm.getNum());
            dao.insertBook(bookForm);
            //dao.update(bookForm);
        }
        else {
            dao.insertBook(bookForm);
            request.setAttribute("success", "成功!");
        }
        return mapping.findForward(SUCCESS_PAGE);
    }

    public ActionForward selectAllBook(ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response) {
        List<BookForm> books=dao.SelectAllBook();
        List result=new ArrayList();

        for(BookForm book:books) {
            Map<String,String> tempmap=new HashMap<>();
            tempmap.put("id",book.getId()+"");
            tempmap.put("name",book.getName());
            tempmap.put("Author",book.getAuthor());
            tempmap.put("ISBN",book.getISBN());
            tempmap.put("press",book.getPress());
            tempmap.put("price",book.getPrice()+"");
            tempmap.put("num",book.getNum()+"");
            result.add(tempmap);
        }
        request.setAttribute("peso",result);
        return mapping.findForward("book_result");
    }

    public ActionForward UpdateBook(ActionMapping mapping,ActionForm form,HttpServletRequest request,
                                    HttpServletResponse response) {
        BookForm bookForm=(BookForm)form;


        if(dao.selectBooksByAllName(((BookForm) form).getName(),BookAction.FIND_BY_NAME)==null)
            request.setAttribute("success","失败！");
        else {
            dao.update(bookForm);
            request.setAttribute("success","成功！");
        }
        return mapping.findForward(BOOK_MANAGER);
    }

    public ActionForward deleteBook(ActionMapping mapping,ActionForm form,HttpServletRequest request,
                                    HttpServletResponse response) {
        BookForm bookForm=new BookForm();
        bookForm.setISBN(request.getParameter("bookISBN"));
        System.out.println("nnnnnnnnnnno");
//        BookForm formSelect=dao.selectUniqueBook(bookForm.getISBN());
//        System.out.println("nooooooooo");
//        if(formSelect==null) {
//            request.setAttribute("success", "无该项！");
//            System.out.println("no");
//        }
//        else {
//            System.out.println(bookForm.getISBN()+"B");
            dao.delete(bookForm.getISBN());
//            System.out.println(bookForm.getISBN()+"C");
//            request.setAttribute("success","成功！");
//            System.out.println("yessssssssss");
//        }
        return mapping.findForward(FAIL_PAGE);
    }

}
