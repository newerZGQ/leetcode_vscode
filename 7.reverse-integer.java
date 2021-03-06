/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x/10;
            if(ret > Integer.MAX_VALUE/10 || (ret == Integer.MAX_VALUE/10 && pop > 7)) return 0;
            if(ret < Integer.MIN_VALUE/10 || (ret == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            ret = ret * 10 + pop;
        }
        return ret;
    }
}

