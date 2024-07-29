package LeetCode;

import java.util.Scanner;

public class Median_of_Two_Sorted_Arrays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for(int i=0;i<size1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<size2;i++)
        {
            arr2[i] = sc.nextInt();
        }

        if(arr1.length < arr2.length)
        {
            System.out.println(findMedianSortedArrays(arr1,arr2));
        }
        else {
            System.out.println(findMedianSortedArrays(arr2,arr1));
        }

//        System.out.println(findMedianSortedArrays(arr1,arr2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int low = 0;
        int high = nums1.length;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(low <= high)
        {
            int cut1 = (low + high) / 2;
            int cut2 = ((n1 + n2 + 1) / 2) - cut1;
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];
            if(left1 <= right2 && left2 <= right1)
            {
                if((n1 + n2) % 2 == 0)
                {
                    return (Math.max(left1,left2) + Math.min(right1,right2)) / 2.0;
                }
                else {
                    return Math.max(left1,left2);
                }
            }
            else if(left1 > right2)
            {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0;
    }
}
