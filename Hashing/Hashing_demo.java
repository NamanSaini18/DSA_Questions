package Hashing;

public class Hashing_demo
{
    public static void main(String[] args)
    {
        String str = "banana";
        System.out.println(hashcode(str));
    }
    public static int hashcode(String s)
    {
        long mod = 1000_000_007;
        long pow = 1;
        long ans = 0;
        int pr = 31;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            ans = (ans + ((ch-'a'+1)*pow)%mod) % mod;
            ans = (ans + mod) % mod;
            pow = (pow*pr)%mod;
        }
        return (int)(ans);
    }
}
