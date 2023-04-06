package DynamicProgramming;

import java.util.*;

public class LongestIncreasingSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(LIS(arr));

    }
    public static int LIS(int[] arr)
    {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < dp.length; i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i] > arr[j])
                {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }

            }
        }
        int max = dp[0];
        for(int i=1;i<dp.length;i++)
        {
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
