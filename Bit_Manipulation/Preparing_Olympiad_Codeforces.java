package Bit_Manipulation;

import java.util.Scanner;

public class Preparing_Olympiad_Codeforces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countContest(arr,l,r,x));

    }
    public static int countContest(int[] arr,int l,int r,int x)
    {
        int ans = 0;
        int n = arr.length;
        for (int i = 3; i < (1<<n); i++) {
            if(countSetBit(i) >= 2)
            {
                if(IsItPossible(arr,l,r,x,i))
                {
                    ans++;
                }
            }

        }
        return ans;
    }

    public static boolean IsItPossible(int[] arr,int l,int r,int x,int i)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum = 0;
        int pos = 0;
        while(i > 0)
        {
            if((i & 1 ) != 0)
            {
                sum += arr[pos];
                min = Math.min(min,arr[pos]);
                max = Math.max(max,arr[pos]);

            }
            i >>= 1;
            pos++;
        }
        return sum >= l && sum <= r && (max - min >= x);
    }
    public static int countSetBit(int n)
    {
        int ctr = 0;
        while(n > 0)
        {
            n = ( n & (n - 1));
            ctr++;
        }
        return ctr;
    }
}
