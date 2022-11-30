import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Hello World"; // Memory allocated in String_Pool_Area
//        String s1 = new String("Hello"); //Pool me nhi bnega
//        String s2 = "Hello";
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for(int i=0,j=0;i<Math.min(str1.length(),str2.length());i++,j++)
        {
            if(str1.charAt(i)>str2.charAt(j))
            {
                System.out.println(1);
                return;
            }
            else if(str2.charAt(i)<str2.charAt(j))
            {
                System.out.println(-1);
                return;
            }
        }
        if(str1.length()!=str2.length())
        {

        }


    }
}
