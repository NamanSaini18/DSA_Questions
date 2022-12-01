import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(Search(arr,sc.nextInt()));

    }
    public static int Search(int[] arr,int item)
    {
        int si=0;
        int ei = arr.length-1;
        while(si<=ei)
        {
            int mid = (si+ei)/2;
            if(arr[mid]==item)
            {
                return mid;
            }
            else if(arr[mid]>item)
            {
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return -1;
    }
}
