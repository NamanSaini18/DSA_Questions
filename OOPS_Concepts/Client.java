package OOPS_Concepts;

import java.util.Comparator;

public class Client {
    public void main(String[] args) {
        Student[] arr = new Student[5];
        System.out.println(arr[0]);

        arr[0] = new Student("Pappu",12);
        arr[1] = new Student("A",22);
        arr[2] = new Student("B",14);
        arr[3] = new Student("C",15);
        arr[4] = new Student("D",13);

        print(arr);
//        Bubble(arr);
        Bubble(arr,new CC());
        print(arr);
    }
    public static void print(Object[] arr)
    {
        for(Object s : arr)
        {
            System.out.println(s);
        }
        System.out.println();
    }
    public static<T extends Comparable<T>> void Bubble(T[] arr)
    {
        /* Only Bubble Sort and Insertion Sort's Best Case TC is O(n) and Out of these two, we use Insertion Sort
            as it is better than Bubble Sort
        */
        for(int count = 1;count < arr.length-1;count++) {
            for (int i = 0; i <= arr.length - 2; i++) {
                if(arr[i].compareTo(arr[i+1])>0)
                {

                    T temp = arr[i];
                    arr[i] = arr[i + 1];
//                    temp.compareTo()
                    arr[i + 1] = temp;
                }
            }
        }
    }

    class CC implements Comparator<Student>
    {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.age-o2.age;
        }
    }
    public static<T> void Bubble(T[] arr, Comparator<T> obj)
    {
        /* Only Bubble Sort and Insertion Sort's Best Case TC is O(n) and Out of these two, we use Insertion Sort
            as it is better than Bubble Sort
        */
        for(int count = 1;count < arr.length-1;count++) {
            for (int i = 0; i <= arr.length - 2; i++) {
                if(obj.compare(arr[i],arr[i+1])>0)
                {

                    T temp = arr[i];
                    arr[i] = arr[i + 1];
//                    temp.compareTo()
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
