package DivideANDConquer;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,8,-11};
        int[] ans = Sort(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] Sort(int[] arr,int si,int ei)
    {
        if(si == ei)
        {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si+ei)/2;
        int[] fs = Sort(arr,si,mid);
        int[] ss = Sort(arr,mid+1,ei);
        return mergeTwoArray(fs,ss);
    }
    public static int[] mergeTwoArray(int[] arr1,int[] arr2)
    {
        int i=0,j=0,k=0;
        int[] ans = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                ans[k++] = arr1[i++];
            }
            else {
                ans[k++] = arr2[j++];
            }
        }
        while(i<arr1.length)
        {
            ans[k++] = arr1[i++];
        }
        while(j<arr2.length)
        {
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
