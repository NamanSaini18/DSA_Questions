package DynamicProgramming;

import java.util.Scanner;

public class MatrixChainMultiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,2,3,5,1};
        System.out.println(MCM(arr,0,arr.length-1));

    }
    public static int MCM(int[] arr,int si,int ei)
    {
        if(si+1 == ei)
        {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=si+1;k<ei;k++)
        {
            int fs = MCM(arr,si,k);
            int ss = MCM(arr,k,ei);
            int rs = arr[si] * arr[k] * arr[ei];
            ans = Math.min(ans,fs+ss+rs);

        }
        return ans;
    }
}
