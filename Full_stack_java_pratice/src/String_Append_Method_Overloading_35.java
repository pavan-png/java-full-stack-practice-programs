public class String_Append_Method_Overloading_35 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Iam working in google with a package of ");
        s.append(45.50);
        s.append(" L.P.A");
        s.append(" In ");
        System.out.println(s);
        // Iam working in google with a package of 45.5 L.P.A In Newyork
        s.append("Newyork" ,0,7);
        System.out.println(s);

    }
}
