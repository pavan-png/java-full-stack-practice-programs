public class String_Eg89 {
    public static void main(String[] args) {
        String s1 = " ";
        System.out.println(s1.isBlank());
        // true since a single blank space is present . if there is only space it returns true.
        // if there is combination of space and data then false

        System.out.println(s1.isEmpty());
        // false since blank space is present s1 is not empty .
    }
}
