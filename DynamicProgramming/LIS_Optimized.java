package DynamicProgramming;

public class LIS_Optimized
{
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(LIS_Opti(arr));
    }
    public static int LIS_Opti(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > dp[len-1])
            {
                dp[len] = arr[i];
                len++;
            }
            else {
                int ith = Search(dp,0,len-1,arr[i]);
                dp[ith] = arr[i];
            }
        }
        return len;
    }
    private static int Search(int[] dp,int si,int ei,int item)
    {
        int ans = 0;
        while(si <= ei)
        {
            int mid = si + (ei-si)/2;
            if(dp[mid] >= item)
            {
                ans = mid;
                ei = mid-1;
            }
            else {
                si = mid + 1;
            }
        }
        return ans;
    }
}
