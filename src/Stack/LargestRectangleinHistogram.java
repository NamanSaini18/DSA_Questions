package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleinHistogram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Area(arr));

    }
    public static int Area(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()])
            {
                int h = arr[stack.pop()];
                int r = i;
                if(stack.isEmpty())
                {
                    maxArea = Math.max(maxArea,h*r);
                }
                else{
                    int l = stack.peek();
                    maxArea = Math.max(maxArea,h*(r-l-1));
                }
            }
            stack.push(i);
        }
        int r = arr.length;
        while(!stack.isEmpty())
        {
            int h = arr[stack.pop()];
            if(stack.isEmpty())
            {
                maxArea = Math.max(maxArea,h*r);
            }
            else
            {
                int l = stack.peek();
                maxArea = Math.max(maxArea,h*(r-l-1));
            }
        }
        return maxArea;
    }
}
