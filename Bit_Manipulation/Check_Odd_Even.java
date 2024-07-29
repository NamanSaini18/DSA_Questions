package Bit_Manipulation;

public class Check_Odd_Even
{
    public static void main(String[] args)
    {
        int n = 71;
        int num = -5;
        System.out.println(num>>2);
        if((n&1) > 0)
        {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    }
}
