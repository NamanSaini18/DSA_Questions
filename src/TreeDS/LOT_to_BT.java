package TreeDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LOT_to_BT
{
    public class Node
    {
        int val;
        Node left;
        Node right;
    }
        private Node root;
        Scanner sc = new Scanner(System.in);
        public LOT_to_BT()
        {
            this.root = CreateTree();
        }
        private Node CreateTree()
        {
            Queue<Node> queue = new LinkedList<>();
            Node newNode = new Node();
            int val = sc.nextInt();
            newNode.val = val;
            root = newNode;
            queue.add(newNode);
            while(!queue.isEmpty())
            {
                Node nn = queue.remove();
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                if(c1 != -1)
                {
                    Node node = new Node();
                    node.val = c1;
                    nn.left = node;
                    queue.add(node);
                }
                if(c2!= -1)
                {
                    Node node = new Node();
                    node.val = c1;
                    nn.right = node;
                    queue.add(node);
                }
            }
            return newNode;
        }
    }

