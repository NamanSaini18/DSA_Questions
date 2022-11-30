package BackTracking;
import java.util.*;

public class Rat_Chases_Its_Cheese {
    static boolean f= false;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0;i<maze.length;i++)
        {
            String str = sc.next();
            for(int j=0;j<str.length();j++)
            {
                maze[i][j] = str.charAt(j);
            }

        }
        int[][] ans = new int[n][m];
        HasPath(maze,0,0,ans);
        if(f==false)
        {
            System.out.println("NO PATH FOUND");
        }
    }
    public static void HasPath(char[][] maze,int cc,int cr,int[][] ans)
    {
        if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'X')
        {
            ans[cr][cc] = 1;
            f=true;
            Display(ans);
            return;
        }
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc] == 'X')
        {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        HasPath(maze,cc,cr-1,ans); //up
        HasPath(maze,cc,cr+1,ans); //Down
        HasPath(maze,cc-1,cr,ans); //Left
        HasPath(maze,cc+1,cr,ans); //Right
        maze[cr][cc] = '0';
        ans[cr][cc] = 0;
    }
    public static void Display(int[][] ans)
    {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
