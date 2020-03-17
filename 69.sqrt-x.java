/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 *
 * https://leetcode.com/problems/sqrtx/description/
 *
 * algorithms
 * Easy (32.98%)
 * Likes:    1096
 * Dislikes: 1718
 * Total Accepted:    491.3K
 * Total Submissions: 1.5M
 * Testcase Example:  '4'
 *
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x, where x is guaranteed to be a
 * non-negative integer.
 * 
 * Since the return type is an integer, the decimal digits are truncated and
 * only the integer part of the result is returned.
 * 
 * Example 1:
 * 
 * 
 * Input: 4
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since 
 * the decimal part is truncated, 2 is returned.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        double tmp = 10f;
        while(true){
            double t = tmp;
            tmp = (tmp + x/tmp) / 2;
            if(Math.abs(tmp - t) < 1.0E-6) return (int)(tmp); 
        }
    }
}
// @lc code=end

