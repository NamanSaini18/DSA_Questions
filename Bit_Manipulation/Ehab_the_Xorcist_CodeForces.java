package Bit_Manipulation;

import java.util.Scanner;

public class Ehab_the_Xorcist_CodeForces
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long u = sc.nextLong();
        long v = sc.nextLong();

        long x=(v-u)/2;
        if(u==0 && v==0){
            System.out.println(0);
        }
        else if(u==v){
            System.out.println(1);
            System.out.println(v);
        }
        else if(u>v || (v-u)%2==1){
            System.out.println(-1);
        }
        else if((u&x)==0) {
            System.out.println(2);
            System.out.println((u + x) + " " + x);
        }else{
            System.out.println(3);
            System.out.println(u+" "+x+" "+x);
        }
    }
}


//https://codeforces.com/problemset/problem/1325/D


