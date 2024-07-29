package LeetCode;

import java.util.Scanner;

public class Longest_Happy_Prefix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(LPS(str));
    }
    public static String LPS(String str)
    {
        int[] dp = new int[str.length()];
        int len = 0;
        for(int i=1;i<dp.length;i++)
        {
            if(str.charAt(len) == str.charAt(i))
            {
                len++;
                dp[i] = len;
            }
            else
            {
                if(len > 0)
                {
                    len = dp[len-1];

                }
                else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
        return str.substring(0,dp[str.length()-1]);
    }
}
