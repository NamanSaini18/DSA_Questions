package OOPS_Concepts;

public class Stack implements Min_Stack,Stack_I
{
    @Override
    public int getMinimum() {
        return 0;
    }

    @Override
    public int pop() {
        int temp = this.i;
        // i is static and Final
        return 0;
    }
    // Interface me data members static and Final hote hai By Default

    @Override
    public void push(int element) {

    }

// Angular Brackets ka Mtlb hai Boundary Set krna (Restrictions Lagana)
}
// Implements - Inherit krna and Saare Methods ko Body dena
// extends - Only Inherit all the methods
