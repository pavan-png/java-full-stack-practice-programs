class A111{
    private String name = "pavan";

    public void setName(String name) {
        this.name = name;
    }

    void disp(){
        System.out.println("Hello "+name);
    }
}
class A112 extends A111{

    public void setName(String name) {
        this.setName(name);
    }
}
public class Inheritance_Private {
    public static void main(String[] args) {
        A112 obj = new A112();
        obj.disp();
    }
}
