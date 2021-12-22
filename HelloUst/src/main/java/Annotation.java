import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
    public Annotation(){

    }
    @Autowired
    private  Annotation annotation;

public  String show(){
    return "Hello ";
}
public void display(){
    System.out.println("Hello Spring");
    annotation.show();
   }

}
