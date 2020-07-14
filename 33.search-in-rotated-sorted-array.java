/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 *
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 *
 * algorithms
 * Medium (33.50%)
 * Likes:    4555
 * Dislikes: 432
 * Total Accepted:    688.7K
 * Total Submissions: 2M
 * Testcase Example:  '[4,5,6,7,0,1,2]\n0'
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown
 * to you beforehand.
 * 
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 */

// @lc code=start
class Solution {
//     [4,5,6,7,0,1,2]
// 0
    public int search(int[] nums, int target) {
        return searchHelper(nums, 0, nums.length - 1, target);
    }
    private int searchHelper(int[] nums, int left, int right, int target){
        if(left > right) return -1;
        int mid = left + (right-left) / 2;
        if(target == nums[mid]) return mid;
        else{
            if(nums[mid] > nums[left]){
                if(target >= nums[left] && target <= nums[mid]){
                    return searchHelper(nums, left, mid - 1, target);
                }else{
                    return searchHelper(nums, mid+1, right, target);
                }
            }
            if(nums[mid] < nums[right]){
                if(target >= nums[mid] && target <= nums[right]){
                    return searchHelper(nums, mid +1, right, target);
                }else{
                    return searchHelper(nums, left, mid - 1, target);
                }
            }
            if(target == nums[left]) return left;
            if(target == nums[right]) return right;
        }
        return -1;
    }
}
// @lc code=end

