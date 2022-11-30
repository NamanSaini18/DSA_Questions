import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);

    }
    static void pattern1(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        int N=2*n-1;
        for(int i=1;i<=N;i++)
        {
            if(i>n)
            {
                for(int j=1;j<=2*(n)-i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else {
                for(int k=1;k<=i;k++)
                {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
    static void pattern4(int n)
    {
        for(int i=1;i<=2*n;i++)
        {
            int total = i>n? 2*n-i:i;

            int spaces=n-total;
            for(int s=0;s<spaces;s++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=0;s<n-i;s++)
            {
                System.out.print("  ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n)
    {
        int N=n;
        n= 2*n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int index= N-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
