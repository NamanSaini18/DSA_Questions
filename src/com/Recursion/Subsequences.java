package com.Recursion;

import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of which you want to check the subsequences: ");
        String str = sc.next();
//        String ans = "";

        PrintSubsequences(str," ");
    }
    public static void PrintSubsequences(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        PrintSubsequences(str.substring(1),ans);
        PrintSubsequences(str.substring(1),ans+ch);
    }
}
