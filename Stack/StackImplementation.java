package Stack;

public class StackImplementation {
    protected int[] arr;
    private int top;

    public StackImplementation()
    {
        arr = new int[5];
        top = -1;
    }
    public StackImplementation(int n)
    {
        arr = new int[n];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }

    public void push(int item) throws Exception {
//        top++;
        arr[top++] = item;
    }

    public int pop()
    {
        int rv = arr[top];
        top--;
        return rv;
    }
    public int peek()
    {
        return arr[top];
    }
    public void display()
    {
        for (int i = 0; i <=top ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int size()
    {
        return top+1;
    }
    public boolean isFull()
    {
        return top+1 == arr.length;
    }

    public static void main(String[] args) throws Exception {
        StackImplementation stack = new StackImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
    }
}
