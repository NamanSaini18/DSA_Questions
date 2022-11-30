package com.Recursion;

import javax.swing.plaf.TableUI;
import java.util.Scanner;

public class TailRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of required number is: ");
        System.out.println(TailRecursion(n,1));
    }
    public static int TailRecursion(int n,int a)
    {

        if(n==0)
        {
            return 1;
        }
        else if(n == 1)
        {
            return a;
        }
        // Factorial is Calculated using Tail recursion
        else
        {
            return TailRecursion(n-1,n*a);
        }

    }
}
