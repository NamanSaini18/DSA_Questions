package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(str,list,ans);
        System.out.println(ans);
//        System.out.println(list);
    }
    public static void Partitioning(String que,List<String> list,List<List<String>> ans)
    {
        if(que.length() == 0)
        {
//            System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= que.length(); i++) {
            String s1 = que.substring(0,i);
            if(CheckPalindrome(s1))
            {
                list.add(s1);
                Partitioning(que.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean CheckPalindrome(String str)
    {
        int i=0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
