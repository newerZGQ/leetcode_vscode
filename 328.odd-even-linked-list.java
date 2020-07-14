import java.util.List;

/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ji = head;
        ListNode ou = head.next;
        ListNode ouHead = ou;
        ListNode cur = ou;
        int index = 1;
        while(cur != null){
            cur = cur.next;
            index++;
            if(index % 2 == 0 && cur != null){
                ji.next = cur;
                ji = ji.next;
            }else{
                ou.next = cur;
                ou = ou.next;
            }
        }
        ji.next = ouHead;
        return head;
    }
}
// @lc code=end

