public class AutoBoxing_UnBoxing_Eg7 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2  = i1; // both the references pointing to the same object
        System.out.println(i1 == i2);
    }
}
