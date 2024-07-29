import java.util.Scanner;

public class Solutionn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n The Data which you have entered is: \n");
        for(int[]x : matrix)
        {
            for(int y: x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("The rotated array is: ");

        int [][] arr = rotate(matrix);
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
        return matrix;
    }
    public static void transpose(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int tmp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
        }
    }
    public static void reverse(int[][] arr)
    {
        for(int r=0;r<arr.length;r++)
        {
            int l=0;
            int right = arr.length-1;
            while(l<right)
            {
                int temp=arr[r][l];
                arr[r][l]=arr[r][right];
                arr[r][right]=temp;
                l++;
                right--;
            }
        }
    }
}
