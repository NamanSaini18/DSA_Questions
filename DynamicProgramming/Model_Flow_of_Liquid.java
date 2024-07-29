package DynamicProgramming;

import java.util.Scanner;

public class Model_Flow_of_Liquid
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solve(arr,n/2,n/2,n);

    }
    public static void Solve(int[][] arr,int sr,int sc,int n)
    {
        int res = arr[sr][sc];
        int[][] ans = arr;
        ans[sr][sc] = -1;
        int tempr = n/2,tempc = n/2;
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};

        while(!Reach_End)
        {
            DFS(sr,sc,arr,ans,drow,dcol,res,tempr,tempc);
            res++;
            sr = tempr;
            sc = tempc;
        }

        if(Reach_End)
        {
            print(ans);
        }

    }

    static boolean Reach_End = false;

    public static void DFS(int r,int c,int[][] arr,int[][] ans,int[] drow,int[] dcol,int res,int tempr,int tempc)
    {
        ans[r][c] = -1;
        int n = arr.length-1;
        if(r==0 || r==n-1 || c==0 || c==n-1)
        {
            Reach_End = true;
            return;

        }
        tempr = r;
        tempc = c;

        for (int i = 0; i < 4; i++) {
            int nrow = r + drow[i];
            int ncol = c + dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && ans[nrow][ncol]!=-1 &&  arr[nrow][ncol]<res)
            {
                DFS(nrow ,ncol ,arr, ans , drow ,dcol ,res ,tempr ,tempc);
            }
        }


    }
    static void print(int[][] ans)
    {
        int n = ans.length-1;
        char arr[][] = new char[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(ans[i][j] == -1)
                {
                    arr[i][j] = 'W';
                }
                else {
                    arr[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        
        
    }
}
