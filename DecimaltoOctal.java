import java.util.*;

public class DecimaltoOctal {
        public static void main(String[] args) {
            // Your Code Here

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum=0;
            int mul=0;
            while(n>0)
            {
                int rem=n%8;
                sum+=rem*Math.pow(10,mul);
                n=n/8;
                mul++;

            }
            System.out.println(sum);
        }
    }


