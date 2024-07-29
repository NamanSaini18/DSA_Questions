package LeetCode;

import java.util.*;

public class Two_Arrays_and_Sum_of_Functions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr1 = new long[n];
        Long[] arr2 = new Long[n];
        for (int i = 0; i < n; i++)
        {
            long x = sc.nextLong();
            arr1[i] = ((i+1) * (n-i) * x);
        }
        for (int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextLong();
        }

        int mod = 998244353;
        long ans = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());


        for(int i=0;i<n;i++)
        {
            ans = (ans + (arr1[i] % mod) * (arr2[i]));
            ans %= mod;
        }
        System.out.println(ans);


    }



}
