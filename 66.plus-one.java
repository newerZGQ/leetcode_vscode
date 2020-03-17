/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (41.93%)
 * Likes:    1241
 * Dislikes: 2088
 * Total Accepted:    525.9K
 * Total Submissions: 1.3M
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * 
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int tmp = 1;
        for(int i = digits.length - 1; i >=0; i--){
            int value = digits[i];
            digits[i] = (value + tmp) % 10;
            tmp = (value + tmp) / 10;
        }
        if(tmp == 1) {
            int[] res = new int[digits.length +1];
            res[0] = 1;
            for(int i = 1; i < res.length; i++){
                res[i] = digits[i-1];
            }
            return res;
        }
        return digits;
    }
}
// @lc code=end

