package GraphDS;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);  // v1 --> v2
        map.get(v2).put(v1, cost);  // v2 --> v1

    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int NoofEdges() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    public void RemoveEdge(int v1, int v2) {
        if (ContainsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }

    }

    public void RemoveVertex(int v1) {
        for (int key : map.get(v1).keySet()) {
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + "-> " + map.get(key));
        }
    }

    public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
        if (src == dest) {
            return true;
        }
        visited.add(src);
        for (int neighbour : map.get(src).keySet()) {
            if (!visited.contains(neighbour)) {
                boolean ans = hasPath(neighbour, dest, visited);
                if (ans) {
                    return true;
                }
            }

        }
        visited.remove(src);
        return false;
    }

    public void PrintAllPath(int src, int dest, HashSet<Integer> visited, String ans) {
        if (src == dest) {
            return;
        }
        visited.add(src);
        for (int neighbour : map.get(src).keySet()) {
            if (!visited.contains(neighbour)) {
                PrintAllPath(neighbour, dest, visited, ans + src);
            }

        }
        visited.remove(src);

    }

    public boolean BFSTraversal(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        while (!queue.isEmpty()) {
            // Step 1 -> remove
            int rv = queue.poll();
            // Step 2 -> If already visited then ignore
            if (visited.contains(rv)) {
                continue;
            }
            // Step 3 -> Visited
            visited.add(rv);

            // Step 4 -> Self Work
            if (rv == des) {
                return true;
            }

            // Step 5 -> Add Unvisited Neighbours
            for (int neighbour : map.get(rv).keySet()) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }

        }
        return false;
    }
    public boolean DFSTraversal(int src,int des)
    {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(src);
        while (!stack.isEmpty()) {
            // Step 1 -> remove
            int rv = stack.pop();
            // Step 2 -> If already visited then ignore
            if (visited.contains(rv)) {
                continue;
            }
            // Step 3 -> Visited
            visited.add(rv);

            // Step 4 -> Self Work
            if (rv == des)
            {
                return true;
            }

            // Step 5 -> Add Unvisited Neighbours
            for (int neighbour : map.get(rv).keySet()) {
                if (!visited.contains(neighbour)) {
                    stack.push(neighbour);
                }
            }

        }
        return false;
    }
    public void BFT() {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int src : map.keySet())
        {
            if(visited.contains(src))
            {
                continue;
            }
            queue.add(src);
            while (!queue.isEmpty()) {
                // Step 1 -> remove
                int rv = queue.poll();
                // Step 2 -> If already visited then ignore
                if (visited.contains(rv)) {
                    continue;
                }
                // Step 3 -> Visited
                visited.add(rv);

                // Step 4 -> Self Work
                System.out.print(rv + " ");

                // Step 5 -> Add Unvisited Neighbours
                for (int neighbour : map.get(rv).keySet()) {
                    if (!visited.contains(neighbour)) {
                        queue.add(neighbour);
                    }
                }

            }
        }
    }
    public void DFT()
    {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        for(int src : map.keySet())
        {
            stack.push(src);
            while (!stack.isEmpty()) {
                // Step 1 -> remove
                int rv = stack.pop();
                // Step 2 -> If already visited then ignore
                if (visited.contains(rv)) {
                    continue;
                }
                // Step 3 -> Visited
                visited.add(rv);

                // Step 4 -> Self Work
                System.out.print(rv + " ");

                // Step 5 -> Add Unvisited Neighbours
                for (int neighbour : map.get(rv).keySet()) {
                    if (!visited.contains(neighbour)) {
                        stack.push(neighbour);
                    }
                }

            }
        }
    }
}