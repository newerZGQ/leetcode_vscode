/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 *
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (27.05%)
 * Likes:    4816
 * Dislikes: 690
 * Total Accepted:    487.1K
 * Total Submissions: 1.8M
 * Testcase Example:  '[1,3]\n[2]'
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * You may assume nums1 and nums2 cannot be both empty.
 * 
 * Example 1:
 * 
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * The median is 2.0
 * 
 * 
 * Example 2:
 * 
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * 
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N = nums1.length + nums2.length;
        int retN = N / 2 + 1;

        int left = 0, right = nums1.length - 1;
        int l, r;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (mid > retN - 1) {
                right = mid - 1;
                continue;
            }
            if (mid == retN - 1 && nums1[mid] < nums2[0]) {
                l = mid;
                r = -1;
                break;
            }
            l = mid;
            r = retN - (mid + 1) - 1;

        }
        if (left > right) {
            l = -1;
            r = retN - 1;
        }
        if (N / 2 == 0) {
            return (nums1[mid] + nums2[retN - mid - 1]) / 2;
        } else {
            return Math.max(nums1[mid], nums2[retN - mid - 1]);
        }
    }
}
