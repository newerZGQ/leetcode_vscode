/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (34.53%)
 * Likes:    2105
 * Dislikes: 1697
 * Total Accepted:    657.3K
 * Total Submissions: 1.9M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 ) return "";
        boolean end = false;
        int index = 0;
        for(int i = 0; i < strs[0].length(); i++ ){
            char tmp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() > i && tmp == strs[j].charAt(i)) continue;
                end = true;
                break;
            }
            if(end) break; else index++;
        }
        return strs[0].substring(0, index);
    }
}
// @lc code=end

