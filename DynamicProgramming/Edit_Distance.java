package DynamicProgramming;

public class Edit_Distance
{
    public static void main(String[] args)
    {
        String s1 = "horse";
        String s2 = "ros";
        System.out.println(MinOps(s1,s2,0,0));
    }
    public static int MinOps(String s1,String s2,int i,int j)
    {
        int res = 0;
        if(i == s1.length())
        {
            return s2.length()-j;
        }
        if(j == s2.length())
        {
            return s1.length()-i;
        }
        if(s1.charAt(i) == s2.charAt(i))
        {
            res = res + MinOps(s1,s2,i+1,j+1);
        }
        else {
            int I = MinOps(s1,s2,i,j+1);
            int D = MinOps(s1,s2,i+1,j);
            int R = MinOps(s1,s2,i+1,j+1);
            res = Math.min(I,Math.min(D,R))+1;
        }
        return res;
    }

}
