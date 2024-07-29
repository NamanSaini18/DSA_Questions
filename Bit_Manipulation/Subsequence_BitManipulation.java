package Bit_Manipulation;

public class Subsequence_BitManipulation
{
    public static void main(String[] args)
    {
        String str = "abc";
        subsequence(str);

    }

    public static void subsequence(String str)
    {
        int n = str.length();
        for (int i = 0; i < (1<<n); i++) {
            pattern(i,str);


        }
    }

    static void pattern(int i,String str)
    {
        int pos = 0;
        while(i > 0)
        {
            if((i & 1) != 0)
            {
                System.out.println(str.charAt(pos));
            }
            i >>= 1;
            pos++;
        }
        System.out.println();
    }
}
