package TRIE;

import java.util.Scanner;

public class Minimize_XOR
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(XOR(num1,num2));
    }
    public static int XOR(int num1,int num2)
    {
        int count = SetBit(num2);
        int ans = 0;
        for (int i = 31; i >= 0 && count > 0; i--)
        {
            if((num1 & (1 << i)) != 0)
            {
                ans += (1 << i);
                count--;

            }

        }
        for (int i = 0; i <=31 && count > 0; i++) {
            if((num1 & ( 1 << i)) == 0)
            {
                ans += (1 << i);
                count--;
            }
        }
        return ans;
    }
    public static int SetBit(int num2)
    {
        int ctr= 0;
        while(num2 > 0)
        {
            num2 = (num2 & (num2 - 1));
            ctr++;
        }
        return ctr;
    }


}
