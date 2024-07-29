package LeetCode;

import java.util.Scanner;

public class Gas_Station
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas  = new int[n];
        int[] cost = new int[n];
        for(int i=0;i<n;i++)
        {
            gas[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            cost[i] = sc.nextInt();
        }
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost)
    {
        int sum = 0;
        int total = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++)
        {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0)
            {
                start = i+1;
                sum = 0;
            }
        }
        if(total < 0)
        {
            return -1;
        }
        return start;
    }
}
