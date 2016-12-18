import org.apache.struts.action.ActionForm;

/**
 * Created by coder-z on 16-12-12.
 */
public class MemberForm extends ActionForm {
    private Integer id=1;
    private Integer age=1;
    private String username="";
    private String password="";
    private String email;
    private boolean sex=true;
    private String result="";

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }
    public void setUserName(String username) {
        this.username=username;
    }
    public String getUserName() {
        return username;
    }
    public void setPassWord(String password) {
        this.password=password;
    }
    public String getPassword() {
        return password;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public Integer getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public boolean getSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex=sex;
    }
    public void setResult(String result) {
        this.result=result;
    }
    public String getResult() {
        return result;
    }
}
