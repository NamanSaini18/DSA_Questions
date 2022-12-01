import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = sc.next();
            }
            // Arrays.sort(arr);
            // int val = 0;
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if((arr[j]+arr[i]).compareTo(arr[i]+arr[j])>0)
                    {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

}
