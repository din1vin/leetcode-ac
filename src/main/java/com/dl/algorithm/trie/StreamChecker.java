package com.dl.algorithm.trie;

/**
 * 前缀树
 */
@SuppressWarnings("unused")
public class StreamChecker {
    private final StringBuilder sb = new StringBuilder();
    private final Trie trie = new Trie();

    public StreamChecker(String[] words) {
        for (String w : words) {
            trie.insert(w);
        }
    }

    public boolean query(char letter) {
        sb.append(letter);
        return trie.query(sb);
    }
}


class Trie {
    Trie[] children = new Trie[26];
    boolean isEnd = false;

    public void insert(String word) {
        Trie node = this;
        for (int i = word.length() - 1; i >= 0; i--) {
            int idx = word.charAt(i) - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new Trie();
            }
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    public boolean query(StringBuilder s) {
        Trie node = this;
        for (int i = s.length() - 1, j = 0; i >= 0 && j < 201; --i, ++j) {
            int idx = s.charAt(i) - 'a';
            if (node.children[idx] == null) {
                return false;
            }
            node = node.children[idx];
            if (node.isEnd) {
                return true;
            }
        }
        return false;
    }
}


