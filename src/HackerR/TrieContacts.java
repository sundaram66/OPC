package Hackerrank;


import java.util.Scanner;

class TrieNode {

    int cnt;
    char c;
    boolean isWord;
    TrieNode[] vertices = new TrieNode[26];

    TrieNode() {}

    TrieNode(char c) {
        this.c = c;
    }
}

class Trie {

    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void add(String word) {

        if(word == null) return;
        int len = word.length();
        if(len == 0) return;

        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            char c = word.charAt(i);
            int index = c -'a';

            if(currentNode.vertices[index] == null) {
                currentNode.vertices[index] = new TrieNode(c);
            }
            currentNode.vertices[index].cnt++;
            currentNode = currentNode.vertices[index];
        }

        currentNode.isWord = true;
    }

    public int findPartial(String partial) {

        if(partial == null) return 0;
        int len = partial.length();
        if(len == 0) return 0;
        int index = 0;
        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            char c = partial.charAt(i);
            index = c-'a';

            if(currentNode.vertices[index] == null)
                return 0;
            currentNode = currentNode.vertices[index];
        }

        if(currentNode == null) return 0;
        return currentNode.cnt;
    }
}


public class TrieContacts {
    public static void main(String[] args) {
        Trie trie = new Trie();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) trie.add(contact);
            else
                System.out.println(trie.findPartial(contact));
        }
    }
}
