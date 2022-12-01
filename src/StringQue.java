import java.util.Scanner;

public class StringQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<=str.length();j++)
            {
                int k = j-i;
                System.out.println(str.substring(k,j));
            }
        }
        System.out.println(str);

    }
}
