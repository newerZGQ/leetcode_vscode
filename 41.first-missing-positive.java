/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 *
 * https://leetcode.com/problems/first-missing-positive/description/
 *
 * algorithms
 * Hard (30.44%)
 * Likes:    2638
 * Dislikes: 716
 * Total Accepted:    285.7K
 * Total Submissions: 928.6K
 * Testcase Example:  '[1,2,0]'
 *
 * Given an unsorted integer array, find the smallest missing positive
 * integer.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,0]
 * Output: 3
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [3,4,-1,1]
 * Output: 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [7,8,9,11,12]
 * Output: 1
 * 
 * 
 * Note:
 * 
 * Your algorithm should run in O(n) time and uses constant extra space.
 * 
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        HashSet<Integer> hashSet = new HashSet<>(nums.length);
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] > 0) {
                hashSet.add(nums[i]);
            }
        }

        int min = 1;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] == min) {
                min += 1;
                while (hashSet.contains(min)) {
                    min += 1;
                }
            }
        }

        return min;
    }
}
// @lc code=end

