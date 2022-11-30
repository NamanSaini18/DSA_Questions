package com.Recursion;

import java.util.Scanner;

public class Count_Sequences {
//    static int ctr = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
//        PrintSubsequences(s,ans);
        System.out.println();
//        System.out.println(ctr);
        System.out.println(CountSubsequences(s,ans));
    }
    public static void PrintSubsequences(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.print(ans+" ");
//            ctr++;
            return;
        }
        char ch = s.charAt(0);
        PrintSubsequences(s.substring(1),ans);
        PrintSubsequences(s.substring(1),ans+ch);
    }
    public static int CountSubsequences(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = s.charAt(0);
        int ans1 = CountSubsequences(s.substring(1),ans);
        int ans2 = CountSubsequences(s.substring(1),ans+ch);
        return ans1 + ans2;
    }


}
