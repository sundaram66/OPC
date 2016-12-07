import java.io.BufferedReader;
import java.io.InputStreamReader;

class Trie1 {
    private TrieNode root;
    public static int nodes = 1;

    public Trie1() {
        root = new TrieNode();
    }

    // Insert word into Trie
    public void insert(String word) {
        if(word == null) return;
        int len = word.length();
        if(len == 0) return;

        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            char c = word.charAt(i);
            int index = c-'a';
            if(currentNode.vertices[index] == null) {
                currentNode.vertices[index] = new TrieNode(c);
                nodes++;
            }
            currentNode = currentNode.vertices[index];
        }
        currentNode.isWord = true;
    }
}



class TestClass {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Trie1 trie = new Trie1();

        for (int i = 0; i < N; i++) {
            trie.insert(br.readLine());
        }

        System.out.println(trie.nodes);

    }
}
