import org.apache.struts.action.ActionForm;

/**
 * Created by coder-z on 16-12-12.
 */
public class BookForm extends ActionForm {
    private Integer id=0;
    private String ISBN="";
    private String Name="";
    private String author="";
    private String press="";
    private float price=0.0f;
    private int num=0;

    public Integer getId() {
        return id;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getName() {
        return Name;
    }
    public String getPress() {
        return press;
    }
    public String getAuthor() {
        return author;
    }
    public float getPrice() {
        return price;
    }
    public int getNum() {
        return num;
    }
    public void setId(int id) {
        this.id=id;
    }
    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }
    public void setName(String name) {
        this.Name=name;
    }
    public void setNum(int num) {
        this.num=num;
    }
    public void setAuthor(String Author) {
        this.author=Author;
    }
    public void setPress(String press) {
        this.press=press;
    }
    public void setPrice(float price) {
        this.price=price;
    }

}
