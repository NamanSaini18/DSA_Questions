package LeetCode;

public class LC_Maximum_XOR_421
{
    public static class Node
    {
        Node zero;
        Node one;

    }
    public static void insert(Node root,int val) {
        Node current = root;
        for (int i = 31; i >= 0; i--) {
            if ((val & (1 << i)) == 0) {
                if (current.zero != null) {
                    current = current.zero;
                } else {
                    Node newNode = new Node();
                    current.zero = newNode;
                    current = newNode;

                }
            } else
            {
                if (current.one != null)
                {
                    current = current.one;
                } else
                {
                    Node newNode = new Node();
                    current.one = newNode;
                    current = newNode;
                }

            }

        }
    }
        public static int getMaxXOR(Node root,int val)
        {
            int num = 0;
            Node current = root;
            for (int i = 31; i >= 0; i--)
            {
                int bit = (val & ( 1 << i));
                if(bit == 0)
                {
                    if(current.one != null)
                    {
                        num += (1 << i);
                        current = current.one;
                    }
                    else {
                        current = current.zero;
                    }

                }
                else {
                    if(current.zero != null)
                    {
                        num += (1 << i);
                        current = current.zero;
                    }
                    else {
                        current = current.one;
                    }
                }

            }
            return num;
        }


    public static void main(String[] args) {
        Node root = new Node();
        int[] arr = {3,10,5,25,2,8};
        for(int val : arr)
        {
            insert(root,val);
        }

        int xor = Integer.MIN_VALUE;
        for(int val : arr)
        {
            xor = Math.max(xor,getMaxXOR(root,val));
        }
        System.out.println(xor);
    }

}
