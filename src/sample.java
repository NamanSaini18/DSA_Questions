import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fibonacci(n);
        System.out.println(ans);
    }
    static int Fibonacci(int n)
    {
        // Base Condition
        if(n<2)
        {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
