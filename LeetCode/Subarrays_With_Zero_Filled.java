package LeetCode;

import java.util.Scanner;

public class Subarrays_With_Zero_Filled
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,0,0,2,0,0,4};
        long res = zeroFilledSubarray(arr);
        System.out.println(res);

    }
    public static long zeroFilledSubarray(int[] nums)
    {
        long ans = 0, num = 0;

        for(int n : nums)
        {
            if(n == 0)
            {
                num++;
            }
            else
            {
                num = 0;
            }
            ans = ans + num;
        }
        return ans;

    }
}
