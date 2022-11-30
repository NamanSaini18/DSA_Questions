import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
//        System.out.println(list);
        list.add(1,-9);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
        System.out.println(list);

        System.out.println(list.set(1,-90));
        System.out.println(list);

        //Sorting the list
        Collections.sort(list);  // Collection is Interface and Collections is a class
        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        // For each Loop -- Enhanced For Loop
        System.out.println("Using Enhanced For Loop");
        for(int v:list)
        {
            System.out.print(v+ " ");
        }

    }
}
