public class AutoBoxing_UnBoxing_Eg14 {
    public static void main(String[] args) {
        Integer i = new Integer(1) + new Integer(2);
        switch (i){
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("hi");
                break;
        }
    }
}
