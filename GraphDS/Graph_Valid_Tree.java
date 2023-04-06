package GraphDS;

import java.util.*;

public class Graph_Valid_Tree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public boolean ValidTree(int n,int[][] edges)
    {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return isValid(map);
    }
    public boolean isValid(HashMap<Integer,List<Integer>> map)
    {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int src : map.keySet())
        {
            if(visited.contains(src))
            {
                continue;
            }
            count++;
            stack.push(src);
            while (!stack.isEmpty()) {

                int rv = stack.pop();
                if (visited.contains(rv)) {
                    return false;
                }
                visited.add(rv);
                for (int neighbour : map.get(rv)) {
                    if (!visited.contains(neighbour)) {
                        stack.push(neighbour);
                    }
                }

            }
        }
        return count == 1;
    }
}
