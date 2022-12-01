import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        if(marks>75)
        {
            System.out.println("A grade");
        }
        else if(marks<75 && marks>=65)
        {
            System.out.println("B grade");
        }
        else if(marks<65 && marks>=55)
        {
            System.out.println("C grade");
        }
        else if(marks<55 && marks>=45)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("Fail");
        }



    }
}
