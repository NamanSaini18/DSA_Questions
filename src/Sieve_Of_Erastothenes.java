import java.util.Scanner;

public class Sieve_Of_Erastothenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        PrimeSieve(n);
    }
    public static void PrimeSieve(int n)
    {
        // If false is set at any index then that index is considered as prime number
        // If True is set at any index then that index will not be considered as the prime number
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i] == false)
            {
                for(int j=2;i*j<=n;j++)
                {
                    arr[i*j] = true; // Not Prime set kiya hai
                }
            }
        }
        System.out.println("Prime Numbers between 1 to"+" "+n+" "+"are"+" ");

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i] == false)
            {
                System.out.print(i+" ");
            }
        }
    }
}
