package TRIE;

import java.util.HashMap;

public class Trie_Contacts
{
    public class Node
    {
        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isTerminal = false;
        int count = 0;
    }
    private final Node root;

    public Trie_Contacts()
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
                curr.count++;
            }
            else {
                Node nn = new Node();
                nn.ch = ch;
                nn.count = 1;
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
