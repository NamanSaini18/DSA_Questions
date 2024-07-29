package TRIE;
import java.util.*;

public class Implement_TRIE
{
    public class Node
    {
        char ch;
        HashMap<Character,Node> child = new HashMap<>();
        boolean isTerminal = false;

    }
    private final Node root;

    public Implement_TRIE()
    {
        Node newNode = new Node();
        newNode.ch = '*';
        this.root = newNode;
    }

    public void Insert(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch))
            {
                curr = curr.child.get(ch);
            }
            else {
                Node nn = new Node();
                nn.ch = ch;
                curr.child.put(ch,nn);
                curr = nn;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch))
            {
                return false;
            }
            curr = curr.child.get(ch);

        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix)
    {
        Node curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            char ch = prefix.charAt(i);
            if(!curr.child.containsKey(ch))
            {
                return false;
            }
            curr = curr.child.get(ch);

        }
        return true;

    }

}
