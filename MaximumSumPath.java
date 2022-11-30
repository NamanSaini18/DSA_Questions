import java.util.Scanner;

public class MaximumSumPath
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[m];
            int[] arr2 = new int[n];
            for(int i=0;i<m;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                arr2[i] = sc.nextInt();
            }
            System.out.println(MaximumPathSum(arr,arr2));
        }
    }
    static int MaximumPathSum(int[] arr,int[] arr2)
    {
        int m = arr.length;
        int n = arr2.length;
        int i=0,j=0;
        int sum1 = 0,sum2 = 0;
        int res = 0;
        while(i<m && j<n)
        {
            if(arr[i] < arr2[j])
            {
                sum1 += arr[i];
                i++;
            }
            else if(arr[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            }
            else {
                res = res + Math.max(sum1,sum2);
                sum1 = 0;
                sum2 = 0;
                while (i<m && j<n && arr[i] == arr2[j])
                {
                    res += arr[i];
                    i++;
                    j++;
                }
            }
        }
        while(i<m)
        {
            sum1 += arr[i];
            i++;
        }
        while(j<n)
        {
            sum2 += arr2[j];
            j++;
        }
        res += Math.max(sum1,sum2);
        return res;
    }

}
