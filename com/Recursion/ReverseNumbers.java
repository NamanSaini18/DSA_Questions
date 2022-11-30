package com.Recursion;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse(n);
    }
    public static void Reverse(int n)
    {
        // Grow karte hue answer bn rha hai stack me
        // Or Factorial me Vapas aate hue bn rha tha
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Reverse(n-1);
    }
}
