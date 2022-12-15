package com.dl.structure.list;

import com.dl.tags.Number;

/**
 * @author WuJi
 **/
@Number(25)
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode post = head;
        for (int i = 0; i < k; ++i) {
            if (post == null) return head;
            post = post.next;
        }
        ListNode pre = null, cur = head;
        while (cur != post) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = reverseKGroup(cur, k);
        return pre;
    }

}
