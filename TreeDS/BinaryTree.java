//package TreeDS;
//
//import java.util.Scanner;
//class Node
//{
//    int data;
//    Node left;
//    Node right;
//    Node()
//    {
//
//    }
////    Node(int data)
////    {
////        this.da = d;
////    }
////    Node(int data)
//    {
//        this.data = data;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//public class BinaryTree
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//
//
//    }
//    public int Max()
//    {
//        return Max(root);
//    }
//    private int Max(Node node)
//    {
//        if(root == null)
//        {
//            return Integer.MIN_VALUE;
//        }
//        int left = Max(node.left);
//        int right = Max(node.right);
//        return Math.max(left,Math.max(right,node.data));
//    }
//    public int height()
//    {
//        return height(root);
//    }
//    private int height(Node node)
//    {
//        if(node == null)
//        {
//            return -1;        // Base case 0 return krega to single node ki height 1 aaygi
//        }
//        int left = height(node.left);
//        int right = height(node.right);
//        return Math.max(left,right)+1;
//    }
//}
