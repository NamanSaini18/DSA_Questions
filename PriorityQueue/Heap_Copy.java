package PriorityQueue;

import java.util.ArrayList;

public class Heap_Copy
{
    private ArrayList<Integer> list = new ArrayList<>();
    public void add(int item)
    {
        list.add(item);
        upHeapify(list.size()-1);
    }
    private void upHeapify(int Ci)
    {

        int Pi = (Ci-1)/2;
        if(list.get(Pi) > list.get(Ci))
        {
            swap(Pi,Ci);
            upHeapify(Pi);
        }
    }
    public void swap(int i,int j)
    {
        int ith = list.get(i);
        int jth = list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public int max()
    {
        swap(0,list.size()-1);
        int rv = list.remove(list.size()-1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int Pi)
    {
        int lci = 2*Pi+1;
        int rci = 2*Pi+2;
        int mini = Pi;
        if(lci < list.size() && list.get(mini) > list.get(lci))
        {
            mini = lci;
        }
        if(rci < list.size() && list.get(mini) > list.get(rci))
        {
            mini = rci;
        }
        if(mini != Pi)
        {
            swap(mini,Pi);
            downHeapify(mini);
        }
    }
    public int remove()
    {
        swap(0,list.size()-1);
        int rv = list.remove(list.size()-1);
        upHeapify(0);
        return rv;
    }
    public int min()
    {
        return list.get(0);
    }
    public int size()
    {
        return list.size()-1;
    }

    public void Display()
    {
        System.out.println(list);
    }
}
