package DivideANDConquer;

public class TimeANDSpaceDemo {
    public static void main(String[] args) {
        // Experimental Way --> Hardware Dependent
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
