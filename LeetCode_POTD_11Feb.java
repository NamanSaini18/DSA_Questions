import java.util.*;

/*
1129. Shortest Path with Alternating Colors
Medium
2.7K
141
Companies
You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1. Each edge is red or blue in this graph, and there could be self-edges and parallel edges.

You are given two arrays redEdges and blueEdges where:

redEdges[i] = [ai, bi] indicates that there is a directed red edge from node ai to node bi in the graph, and
blueEdges[j] = [uj, vj] indicates that there is a directed blue edge from node uj to node vj in the graph.
Return an array answer of length n, where each answer[x] is the length of the shortest path from node 0 to node x such that the edge colors alternate along the path, or -1 if such a path does not exist.

 

Example 1:

Input: n = 3, redEdges = [[0,1],[1,2]], blueEdges = []
Output: [0,1,-1]
Example 2:

Input: n = 3, redEdges = [[0,1]], blueEdges = [[2,1]]
Output: [0,1,-1]
 

Constraints:

1 <= n <= 100
0 <= redEdges.length, blueEdges.length <= 400
redEdges[i].length == blueEdges[j].length == 2
0 <= ai, bi, uj, vj < n
*/
class Solution4
{
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges)
    {
        List<Integer>[] Red = new ArrayList[n], Blue = new ArrayList[n];

        for(int[] item : red_edges)
        {
            if(Red[item[0]] == null)
            {
                Red[item[0]] = new ArrayList<>();
            }

            Red[item[0]].add(item[1]);
        }
        for(int[] item : blue_edges)
        {
            if(Blue[item[0]] == null)
            {
                Blue[item[0]] = new ArrayList<>();
            }

            Blue[item[0]].add(item[1]);
        }

        Queue<int[]> queue = new LinkedList<>();

        int[] res = new int[n];

        Arrays.fill(res, -1);

        queue.add(new int[]{0, 0});
        int ctr = 0;

        Set<String> set = new HashSet<>();

        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                int[] arr = queue.remove();
                String str = arr[0]+" "+arr[1];

                if(set.contains(str))
                {
                    continue;
                }

                set.add(str);

                if(res[arr[0]] == -1)
                {
                    res[arr[0]] = ctr;
                }

                if(arr[1] == 2 || arr[1] == 0)
                {
                    if(Red[arr[0]] != null)
                    {
                        for(int child : Red[arr[0]])
                        {
                            queue.add(new int[]{child, 1});
                        }

                    }
                }


                if(arr[1] == 1 || arr[1] == 0)
                {
                    if(Blue[arr[0]] != null)
                    {
                        for(int child : Blue[arr[0]])
                        {
                            queue.add(new int[]{child, 2});
                        }

                    }
                }
            }
            ++ctr;
        }
        return res;
    }
}
