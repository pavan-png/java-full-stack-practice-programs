public class String_Eg77 {
    public static void main(String[] args) {
        String s1  = "Hello";
        System.out.println(s1.toString());

        String  s = null;
       //  System.out.println(s.toString()); cannot perform operations on null NullPointerException.
        System.out.println(s); //

      //  String s2 = null +null  leads to compilation error.
        // since literals are involved compiler will come into picture. since operation cant be performed on null it leads to C.E

        s = null+s;

        // here though we have performed operation on null s is treated as string so null is treated as string
        System.out.println(s);

        // since they are concatenated as Strings . all the String methods can be applied to it.
        System.out.println(s.length());
        System.out.println(s.charAt(2));
    }
}
