/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (42.46%)
 * Likes:    1454
 * Dislikes: 252
 * Total Accepted:    397.4K
 * Total Submissions: 935.5K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int tmp = 0;
        int topIndex = a.length() - 1;
        int botIndex = b.length() - 1;
        String res = "";
        while(topIndex >=0 || botIndex >=0) {
            int top = topIndex >= 0 ? (a.charAt(topIndex) == 48 ? 0 : 1) : 0;
            int bot = botIndex >= 0 ? (b.charAt(botIndex) == 48 ? 0 : 1) : 0;
            int value = top + bot + tmp;
            tmp = value / 2;
            res = value % 2 + res;
            topIndex--;
            botIndex--;
        }
        if(tmp == 1) res = "1" + res;
        return res;
    }
}
// @lc code=end

