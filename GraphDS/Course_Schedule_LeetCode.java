package GraphDS;

import java.util.*;

public class Course_Schedule_LeetCode
{
    class Solution
    {
        public boolean canFinish(int numCourses,int[][] pre)
        {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for(int i=0;i<numCourses;i++)
            {
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<pre.length;i++)
            {
                int v1 = pre[i][0];
                int v2 = pre[i][1];
                map.get(v2).add(v1);
            }
            return TopologicalSort(map);
        }
        public boolean TopologicalSort(HashMap<Integer, List<Integer>> map)
        {
            int[] in = Indegree(map);
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<in.length;i++)
            {
                if(in[i] == 0)
                {
                    queue.add(i);
                }
            }
            int ctr =0;
            while(!queue.isEmpty())
            {
                int rv = queue.remove();
                ctr++;
                System.out.print(rv+" ");
                for(int neighbour : map.get(rv))
                {
                    in[neighbour]--;
                    if(in[neighbour] == 0)
                    {
                        queue.add(neighbour);
                    }
                }

            }
            return ctr == map.size();
        }

        public int[] Indegree(HashMap<Integer, List<Integer>> map)
        {
            int[] in = new int[map.size()];
            for(int key : map.keySet())
            {
                for(int neighbour : map.get(key))
                {
                    in[neighbour]++;
                }
            }
            return in;
        }
    }
}
