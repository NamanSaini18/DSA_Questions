package com.Recursion;

import java.util.Scanner;

public class TwoHeadsAreNotTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintOutcomes(n," ");
    }
    public static void PrintOutcomes(int n,String ans)
    {

        if(n==0)
        {
            System.out.println(ans+" ");
            return;
        }
        if(ans.charAt(ans.length()-1) != 'H' || ans.length() == 0)
        {
            PrintOutcomes(n-1,ans+'H');

        }
        PrintOutcomes(n-1,ans+'T');
    }
}
