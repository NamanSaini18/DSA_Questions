package GraphDS;

import java.util.*;

public class Dijkstra_Algorithm
{
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Dijkstra_Algorithm(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    private class DijkstraPair
    {
        int vtx;
        String path;
        int weight;
        public DijkstraPair(int vtx,String path,int weight)
        {
            this.vtx = vtx;
            this.path = path;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "{" +
                    "vtx=" + this.vtx +
                    ", path='" + this.path + '\'' +
                    ", weight=" + this.weight +
                    '}';
        }
    }

    public void Cost()
    {
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {

                return o1.weight - o2.weight;

            }
        });
        Set<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(1,"1",0));

        while(!pq.isEmpty())
        {
            DijkstraPair rp = pq.remove();
            if(visited.contains(rp.vtx))
            {
                continue;
            }
            visited.add(rp.vtx);
            System.out.println(rp);
            for(int neighbour : map.get(rp.vtx).keySet())
            {
                if(!visited.contains(neighbour))
                {
                    int cost = rp.weight + map.get(rp.vtx).get(neighbour);
                    pq.add(new DijkstraPair(neighbour,rp.path+neighbour,cost));
                }
            }
        }

    }
    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);  // v1 --> v2
        map.get(v2).put(v1, cost);  // v2 --> v1
    }

    public static void main(String[] args)
    {
        Dijkstra_Algorithm graph = new Dijkstra_Algorithm(7);

        graph.AddEdge(1,4,6);
        graph.AddEdge(1,2,10);
        graph.AddEdge(2,3,7);
        graph.AddEdge(3,4,5);
        graph.AddEdge(4,5,1);
        graph.AddEdge(5,6,4);
        graph.AddEdge(7,5,2);
        graph.AddEdge(6,7,3);

        graph.Cost();

    }


}
