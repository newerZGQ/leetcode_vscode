/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 *
 * https://leetcode.com/problems/product-of-array-except-self/description/
 *
 * algorithms
 * Medium (57.97%)
 * Likes:    4229
 * Dislikes: 369
 * Total Accepted:    473.3K
 * Total Submissions: 799.9K
 * Testcase Example:  '[1,2,3,4]'
 *
 * Given an array nums of n integers where n > 1,  return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * 
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * 
 * Constraint: It's guaranteed that the product of the elements of any prefix
 * or suffix of the array (including the whole array) fits in a 32 bit
 * integer.
 * 
 * Note: Please solve it without division and in O(n).
 * 
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does
 * not count as extra space for the purpose of space complexity analysis.)
 * 
 */

// @lc code=start

//old  1     2    3    4
//old2 1     2    6   24
//new  24    24   12   4
//out  1*24 1*12 2*4 6*1
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = res[i + 1] * nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = ((i - 1) < 0 ? 1 : nums[i - 1]) * ((i + 1) >= nums.length ? 1 : res[i + 1]);
        }
        return res;
    }
}
// @lc code=end
