public class Array_GetMinIndex {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, -4, 7, 11, 9};
        int flag = 0;
        int min = 0;
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
               min=i;
               flag=1;

            } else {
                continue;
            }
        }
        if (flag == 1) {
            System.out.println("Minimum index:"+min);
        }
    }
    public static void reverse(int[] arr)
    {
        int len=arr.length-1;
        for(int i=0;i<len;i++)
        {
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
