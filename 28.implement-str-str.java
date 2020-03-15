/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 *
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * algorithms
 * Easy (33.50%)
 * Likes:    1312
 * Dislikes: 1710
 * Total Accepted:    587.8K
 * Total Submissions: 1.7M
 * Testcase Example:  '"hello"\n"ll"'
 *
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Example 1:
 * 
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty
 * string. This is consistent to C's strstr() and Java's indexOf().
 * 
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle == null || needle.equals("")) return 0;
        for(int i = 0; i < haystack.length(); i++) {
            for( int j = 0; j < needle.length(); j++) {
                if((i+j < haystack.length()) && haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                if( (i + j) >= haystack.length()) return -1;
                if(j == needle.length() - 1) return i;
            }
        }
        return -1;
    }
}
// @lc code=end

