/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (41.36%)
 * Likes:    1868
 * Dislikes: 223
 * Total Accepted:    529.7K
 * Total Submissions: 1.3M
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: [1,3,5,6], 0
 * Output: 0
 * 
 * 
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) return nums.length ;
        if(target < nums[0]) return 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right && (right - left > 1)){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) {
                left = mid;
            }
            if(target < nums[mid]){
                right = mid;
            }
        }
        if(target == nums[left]) return left;
        if(target == nums[right]) return right;
        return left + 1;
    }
}
// @lc code=end

