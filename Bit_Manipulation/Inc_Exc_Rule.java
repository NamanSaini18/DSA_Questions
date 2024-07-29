package Bit_Manipulation;

public class Inc_Exc_Rule
{
    public static void main(String[] args) {
        int n = 1000;
        int[] arr = {2,3,5};
        System.out.println(count(n,arr));
    }
    public static int count(int n,int[] arr)
    {
        int ans = 0;
        for (int i = 1; i < (1 << arr.length); i++) {
            int ctr = CountNumber(i,n,arr);
            if(countSetBit(i) % 2 == 0)
            {
                ans -= ctr;
            }
            else {
                ans += ctr;
            }

        }
        return ans;
    }

    public static int CountNumber(int i, int n, int[] arr)
    {
        int prod = 1;
        int pos = 0;
        while(i > 0)
        {
            if((i & 1) != 0)
            {
                prod *= arr[pos];

            }
            i >>= 1;
            pos++;
        }
        return n/prod;

    }


    public static int countSetBit(int n)
    {
        int ctr = 0;
        while(n > 0)
        {
            n = ( n & (n - 1));
            ctr++;
        }
        return ctr;
    }
}
