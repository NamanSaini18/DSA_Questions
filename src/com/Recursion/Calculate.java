package com.Recursion;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the exponent ");
        int exp = sc.nextInt();
        System.out.println(Exponent(num,exp));
    }
    public static int Exponent(int num,int exp)
    {
        if(exp == 0)
        {
            return 1;
        }
        // 1 recursion ek recursive call ke barabar hoga..
        // Ek Recursive call ek for loop ke barabar hoga..
        // Head Recursion
        else if (exp%2==0) {
            return Exponent(num, exp / 2) * Exponent(num, exp / 2);
        }
        else {
            return num * Exponent(num, exp / 2) * Exponent(num, exp / 2);
        }
    }
}
