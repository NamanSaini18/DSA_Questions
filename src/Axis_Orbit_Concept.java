/* Given a string s, return the number of palindromic substrings in it.
        A string is a palindrome when it reads the same backward as forward.
        A substring is a contiguous sequence of characters within the string. */
import java.util.Scanner;

public class Axis_Orbit_Concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

    }
    public static int CountPalindromic(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() && i-j>=0 && i+j<str.length(); j++) {
                if(str.charAt(i-j) != str.charAt(i+j))
                {
                    break;
                }
                count++;
                
            }
            
        }
        // For EVEN String
        for (double i = 0; i < str.length(); i++) {
            for (double j = 0; j < str.length() && i-j>=0 && i+j<str.length(); j++) {
                if(str.charAt((int)(i-j)) != str.charAt((int)(i+j)))
                {
                    break;
                }
                count++;

            }

        }
        return count;
    }
}
