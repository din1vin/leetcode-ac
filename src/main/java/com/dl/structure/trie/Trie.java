package com.dl.structure.trie;

import com.dl.tags.Number;

/**
 * @author WuJi
 **/
@Number(208)
public class Trie {
    TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.trieNode[i] == null) cur.trieNode[i] = new TrieNode();
            cur = cur.trieNode[i];
        }
        cur.isWorld = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.trieNode[i] == null) return false;
            cur = cur.trieNode[i];
        }
        return cur.isWorld;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (cur.trieNode[i] == null) return false;
            cur = cur.trieNode[i];
        }
        return true;
    }
}
