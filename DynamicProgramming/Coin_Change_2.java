package DynamicProgramming;

import java.util.Scanner;

public class Coin_Change_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = {1,2,5};
        int amount = 5;
        System.out.println(CoinChange(coin,amount,0));
    }
    public static int CoinChange(int[] coin,int amount,int idx)
    {
        if(amount == 0)
        {
            return 1;
        }
        if(idx == coin.length)
        {
            return 0;
        }
        int inc = 0,exc = 0;
        if(coin[idx] <= amount)
        {
            inc = CoinChange(coin,amount-coin[idx],idx);
        }
        exc = CoinChange(coin,amount,idx+1);
        return inc+exc;
    }
    public static int CoinChange2(int[] coin,int amount)
    {
        int[][] dp = new int[coin.length+1][amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++)
        {
            for(int amt = 1;i<dp.length;i++)
            {
                int inc = 0,exc = 0;
                if(coin[i-1] <= amt)
                {
                    inc = dp[i][amt-coin[i-1]];
                }
                exc = dp[i-1][amt];
                dp[i][amt] = inc+exc;
            }

        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
