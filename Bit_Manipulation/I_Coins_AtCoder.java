package Bit_Manipulation;


import java.util.Arrays;
import java.util.Scanner;

public class I_Coins_AtCoder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double[][] dp = new double[n+1][n+1];
        for (int i = 0; i <=n; i++) {
            Arrays.fill(dp[i],-1);

        }

        System.out.println(Coins(arr,0,(n+1)/2,dp));
    }
    public static double Coins(double[] arr,int i,int H,double[][] dp)
    {
        if(H == 0) return 1;
        if(i >= arr.length)
        {
            return 0;
        }

        if(dp[H][i] != -1)
        {
            return dp[H][i];
        }

        double ans = arr[i]*Coins(arr,i+1,H-1,dp) + (1 - arr[i] ) * Coins(arr,i+1,H,dp);

        dp[H][i] = ans;
        return ans;


    }
    


}
