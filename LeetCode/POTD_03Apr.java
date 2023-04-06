package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class POTD_03Apr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the limit of people: ");
        int limit = sc.nextInt();
        int res = numRescueBoats(arr,limit);
        System.out.println("The minimum number of boats required is: ");
        System.out.println(res);
    }
    public static int numRescueBoats(int[] people, int limit) {
        int num = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;

        // Two Pointers Approach
        while(i <= j)
        {
            if(people[j] + people[i] <= limit)
            {
                i++;
            }
            j--;
            num++;
        }
        return num;
    }
}
