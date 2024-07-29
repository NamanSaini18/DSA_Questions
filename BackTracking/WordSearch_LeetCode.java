package BackTracking;

import java.util.Scanner;

public class WordSearch_LeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean res = WordSearch(board,i,j,word,0);
                    if(res)
                    {
                        System.out.println(res);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    private static boolean WordSearch(char[][] board,int cr,int cc,String word,int idx)
    {
        if(idx == word.length())
        {
            return true;
        }
        if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length)
        {
            return false;
        }
        board[cr][cc] = '*';
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        for(int i=0;i<c.length;i++)
        {
            boolean ans = WordSearch(board,cr+r[i],cc+c[i],word,idx+1);
            if(ans)
            {
                return ans;
            }

        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}
