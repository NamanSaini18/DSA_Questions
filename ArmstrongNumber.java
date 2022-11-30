import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int OriginalNum,rem,result=0;
        OriginalNum = num;
        while(OriginalNum != 0)
        {
            rem = OriginalNum%10;
            result += Math.pow(rem,3);
            OriginalNum /= 10;
        }
        if(result == num)
        {
            System.out.println(num+" "+"is an Armstrong Number");
        }
        else
        {
            System.out.println(num+" "+"is Not an Armstrong Number");
        }
    }
}
