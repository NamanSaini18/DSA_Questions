package com.Recursion;

import java.util.Scanner;

public class PrintIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();
        Print(n);
        printReverse(n);
    }
    public static void Print(int n)
    {
        if(n == 0)
        {
            return;
        }
        Print(n-1);
        System.out.println(n);
//        Print(n-1);

    }
    public static void printReverse(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printReverse(n-1);
        System.out.println(n);
    }
}
