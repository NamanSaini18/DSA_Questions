package DynamicProgramming;

import java.util.Scanner;

public class MaxDotProduct
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,-2,5};
        int[] arr2 = {3,0,-6};
        System.out.println(Product(arr,arr2,0,0));
    }
    public static int Product(int[] arr1,int[] arr2,int i,int j)
    {
        if(i == arr1.length || j == arr2.length)
        {
            return -1;
        }
        int dot = arr1[i]*arr2[j] + Product(arr1,arr2,i+1,j+1);
        int fd = Product(arr1,arr2,i+1,j);
        int sd = Product(arr1,arr2,i,j+1);

        return Math.max(fd,Math.max(dot,sd));
    }
}
