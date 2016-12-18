import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by coder-z on 16-12-12.
 */
public class JDBCConnection {
    private String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String url="jdbc:sqlserver://localhost:1433;DatabaseName=db_bookstore";

    public Connection connection=null;

    public JDBCConnection(){
        try {
            System.out.println(connection==null);
            Class.forName(dbDriver).newInstance();
            connection= DriverManager.getConnection(url,"admin","admin123456");
            connection.getCatalog();
            System.out.println(connection==null);
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

}
