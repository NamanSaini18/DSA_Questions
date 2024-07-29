package BackTracking;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {5,10,15,18,14};
        int target = 30;
        subsets(arr,target,0,new int[5]);
    }
    public static void subsets(int[] arr,int target,int i,int[] ans)
    {
        if(target == 0)
        {
            display(ans);
            return;
        }
        if(i >= arr.length)
        {
            return;
        }
        for(int x=i;x<arr.length;x++)
        {
            ans[x]=1;
            subsets(arr,target-arr[x],x+1,ans);
            ans[x] = 0;
        }
    }
    public static void display(int[] ans)
    {
        for(int x : ans)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
