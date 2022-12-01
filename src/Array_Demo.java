import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i : arr)
        {
            System.out.println(i);
        }
    // Java call by value hota hai reference nhi hota h
        // Jab tak ghar me ghus kar value change nhi krenge tb tk values change nhi hongi
        // Call By reference se swapping nhi hongi arrays
        int[] ar = {5,3,2,4};
        int[] other ={-5,-3,-2,-1};
        System.out.println(arr[0]+ " "+ other[1]);
        swap(ar,other); // Swapping nhi hogi bcoz JAVA IS ALWAYS CALL BY VALUE
        System.out.println(arr[0]+" "+other[1]);


    }
    public static void swap(int[] ar,int[] other)
    {
        int[] temp = ar;
        ar = other;
        other=temp;
    }
}
