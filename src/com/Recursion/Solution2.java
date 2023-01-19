package com.Recursion;
import java.lang.reflect.Array;
import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int N = 10;
        pattern(N);

    }
    static void pattern(int N){
        // code here
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        ans = PrintPattern(list,N);
        for(int i : ans)
        {
            System.out.println(ans.get(i));
        }
    }
    static List<Integer> PrintPattern(List<Integer> list,int n)
    {
        if(n<1)
        {
            list.add(n);
            return list;
        }
        list.add(n);
        PrintPattern(list,n-5);
        return list;
    }
}
