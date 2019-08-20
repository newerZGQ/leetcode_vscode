/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        System.out.print("" + Integer.MAX_VALUE + "\n");
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
        int level = 0;
        int ret = 0;
        int length = x > 0 ? ("" + x).length() : ("" + x).length() - 1;
        boolean needAnafirst = true;
        while(x != 0) {
            if(needAnafirst){
                if(x % 10 != 0){
                    needAnafirst = false;
                }else{
                    length--;
                    x = x / 10;
                    continue;
                }
            }
            int tmp = 1;
            for(int i = 0; i < length - level -1; i++){
                tmp *= 10;
            }
            ret = ret + x % 10 * tmp;
            if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) return 0;
            level++;
            x = x / 10;
        }
        return ret;
    }
}

