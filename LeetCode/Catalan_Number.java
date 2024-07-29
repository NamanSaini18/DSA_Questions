package LeetCode;
import java.util.*;

public class Catalan_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CatalanNumber(n));

    }
    public static int CatalanNumber(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        int ans = 0;
        for (int i = 1; i <= n ; i++)
        {
            ans = ans + (CatalanNumber(i-1) * CatalanNumber(n-i));

        }
        return ans;
    }
}
