import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import java.sql.Date;

/**
 * Created by coder-z on 16-12-13.
 */
public class OrderForm extends ActionForm{
    private int id=0;
    private int b_id=0;
    private int u_Id=0;
    private int a_id=0;
    private int o_num=0;
    float B_UP=0.0f;
    float B_TP=0.0f;
    private Date datetime=null;

    public void setId(int id) {
        this.id=id;
    }
    public void setB_id(int ISBN) {
        this.b_id=ISBN;
    }
    public void seto_Num(int num) {
        this.o_num=num;
    }
    public void setU_Id(int userId) {
        this.u_Id=userId;
    }
    public void setDate(Date date) {
        this.datetime=date;
    }

    public void setB_TP(float b_TP) {
        this.B_TP = b_TP;
    }

    public void setB_UP(float b_UP) {
        B_UP = b_UP;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public Date getDate() {
        return datetime;
    }

    public int getId() {
        return id;
    }

    public int getU_Id() {
        return u_Id;
    }

    public int getB_Id() {
        return b_id;
    }

    public int getO_Num() {
        return o_num;
    }

    public int getA_id() {
        return a_id;
    }

    public float getB_TP() {
        return B_TP;
    }

    public float getB_UP() {
        return B_UP;
    }
}
