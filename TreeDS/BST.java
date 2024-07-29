package TreeDS;

public class BST
{
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private final Node root;
    public BST(int [] inorder)
    {
        this.root = CreateTree(inorder,0,inorder.length-1);

    }
    private Node CreateTree(int[] in,int si,int ei)
    {
        if(si > ei)
        {
            return null;
        }

        int mid = (si+ei)/2;
        Node newNode = new Node();
        newNode.val = in[mid];
        newNode.left = CreateTree(in,si,mid-1);
        newNode.right = CreateTree(in,mid+1,ei);

        return newNode;
    }
    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);

    }
    public int BinaryTreeCameras(Node root)
    {



        return -1;
    }


    public static void main(String[] args) {
        int[] in = {10,20,30,40,50,60,70,80,90};
        BST tree = new BST(in);
        tree.PreOrder();
    }
}
