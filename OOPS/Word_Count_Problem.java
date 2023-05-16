package OOPS;

import java.util.Scanner;

public class Word_Count_Problem
{
    public static void main(String[] args)  // Naman Saini
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your sentence: ");
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        System.out.println("No of words in given sentence is: "+arr.length);
    }
}
