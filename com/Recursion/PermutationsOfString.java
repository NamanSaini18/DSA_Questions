package com.Recursion;

import java.util.Scanner;
//Debug krke dekhna hai


public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
//        Permutation(str,ans);
        PermutationWithDuplicates(str,ans);
    }
    public static void Permutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            Permutation(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
        }
    }
    public static void PermutationWithDuplicates(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            boolean flag = false;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(j) == str.charAt(i))
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                PermutationWithDuplicates(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
            }
        }



    }
}
