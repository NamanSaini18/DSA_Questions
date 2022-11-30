import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of sliding window: ");
        int k = sc.nextInt();
        System.out.println("The maximum sum of the subarray of the required size of Sliding Window is: ");
        System.out.println(SlidingWindow(arr,k));

    }
    // Sliding Window Protocol
    public static int SlidingWindow(int[] arr,int k)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum += arr[i];
        }
        int ans = sum;
        for(int i=k;i<arr.length;i++)
        {
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
