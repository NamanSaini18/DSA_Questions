import java.util.Random;

public class RandomQuickSort
{
    public static void main(String[] args)
    {
        int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void sort(int[] arr, int si, int ei) {
        if (si > ei) {
            return;
        }
        int pi = partition(arr, si, ei);
        sort(arr, si, pi - 1);
        sort(arr, pi + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {

        int item = arr[ei];
        int pi = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }

        }
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;
        return pi;
    }
    public static void swap(int[] arr,int si,int ei)
    {
        Random r = new Random();
        int idx = r.nextInt(si-ei+1)+si;
        int temp = arr[idx];
    }
}
