package LeetCode;

import java.util.PriorityQueue;

public class Merge_Rope {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(Cost(arr));

    }
    public static int Cost(int[] arr)
    {
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        while(queue.size() > 1)
        {
            int a = queue.poll();
            int b = queue.poll();
            sum += (a+b);
            queue.add(a+b);
        }
        return sum;

    }
}
