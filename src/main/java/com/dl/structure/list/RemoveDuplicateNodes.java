package com.dl.structure.list;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicate-node-lcci/description/">移除重复节点</a>
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        Set<Integer> nums = new HashSet<>();
        ListNode pre = head;
        nums.add(pre.val);
        while (pre.next != null) {
            ListNode cur = pre.next;
            if (nums.add(cur.val)) {
                pre = pre.next;
            } else {
                pre.next = pre.next.next;
            }
        }
        return head;
    }
}
