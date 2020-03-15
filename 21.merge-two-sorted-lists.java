/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (50.61%)
 * Likes:    3174
 * Dislikes: 466
 * Total Accepted:    804.5K
 * Total Submissions: 1.6M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode header = new ListNode(Integer.MIN_VALUE);
        ListNode res = header;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                res.next = l2;
                break;
            }
            if(l2 == null) {
                res.next = l1;
                break;
            }
            if(l1.val > l2.val){
                res.next = l2;
                l2 = l2.next;
            }else{
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }
        return header.next;
    }
}
// @lc code=end

