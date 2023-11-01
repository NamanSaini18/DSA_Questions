package LeetCode;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.*;

public class Additive_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        List<BigInteger> list = new LinkedList<>();
        System.out.println(Is_Additive(num,list));

    }
    public static boolean Is_Additive(String que, List<BigInteger> list)
    {
        if(que.length() == 0)
        {
            if(list.size() >= 3)
            {

                return true;

            }
            return false;
        }
        for(int i=1;i<=que.length();i++)
        {
            String s1 = que.substring(0,i);

            if(Nonleading(s1) && validAdditive(list,s1))
            {
                list.add(new BigInteger(s1));
                boolean ans = Is_Additive(que.substring(i),list);
                if(ans)
                {
                    return ans;
                }

                list.remove(list.size() - 1);
            }
        }
        return false;
    }
    public static boolean Nonleading(String s)
    {
        if(s.length() == 1)
        {
            return true;
        }
        return s.charAt(0) != '0';
    }
    public static boolean validAdditive(List<BigInteger> list,String s)
    {
        if(list.size() <= 1)
        {
            return true;
        }
        BigInteger a = list.get(list.size() - 1);
        BigInteger b = list.get(list.size() - 2);
        BigInteger c = new BigInteger(s);

        BigInteger sum = a.add(b);
        return sum.equals(c);
    }

}
