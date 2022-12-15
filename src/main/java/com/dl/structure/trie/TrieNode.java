package com.dl.structure.trie;

/**
 * @author WuJi
 **/
public class TrieNode {
    TrieNode[] trieNode;
    boolean isWorld;

    public TrieNode() {
        trieNode = new TrieNode[26];
        isWorld = false;
    }
}
