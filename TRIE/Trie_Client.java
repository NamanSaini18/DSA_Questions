package TRIE;

public class Trie_Client
{
    public static void main(String[] args) {
        Implement_TRIE trie = new Implement_TRIE();
        trie.Insert("raj");
        trie.Insert("raja");
        trie.Insert("apple");
        trie.Insert("apple");
        trie.Insert("ankit");
        trie.Insert("ankita");
        System.out.println(trie.search("ankit"));
        System.out.println(trie.startsWith("r"));

    }
}
