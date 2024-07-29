package GraphDS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort
{
    private final HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Topological_Sort(int v)
    {
        for(int i = 1;i<=v;i++)
        {
            map.put(i,new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2, cost);  // v1 --> v2
//        map.get(v2).put(v1, cost);  // v2 --> v1
    }

    public void TopologicalSort()
    {
        int[] in = Indegree();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<in.length;i++)
        {
            if(in[i] == 0)
            {
                queue.add(i);
            }
        }
        while(!queue.isEmpty())
        {
            int rv = queue.remove();
            System.out.print(rv+" ");
            for(int neighbour : map.get(rv).keySet())
            {
                in[neighbour]--;
                if(in[neighbour] == 0)
                {
                    queue.add(neighbour);
                }
            }
        }
    }

    public int[] Indegree()
    {
        int[] in = new int[map.size() + 1];
        for(int key : map.keySet())
        {
            for(int neighbour : map.get(key).keySet())
            {
                in[neighbour]++;
            }
        }
        return in;
    }

    public boolean IsCyclePresent()
    {
        Queue<Integer> queue = new LinkedList<>();
        int[] ind = Indegree();

        for (int i = 1; i < ind.length; i++) {
            if (ind[i] == 0) {
                queue.add(i);
            }
        }
        int ctr = 0;
        while (!queue.isEmpty()) {
            int rv = queue.poll();
            ctr++;
            for (int neighbour : map.get(rv).keySet())
            {
                ind[neighbour]--;
                if (ind[neighbour] == 0)
                {
                    queue.add(neighbour);
                }
            }
        }
        return ctr != map.size();

    }

    public static void main(String[] args) {
        Topological_Sort t = new Topological_Sort(8);
        t.AddEdge(1, 2,0);
        t.AddEdge(2, 4,0);
        t.AddEdge(3, 1,0);
        t.AddEdge(3, 2,0);
        t.AddEdge(4, 5,0);
        t.AddEdge(4, 6,0);
        t.AddEdge(5, 6,0);
        t.AddEdge(7, 8,0);


        System.out.println(Arrays.toString(t.Indegree()));
        t.TopologicalSort();
        System.out.println();
//        System.out.println(t.IsCyclePresent());
        if(t.IsCyclePresent())
        {
            System.out.println("Cycle is Present in the graph");
        }
        else
        {
            System.out.println("Cycle is not present ");
        }
    }
}
