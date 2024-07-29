package LeetCode;

import java.util.*;

// Codeforces Question Link: https://codeforces.com/problemset/problem/599/C
public class Day_at_the_Beach
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] left = new int[n+1];
        int[] right = new int[n+1];

        left[0] = -1 * (int) 1e9;
        right[n] = (int) 1e9;
        for (int i = 1; i <= n; i++)
        {
            left[i] = Math.max(left[i-1],arr[i-1]);
        }
        for (int i = n-1; i >= 0; i--)
        {
            right[i] = Math.min(right[i+1],arr[i]);
        }
        // left max < right min
        int ans = 1;
        for (int i = 1;i < n; i++)
        {
            if(left[i] <= right[i+1])
            {
                ans++;
            }
        }
        System.out.println(ans);




    }



}
