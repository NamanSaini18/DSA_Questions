import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
    public static boolean isPrime(int n)
    {
        // TLE will occur in CodeForces
        int div = 2;
        while(div*div<=n)
        {
            if(n%div==0)
            {
                return false;
            }
            div++;
        }
        return true;
    }
}
