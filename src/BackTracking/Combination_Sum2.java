package BackTracking;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Combination_Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target: ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        CombinationSum2(arr,target,"",0);

    }
    public static void CombinationSum2(int[] arr,int target,String res,int idx)
    {
        if(target == 0)
        {
            System.out.println(res);
            return;
        }
        for (int i = idx; i < arr.length ;i++) {
            if(i != idx && arr[i]==arr[i-1])
            {
                continue;
            }
            if(target >= arr[i])
            {
                CombinationSum2(arr,target-arr[i],res+arr[i]+" ",i+1);
            }
        }
    }
}
