import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, -1, 4, 7, 11, 9};
        int idx = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (idx == arr[i]) {
                idx=i;
                flag = 1;
                break;
            }
            else {

                continue;
            }

        }
        if (flag == 1) {
            System.out.println(idx);
        } else {
            System.out.println("Not found");
        }
    }
}
