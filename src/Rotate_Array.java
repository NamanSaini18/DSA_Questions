import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k upto where you want to rotate array in right: ");
        int k= sc.nextInt();
        Rotate(arr,k);
        System.out.println("Reversed Array upto the value of k is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate(int[] arr,int k)
    {
        int n = arr.length;
        k=k%n;
        while(k>0)
        {
            int temp=arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
    }
}
