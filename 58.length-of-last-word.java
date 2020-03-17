/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (32.45%)
 * Likes:    547
 * Dislikes: 2155
 * Total Accepted:    341.2K
 * Total Submissions: 1.1M
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word (last word means the last
 * appearing word if we loop from left to right) in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a maximal substring consisting of non-space
 * characters only.
 * 
 * Example:
 * 
 * 
 * Input: "Hello World"
 * Output: 5
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for(int i = s.length() - 1; i >=0 ; i--){
            if(s.charAt(i) == " ".charAt(0)){
                if(res == 0) {
                    continue;
                }else {
                    return res;
                }
            }else{
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

