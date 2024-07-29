package Bit_Manipulation;

import java.util.Scanner;

public class Single_Number2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();

        }

        System.out.println(SingleNumber(arr));

    }
    public static int SingleNumber(int[] arr)
    {
        int[] bit = new int[32];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int pos = 0;
            while(num > 0)
            {
                if((num&1)> 0)
                {
                    bit[pos] = 1;
                }
                pos++;
                num >>= 1;
            }
        }
        for (int i = 0; i < bit.length; i++)
        {
            bit[i] %= 3;
        }
        return 0;
    }
}
