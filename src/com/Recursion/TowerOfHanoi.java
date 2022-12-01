package com.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        String src = "A";
        String hlp = "B";
        String des = "C";
        TowerOfHanoi(n,src,hlp,des);

        System.out.println("Tower Of Hanoi Problem Solved Successfully :)");
    }
    public static void TowerOfHanoi(int n,String src,String hlp,String des)
    {
        if(n==0)
        {
            return;
        }
        TowerOfHanoi(n-1,src,des,hlp);
        System.out.println("Move"+" "+n+"th disc from"+" "+ src+" "+"to"+" "+des);

        TowerOfHanoi(n-1,hlp,src,des);

    }
}
