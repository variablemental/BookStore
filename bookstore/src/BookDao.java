import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by coder-z on 16-12-12.
 */
public class BookDao {
    private PreparedStatement ps=null;
    private Connection connection=null;
    private JDBCConnection jdbc;
    private static int MAX_BOX=200;
    private static final String SQL_PRE="select * from book where ";


    public BookDao() {
        jdbc=new JDBCConnection();
        connection=jdbc.connection;
    }

    public List<BookForm> selectBooksByAllName(String name,int type) {
        List<BookForm> books=new ArrayList<BookForm>();
        try {
            switch (type) {
                case BookAction.FIND_BY_NAME:
                    ps=connection.prepareStatement(SQL_PRE+"b_name=?");
                    break;
                case BookAction.FIND_BY_AUTHOR:
                    ps=connection.prepareStatement(SQL_PRE+"b_author=?");
                    break;
                case BookAction.FIND_BY_ISBN:
                    ps=connection.prepareStatement(SQL_PRE+"b_isbn=?");
                    break;
                case BookAction.FIND_BY_PRESS:
                    ps=connection.prepareStatement(SQL_PRE+"b_press=?");
                    break;
                case BookAction.FIND_BY_PRICE:
                    ps=connection.prepareStatement(SQL_PRE+"b_price=?");
                    break;
            }
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            for(int i=0;i<MAX_BOX&&rs.next();i++) {
                BookForm bookForm=new BookForm();
                bookForm.setId(Integer.valueOf(rs.getString(1)));
                bookForm.setISBN(rs.getString(2));
                bookForm.setName(rs.getString(3));
                bookForm.setAuthor(rs.getString(4));
                bookForm.setPrice(Float.valueOf(rs.getString(5)));
                bookForm.setPress(rs.getString(6));
                bookForm.setNum(Integer.valueOf(rs.getString(7)));
                System.out.println(bookForm.getNum());
                books.add(bookForm);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }




    public BookForm selectUniqueBook(String ISBN) {
        BookForm form=new BookForm();
        try {
            ps=connection.prepareStatement(SQL_PRE+"b_isbn=?");
            System.out.println(ISBN+"A");
            ps.setString(1,ISBN);
            ResultSet rs=ps.executeQuery();
            System.out.println(ISBN+"D");
            form.setId(Integer.valueOf(rs.getString(1)));
            form.setISBN(rs.getString(2));
            form.setName(rs.getString(3));
            form.setAuthor(rs.getString(4));
            form.setPress(rs.getString(5));
            form.setPrice(Float.valueOf(rs.getString(6)));
            form.setNum(Integer.valueOf(rs.getInt(7)));
            System.out.println(ISBN+"E");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return form;

    }

    public void insertBook(BookForm form) {
        try {
            ps=connection.prepareStatement("insert into book"  +
                                            "(B_ISBN,B_NAME,B_AUTHOR,B_PRICE,B_PRESS,B_NUM)" +
                                            "values(?,?,?,?,?,?)");
            ps.setString(1,form.getISBN());
            ps.setString(2,form.getName());
            ps.setString(3,form.getAuthor());
            ps.setDouble(4,form.getPrice());
            ps.setString(5,form.getPress());
            ps.setInt(6,form.getNum());
            System.out.println(form.getName());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<BookForm> SelectAllBook(){
        List list=new ArrayList();
        try {
            ps=connection.prepareStatement("SELECT * FROM book");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                BookForm bookForm=new BookForm();
                bookForm.setId(Integer.valueOf(rs.getString(1)));
                bookForm.setISBN(rs.getString(2));
                bookForm.setName(rs.getString(3));
                bookForm.setAuthor(rs.getString(4));
                bookForm.setPrice(Float.valueOf(rs.getString(5)));
                bookForm.setPress(rs.getString(6));
                bookForm.setNum(Integer.valueOf(rs.getString(7)));
                list.add(bookForm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //第二次点击会导致数据全被修改，继续完善！！！！
    public void update(BookForm form) {
        try {
            ps=connection.prepareStatement("update book set B_NAME=?,B_AUTHOR=?"+
                    ",B_PRICE=?,B_PRESS=?,B_NUM=? where B_ISBN=?");
            ps.setString(1,"mm");
            ps.setString(2,"oo");
            ps.setDouble(3,22);
            ps.setString(4,"dd");
            ps.setInt(5,900);
            ps.setString(6,"33333");
            ps.executeUpdate();
            ps.close();
/*            ps=connection.prepareStatement("update book set B_ISBN=?,B_AUTHOR=?," +
                                                "B_PRICE=?,B_PRESS=?,B_NUM=?"+
                                                "where B_NAME=?");
  //          ps.setString(1, "bb"*//*form.getName()*//*);
            ps.setString(2,"cc"*//*form.getAuthor()*//*);
            ps.setString(1,"87656");

            ps.setDouble(3,45*//*Double.valueOf(form.getPrice())*//*);
            ps.setString(4,"nn"*//*form.getPress()*//*);
            ps.setInt(5,300*//*form.getNum()*//*);
            ps.setString(6,"dd"*//*form.getISBN()*//*);
            ps.executeUpdate();
            ps.close();*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean delete(String ISBN) {
        try {
            ps=connection.prepareStatement("delete from book where B_ISBN=?");
            ps.setString(1,ISBN);
            System.out.println(ISBN+"F");
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
