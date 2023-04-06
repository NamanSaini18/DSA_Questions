package PriorityQueue;

public class Generic_Heap_Client {
    public static void main(String[] args) {
        MinHeap<Cars> gp = new MinHeap<>();
        gp.add(new Cars(200,10,"White"));
        gp.add(new Cars(2000,100,"Green"));
        gp.add(new Cars(100,100,"Black"));
        gp.add(new Cars(345,90,"Red"));
        gp.add(new Cars(972,120,"Blue"));
        gp.add(new Cars(999,130,"Grey"));
        gp.add(new Cars(1000,170,"Yellow"));
        gp.add(new Cars(999,190,"Orange"));
        gp.add(new Cars(234,220,"Brown"));
        gp.add(new Cars(9819,300,"Purple"));

        gp.Display();
        System.out.println(gp.remove());
        gp.Display();

    }
}
