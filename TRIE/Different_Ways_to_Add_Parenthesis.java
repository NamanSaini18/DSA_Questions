package TRIE;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parenthesis
{
    public static void main(String[] args)
    {
        String str = "2*3-4*5";
        System.out.println(Different_Ways(str));
    }
    public static List<Integer> Different_Ways(String str)
    {
        if(str.indexOf('+') == -1 && str.indexOf('-') == -1 && str.indexOf('*') == -1)
        {
            List<Integer> ls = new ArrayList<>();
            ls.add(Integer.parseInt(str));
            return ls;

        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isOperator(ch))
            {
                List<Integer> left = Different_Ways(str.substring(0,i));
                List<Integer> right = Different_Ways(str.substring(i+1));
                for(int a : left)
                {
                    for(int b : right)
                    {
                        int val = Calculation(a,b,ch);
                        ans.add(val);
                    }
                }
            }
        }
        return ans;

    }
    public static boolean isOperator(char ch)
    {
        return ch == '+' || ch == '-' || ch == '*';
    }

    public static int Calculation(int a,int b,char ch)
    {
        if(ch == '+')
        {
            return a+b;
        }
        else if(ch == '-')
        {
            return a-b;
        }
        else
        {
            return a*b;
        }
    }



}
