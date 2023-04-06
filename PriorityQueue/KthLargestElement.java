package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement
{
    public static void main(String[] args)
    {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(KthLargest(arr,k));


    }
    public static int KthLargest(int[] arr,int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());  Max Heap
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);

        }
        for (int i = k; i < arr.length; i++)
        {
            if(arr[i] > queue.peek())
            {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.peek();

    }

}
