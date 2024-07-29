package Bit_Manipulation;

import java.util.Scanner;

public class Magic_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(number(n));

    }
    public static int number(int n)
    {
        int ans = 0;
        int mul = 5;
        while(n>0)
        {
            if((n&1) != 0)
            {
                ans = ans + mul;
            }
            mul += 5;
            n >>= 1;
        }
        return ans;
    }
}
