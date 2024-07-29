package LeetCode;

public class isAnagram
{
    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
            arr[c1-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            char c2 = t.charAt(i);
            if(arr[c2-'a'] == 0)
            {
                return false;
            }
            else {
                arr[c2-'a']--;
            }

        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2 == 1)
            {
                return false;
            }

        }

        return true;
    }
}
