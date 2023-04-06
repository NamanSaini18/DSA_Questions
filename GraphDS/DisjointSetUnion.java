package GraphDS;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.*;

public class DisjointSetUnion
{
    class Node
    {
        int vtx;
        Node parent;
        int rank;

        public Node(int vtx)
        {
            this.vtx = vtx;
        }
    }
    HashMap<Integer,Node> map = new HashMap<Integer, Node>();
    public void CreateSet(int v)
    {
        Node newNode =  new Node(v);
        newNode.vtx = v;
        newNode.parent= newNode;
        newNode.rank = 0;

        map.put(v,newNode);

    }
    public int find(int v)
    {
        Node nn = map.get(v);
        return find(nn).vtx;
    }
    private Node find(Node nn)
    {
        if(nn.parent == nn)
        {
            return nn;
        }
        return find(nn.parent);
    }
    
}