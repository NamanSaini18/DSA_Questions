package com.Recursion;

import java.util.Scanner;

public class arrayQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,4,1,3,7,3,6};
        System.out.println("Enter the value that you want to search in the array: ");
        int item = sc.nextInt();
        System.out.println(FindIndex(arr,item,arr.length-1));
    }
    public static int FindIndex(int[] arr,int item,int idx)
    {
        if(idx<0)
        {
            return -1;
        }
        if(arr[idx] == item)
        {
            return idx;
        }
        else {
            return FindIndex(arr,item,idx-1);
        }

    }
}

