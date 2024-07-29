import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] stalls = new int[n];
            for (int i = 0; i < stalls.length; i++) {
                stalls[i] = sc.nextInt();
            }
            Arrays.sort(stalls);
            System.out.println(LMD(stalls,c));

        }

    }
    public static int LMD(int[] stalls,int c)
    {
        int lo=1;
        int ans=0;
        int hi = stalls[stalls.length-1] - stalls[0];
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if(IsItPossible(stalls, mid, c))
            {
                ans=mid;
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        return ans;
    }
    private static boolean IsItPossible(int[] stalls,int mid,int c)
    {
        int cow=1;
        int position=stalls[0];
        int i=1;
        while(i< stalls.length)
        {
            if(stalls[i]-position>=mid)
            {
                cow++;
                position=stalls[i];
            }
            if(cow>=c)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
