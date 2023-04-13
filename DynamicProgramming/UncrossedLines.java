package DynamicProgramming;

public class UncrossedLines
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,4,2};
        int[] arr2 = {1,2,4};
        System.out.println(Lines(arr1,arr2));
    }
    public static int Lines(int[] arr1,int[] arr2)
    {
        int [][] dp = new int[arr1.length+1][arr2.length+1];

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int res = 0;
                if(arr1[i-1] == arr2[j-1])
                {
                    res = 1 + dp[i-1][j-1];
                }
                else
                {
                    int fs = dp[i-1][j];
                    int ss = dp[i][j-1];
                    res = Math.max(fs,ss);
                }

                dp[i][j] = res;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
