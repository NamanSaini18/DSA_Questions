package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Number_Of_Valid_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(ValidSubArray(arr));
    }
    public static int ValidSubArray(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int ans= 0;
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i] < stack.peek())
            {
                stack.pop();
            }
            stack.push(arr[i]);
            ans += stack.size();
        }
        return ans;
    }
}
