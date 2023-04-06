package DynamicProgramming;

// Top down Approach - DP

public class Basic
{
    public static void main(String[] args)
    {
        int n = 150;
        int[] dp = new int[n+1];  // Size of array must be n+1
        System.out.println(fiboTD(n,dp));
        System.out.println(fiboBU(n)); // Bottom Up is faster than Top Down because of No recursive call (Call Stack nhi bnta)
        System.out.println(fibo(n));

    }
    public static int fibo(int n)
    {
        // Traditional Recursion Approach
        if(n == 0 || n == 1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static int fiboTD(int n,int[] dp)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        if(dp[n] != 0)  // DP apply krna
        {
            return dp[n];
        }
        int f1 = fiboTD(n-1,dp);  // dp[n-1]
        int f2 = fiboTD(n-2,dp);  // dp[n-2]

        return dp[n] = f1+f2;  // dp[n] = dp[n-1]+dp[n-2]
    }
    public static int fiboBU(int n)
    {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
