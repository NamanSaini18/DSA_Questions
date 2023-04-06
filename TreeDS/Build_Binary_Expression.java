package TreeDS;

import java.util.Stack;

public class Build_Binary_Expression
{
    class Node{
        char val;
        Node left;
        Node right;
        Node(){this.val = ' ';}
        Node(char val)
        {
            this.val = val;
        }
        Node(char val,Node left,Node right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println(GetPostFix("3*4+2*5"));
    }
    public static Node expressionTree(String str)
    {
        str = GetPostFix(str);
        System.out.println(str);
        return null;
    }
    public static String GetPostFix(String str)
    {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                sb.append(ch);
            }
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while(stack.peek() != '(')
                {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && GetValue(stack.peek()) >= GetValue(ch))
                {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();

    }
    public static int GetValue(char ch)
    {
        if(ch == '+' || ch == '-')
        {
            return 1;
        }
        if(ch == '*' || ch == '/')
        {
            return 2;
        }
        return -1;

    }
}
