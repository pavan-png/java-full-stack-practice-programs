public class Automatic_Exection {
    static  int  a ;
    static int b ;
    static {
        a = 10;
        b = 24;
        System.out.println("this is static block");
    }
    public static void main(String[] args) {
        System.out.println("this is main method ");

    }
}
