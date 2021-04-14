package tree;

import java.util.HashMap;
import java.util.Map;


public class Q208 {
    private static class Trie {
        Map<Character, Trie> childrenMap;
        Character value;
        Boolean isEnd;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            this.childrenMap = new HashMap<>();
            value = null;
            isEnd = false;
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Trie root = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!root.childrenMap.containsKey(c)) {
                    Trie child = new Trie();
                    child.value = c;
                    root.childrenMap.put(c, child);
                }
                root = root.childrenMap.get(c);
            }
            root.isEnd = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Trie root = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!root.childrenMap.containsKey(c)) {
                    return false;
                } else {
                    root = root.childrenMap.get(c);
                }
            }
            return root.isEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Trie root = this;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (!root.childrenMap.containsKey(c)) {
                    return false;
                } else {
                    root = root.childrenMap.get(c);
                }
            }
            return true;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
