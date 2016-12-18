import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by coder-z on 16-12-13.
 */
public class FormDao {
    private JDBCConnection jdbc=null;
    private Connection connection=null;
    private PreparedStatement ps=null;
    public FormDao() {
        jdbc=new JDBCConnection();
        connection= jdbc.connection;
    }

    public List<OrderForm> selectAllOrders() {
        List<OrderForm> result=new ArrayList<OrderForm>();
        try {
            ps=connection.prepareStatement("select * from ORDERS");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                OrderForm form=new OrderForm();
                form.setId(Integer.valueOf(rs.getString(1)));
                form.setB_id(Integer.valueOf(rs.getString(2)));
                form.setU_Id(Integer.valueOf(rs.getString(3)));
                form.setA_id(Integer.valueOf(rs.getString(4)));
                form.seto_Num(Integer.valueOf(rs.getString(5)));
                form.setB_UP(Float.valueOf(rs.getString(6)));
                form.setB_TP(Float.valueOf(rs.getString(7)));
                result.add(form);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void Insert(OrderForm orderForm) {

        try {
            ps=connection.prepareStatement("select * from book where B_ID=?");
            ps.setInt(1,orderForm.getB_Id());
            ResultSet rs=ps.executeQuery();
            double price=0.0d;
            while (rs.next()) {
                price=Double.valueOf(rs.getString(5));
                System.out.println(price);
            }
            ps=connection.prepareStatement("insert into orders (B_ID,U_ID,A_ID,O_NUM,B_UP,B_TP)values(?,?,?,?,?,?)");
            ps.setInt(1,orderForm.getB_Id());
            ps.setInt(2,orderForm.getU_Id());
            ps.setInt(3,2);
            ps.setInt(4,orderForm.getO_Num());
            ps.setDouble(5,price);
            ps.setDouble(6,price*orderForm.getO_Num());
            System.out.println(price);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void ProcessOrder(int O_id) {
        String ISBN="";
        try {
            ps=connection.prepareStatement("select * from orders where O_ID=?");
            ps.setInt(1,O_id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                ISBN=rs.getString(2);
            }
            ps=connection.prepareStatement("DELETE FROM book where B_ISBN=?");
            ps.setString(1,ISBN);
            ps.executeUpdate();
            ps.close();
            ps=connection.prepareStatement("delete from orders where O_ID=?");
            ps.setInt(1,O_id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
