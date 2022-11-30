import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

    }
    public static int[] TraverseDiagonally(int[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n*m];
        int k = 0;
        for(int d=0;d<m+n-1;d++) {
            int r, c = 0;
            if (d < m) {
                r = 0;
                c = d;
            } else {
                c = m - 1;
                r = d - m + 1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while (r < n && c >= 0) {
                list.add(mat[r][c]);
                r++;
                c--;
            }
            if (d % 2 == 0)
            {
                for (int i = list.size()-1; i >=0; i++) {
                    ans[k] = list.get(i);
                    k++;
                }
            }
            else {
                for (int i = 0; i < list.size(); i++) {
                    ans[k] = list.get(i);
                    k++;
                }
            }
        }
        return ans;
    }
}
