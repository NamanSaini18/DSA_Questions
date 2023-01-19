package TreeDS;

import java.util.Scanner;

public class LOT_to_BT {
    private class Node {
        int val;
        Node left;
        Node right;

        Node()
        {

        }
        Node(int data)
        {
            this.val = data;
        }
        Node(int data,Node left,Node right) {
            this.val = data;
            left = right = null;
        }
    }
    class Solution{
        Scanner sc = new Scanner(System.in);

    }
}
