package TRIE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Maximum_XOR_with_element_from_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int[][] qr = {{12,4},{8,1},{6,3}};
        Arrays.sort(arr);
        Pair[] p = new Pair[qr.length];
        for (int i = 0; i < p.length; i++)
        {
           p[i] = new Pair(qr[i][0],qr[i][1],i);
        }
        Arrays.sort(p,new Comparator<Pair>()
        {
            @Override
            public int compare(Pair o1,Pair o2)
            {
                return o1.mi - o2.mi;
            }
        });
        Node newNode = new Node();
        int[] ans =  new int[p.length];
        int j = 0;
        for (int i = 0; i < ans.length; i++) {

            while(j < arr.length && arr[j] <= p[i].mi)
            {
                Insert(newNode,arr[j]);
                j++;
            }
            if(j == 0)
            {
                ans[p[i].qi] = -1;
            }
            else
            {
                ans[p[i].qi] = getmaxXor(newNode,p[i].xi);
            }

        }
        System.out.println(Arrays.toString(ans));

    }
    public static class Node {
        Node zero;
        Node one;
    }

    public static void Insert(Node root, int val) {
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            if ((val & (1 << i)) == 0) {
                if (curr.zero != null) {
                    curr = curr.zero;
                } else {
                    Node nn = new Node();
                    curr.zero = nn;
                    curr = nn;
                }
            } else {
                if (curr.one != null) {
                    curr = curr.one;
                } else {
                    Node nn = new Node();
                    curr.one = nn;
                    curr = nn;
                }
            }

        }

    }

    public static int getmaxXor(Node root, int val) {
        int num = 0;
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (val & (1 << i));
            if (bit == 0) {
                if (curr.one != null) {
                    num += (1 << i);
                    curr = curr.one;
                } else {
                    curr = curr.zero;
                }
            } else {
                if (curr.zero != null) {
                    num += (1 << i);
                    curr = curr.zero;
                } else {
                    curr = curr.one;
                }
            }

        }
        return num;

    }
    public static class Pair
    {
        int xi;
        int mi;
        int qi;
        Pair(int xi,int mi,int qi)
        {
            this.mi = mi;
            this.qi = qi;
            this.xi = xi;
        }
    }
}
