package GraphDS;

import java.util.*;

public class MST_0_1
{
    private final HashMap<Integer, List<Integer>> map = new HashMap<>();

    public MST_0_1(int v)
    {
        for (int i = 1; i <= v; i++)
        {
            map.put(i,new ArrayList<>());
        }
    }

    public void AddEdge(int v1,int v2)
    {
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }
    public int PrimsAlgo()
    {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost-o2.cost;
            }
        });
        pq.add(new PrimsPair(1,1,0));
        HashSet<Integer> visited = new HashSet<>();
        int sum = 0;

        while(!pq.isEmpty())
        {
            PrimsPair rv = pq.poll();
            if(visited.contains(rv.vtx))
            {
                continue;
            }
            visited.add(rv.vtx);
            sum += rv.cost;
            for(int neighbour=1;neighbour<=map.size();neighbour++)
            {
                if(!visited.contains(neighbour))
                {
                    int cost = 0;
                    if(map.get(rv.vtx).contains(neighbour))
                    {
                        cost = 1;
                    }
                    pq.add(new PrimsPair(neighbour,rv.vtx,cost));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        MST_0_1 mst = new MST_0_1(n);
        for (int i = 0; i < m; i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            mst.AddEdge(v1,v2);
        }
        System.out.println(mst.PrimsAlgo());

    }
    public class PrimsPair
    {
        int vtx;
        int acqvtx;
        int cost;

        public PrimsPair(int vtx,int acqvtx,int cost)
        {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;


        }
        public String toString()
        {
            return this.vtx + " " + this.acqvtx + " @ " + this.cost;
        }
    }
}
