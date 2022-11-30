import java.util.Scanner;

public class DivisibleSubarrays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(divisiblesubarray(arr));
        }
    }
    public static long divisiblesubarray(long[] arr)
    {
        long sum=0;
        long[] freq = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int idx = (int)(sum%arr.length);
            if(idx<0)
            {
                idx = idx+arr.length;
            }
            freq[idx]++;
        }
        freq[0]++;
        sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(freq[i]>=2)
            {
                sum += freq[i]*(freq[i]-1)/2;
            }

        }
        return sum;
    }

}
