package BackTracking;

import java.util.Scanner;

public class Partititon_In_Array {
    //Place last element of array at its original position
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = partition(arr,0,arr.length-1);
        System.out.println(ans);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr,int si,int ei)
    {
        int item = arr[ei];
        int pi = si;
        for(int i=si;i<ei;i++)
        {
            if(arr[i]<item)
            {
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;
        pi++;

        return pi;
    }
}
