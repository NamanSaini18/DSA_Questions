package com.Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
//        int f1 = fib(n-1);
//        int f2 = fib(n-2);
        return fib(n-1) + fib(n-2);


    }
}
