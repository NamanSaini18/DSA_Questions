public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        System.out.println(a);
        System.out.println(a1);
        a1=a; //AutoBoxing
        int x = 11;
        Integer y = 11;
        x = y; //UnBoxing
        System.out.println(x==y);  // jab ek Primitive or Non Primitive compare hote hai to unka content compare kiya jata hai

        Integer c= -16;
        Integer c1 = -16;
        Integer d = 167;
        Integer d1 = 167;
        System.out.println(c==c1);
        System.out.println(d==d1);
    }
}
