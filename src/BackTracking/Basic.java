package BackTracking;

import java.util.Scanner;
//BackTracking Question 1st by Monu Bhaiya
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Board: ");
        int n = sc.nextInt();
        int tq = 2;
        boolean[] board = new boolean[n]; // By default boolean array is false
        PrintPermutations(board,tq,0,"");
        System.out.println();
        System.out.println();
        PrintCombinations(board,tq,0,"",0);

    }
    public static void PrintPermutations(boolean[] board,int tq,int qpsf,String res)  // tq ->Total No of Queens qpsf-> Queen Placed so far
    {
        if(qpsf == tq)
        {
            System.out.println(res);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i] == false)
            {
                board[i] = true;
                PrintPermutations(board,tq,qpsf+1,res+"b"+i+"q"+qpsf);  // Implicitly BackTracking

                // We have to BackTrack here... So that At every new step the position of Queen in the board is undo
                board[i] = false;   // This is BackTracking
            }
        }

    }
    static void PrintCombinations(boolean[] board,int tq,int qpsf,String res,int idx)
    {
        if(qpsf == tq)
        {
            System.out.println(res);
            return;
        }
        for(int i = idx;i<board.length;i++)
        {
            if(board[i] == false)
            {
                board[i] = true;
                PrintCombinations(board,tq,qpsf+1,res+"b"+i+"q"+qpsf,i+1);
                board[i] = false;

            }
        }

    }
}
