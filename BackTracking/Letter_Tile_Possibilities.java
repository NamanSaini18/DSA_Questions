package BackTracking;

import java.util.Scanner;

public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i)-'A';
            freq[idx]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i]+" ");
        }
        Tile_Possibilities(freq,"");
    }
    public static int Tile_Possibilities(int[] freq,String ans)
    {
//        System.out.println(ans);
        int ctr=0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>=1)
            {
                char ch = (char) (i+'A');
                freq[i]--;
                ctr += Tile_Possibilities(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return ctr;
    }
}
