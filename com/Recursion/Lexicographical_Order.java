package com.Recursion;

import java.util.Scanner;

public class Lexicographical_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 0;
        LexicalOrder(curr,n);
    }
    public static void LexicalOrder(int curr, int n) {
        if (curr > n)
        {
            return;
        }
        System.out.print(curr+" ");

        int i = 0;
        if(curr == 0)
        {
            i=1;

        }
        for(;i<=9;i++)
        {
            LexicalOrder(curr*10+i,n);
        }
    }
}
