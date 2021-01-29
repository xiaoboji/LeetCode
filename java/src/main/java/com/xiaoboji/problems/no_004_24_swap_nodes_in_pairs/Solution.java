package com.xiaoboji.problems.no_004_24_swap_nodes_in_pairs;

import com.xiaoboji.common.ListNode;

/**
 * @program: leetcode
 * @description:
 * @author: xiaoboji
 * @create: 2021-01-28 14:49
 **/
public class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val= 1;
        ListNode node1 = new ListNode();
        node1.val = 2;
        ListNode node2 = new ListNode();
        node2.val = 3;
        ListNode node3 = new ListNode();
        node3.val = 4;

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        swapPairs(head);
    }
}
