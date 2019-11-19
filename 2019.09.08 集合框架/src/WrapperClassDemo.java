public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        Integer ii = i;
        System.out.println(ii);
        int j = ii;
        System.out.println(j);

        i = 11;
        System.out.println(i);
        System.out.println(ii);
        System.out.println(j);
    }
}
