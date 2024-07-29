package PriorityQueue;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>>
{

    private final ArrayList<T> list = new ArrayList<>();
    public void add(T item)
    {
        list.add(item);
        upHeapify(list.size()-1);
    }
    private void upHeapify(int Ci)
    {

        int Pi = (Ci-1)/2;
        if(isLarger(list.get(Pi),list.get(Ci))>0)
        {
            swap(Pi,Ci);
            upHeapify(Pi);
        }
    }
    public void swap(int i,int j)
    {
        T ith = list.get(i);
        T jth = list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public T max()
    {
        swap(0,list.size()-1);
        T rv = list.remove(list.size()-1);
        downHeapify(0);
        return rv;
    }

    private void downHeapify(int Pi)
    {
        int lci = 2*Pi+1;
        int rci = 2*Pi+2;
        int mini = Pi;
        if(lci < list.size() && isLarger(list.get(mini),list.get(lci))>0)
        {
            mini = lci;
        }
        if(rci < list.size() && isLarger(list.get(mini),list.get(rci))>0)
        {
            mini = rci;
        }
        if(mini != Pi)
        {
            swap(mini,Pi);
            downHeapify(mini);
        }
    }
    public T remove()
    {
        swap(0,list.size()-1);
        T rv = list.remove(list.size()-1);
        upHeapify(0);
        return rv;
    }
    public T min()
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

    public int isLarger(T o1,T o2)
    {
        return o1.compareTo(o2);
    }

}
