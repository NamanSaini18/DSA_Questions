package TreeDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    class TreeNode {
        int val;
         TreeNode left;
           TreeNode right;
          TreeNode()
          {

          }
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
          }
    }
    class Solution
    {
        public List<List<Integer>> levelOrder(TreeNode root)
        {
            Queue<TreeNode> queue = new LinkedList<>();
            Queue<TreeNode> queue1 = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            if(root == null)
            {
                return ans;
            }
            while(!queue.isEmpty())
            {
                TreeNode temp = queue.remove();
                list.add(temp.val);
                if(temp.left != null)
                {
                    queue1.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue1.add(temp.right);
                }
                if(queue.isEmpty())
                {
                    ans.add(list);
                    list = new ArrayList<Integer>();
                    queue = queue1;
                    queue1 = new LinkedList<>();
                }
            }
            return ans;
        }
    }

}
