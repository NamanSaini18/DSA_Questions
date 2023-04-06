package LeetCode;
/*
Given a sorted integer array nums and an integer n,
add/patch elements to the array such that any number in the range [1, n] inclusive can be formed
by the sum of some elements in the array.
Return the minimum number of patches required.
 */
import java.util.Scanner;

public class PatchingArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt(); // [1,n] is the inclusive range


    }
    public int minPatches(int[] arr,int n)
    {
        int missing = 1;
        int ctr = 0;
        int i=0;
        while(missing <= n)
        {
            if(i < arr.length && missing >= arr[i])
            {
                missing += arr[i];
                i++;
            }
            else {
                ctr++;
                missing += missing;
            }
        }
        return ctr;
    }
}

