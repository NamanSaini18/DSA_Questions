package LeetCode;

import java.util.*;

public class POTD_15Feb {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        List<Integer> res = new ArrayList<>();
        res = addToArrayForm(arr,k);
        for(int item : res)
        {
            System.out.print(res.get(item) + ",");
        }


    }
    public static List<Integer> addToArrayForm(int[] nums, int k)
    {
        List<Integer> result = new ArrayList<>();
        int len = nums.length - 1;
        while(len >= 0 || k != 0)
        {
            if(len >= 0)
            {
                k = k + nums[len];
                len--;
            }
            result.add(k%10);
            k = k / 10;
        }
        Collections.reverse(result);
        return result;
    }
}
