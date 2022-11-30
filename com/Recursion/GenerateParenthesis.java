package com.Recursion;

import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        generateParenthesis(n,0,0,"");
    }
    public static void generateParenthesis(int n,int open, int close,String ans)
    {
        if(open == n && close == n)
        {
            System.out.println(ans);
        }
        if(open < n)
        {
            generateParenthesis(n,open+1,close,ans+"(");

        }
        if(open>close)
        {
            generateParenthesis(n,open,close+1,ans+")");
        }


    }
}
