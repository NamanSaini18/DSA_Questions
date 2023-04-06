package GraphDS;

import java.util.*;
import java.util.Scanner;

public class Longest_Cycle_In_Graph
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    }

    public int longestCycle(int[] edges)
    {
        int[] in = new int[edges.length];
        for(int i = 0; i < in.length; i++)
        {
            if(edges[i] != -1)
            {
                in[edges[i]]++;
            }
        }
        boolean[] vis = new boolean[edges.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i] == 0)
            {
                queue.add(i);
            }
        }
        while(!queue.isEmpty())
        {
            int remove = queue.poll();
            vis[remove] = true;

            int nbrs = edges[remove];
            if(nbrs != -1)
            {
                in[nbrs]--;
                if(in[nbrs] == 0)
                {
                    queue.add(nbrs);
                }
            }

        }
        // Counting Part
        int ans = -1;
        for (int i = 0; i < vis.length; i++) {
            if(!vis[i])
            {
                int ctr = 1;
                int nbrs = edges[i];
                vis[i] = true;
                while(nbrs != -1)
                {
                    vis[nbrs] = true;
                    ctr++;
                    nbrs = edges[nbrs];
                }
                ans = Math.max(ans,ctr);
            }
        }
        return ans;
    }

}

// kirchoff Theory
