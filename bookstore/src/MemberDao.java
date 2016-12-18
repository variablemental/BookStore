import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by coder-z on 16-12-12.
 */
public class MemberDao {
    private PreparedStatement ps=null;
    private Connection connection=null;
    private JDBCConnection jdbc=null;

    public MemberDao() {
        jdbc=new JDBCConnection();
        connection=jdbc.connection;
    }

    public MemberForm selectMemberForm(String name) {
        MemberForm member=null;
        try {
            ps=connection.prepareStatement("select * from users where U_ID=?");
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                member=new MemberForm();
                member.setId(Integer.valueOf(rs.getString(1)));
                member.setUserName(rs.getString(2));
                member.setPassWord(rs.getString(6));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }

    public MemberForm selectMemberFormbyName(String name) {
        MemberForm member=null;
        try {
            ps=connection.prepareStatement("select * from users where U_NAME=?");
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                member=new MemberForm();
                member.setId(Integer.valueOf(rs.getString(1)));
                member.setUserName(rs.getString(2));
                member.setPassWord(rs.getString(6));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }


    public void insertMember(MemberForm form) {
        try {
            ps=connection.prepareStatement("insert into users (U_NAME,U_PASSWORD)values(?,?)");
            ps.setString(1,form.getUserName());
            ps.setString(2,form.getPassword());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
