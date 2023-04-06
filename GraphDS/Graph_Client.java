package GraphDS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Client
{
    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.AddEdge(1,4,6);
        graph.AddEdge(1,2,10);
        graph.AddEdge(2,3,7);
        graph.AddEdge(3,4,5);
        graph.AddEdge(4,5,1);
        graph.AddEdge(5,6,4);
        graph.AddEdge(7,5,2);
        graph.AddEdge(6,7,3);

//        graph.display();
//        graph.RemoveVertex(4);
//        System.out.println();
        graph.display();

        System.out.println(graph.hasPath(1,6,new HashSet<>()));
        graph.PrintAllPath(1,6,new HashSet<>(),"");

        System.out.println(graph.BFSTraversal(1,6));
        System.out.println(graph.DFSTraversal(1,6));

        graph.BFT();
        System.out.println();
        graph.DFT();

    }
}


