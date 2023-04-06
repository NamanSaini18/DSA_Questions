package LeetCode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Lists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists)
    {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if(lists[i]  != null)
            {
                queue.add(lists[i]);
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(!queue.isEmpty())
        {
            ListNode r = queue.poll();
            dummy.next = r;
            dummy = dummy.next;
            if(r.next != null) {
                queue.add(r.next);
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {

    }
}
