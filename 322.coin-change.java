/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        return helper(coins, amount, new int[amount]);
    }
    public int helper(int[] coins, int amount, int[] count){
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        if(count[amount - 1] != 0) {
            return count[amount - 1];
        }
        int min = Integer.MAX_VALUE;
        boolean has = false;
        for(int i = 0; i < coins.length; i++){
            int res = helper(coins, amount - coins[i], count);
            if(res >= 0 && res < min){
                min = 1+res;
            }
        }
        if(min != Integer.MAX_VALUE){
            count[amount - 1] = min;
        }else{
            count[amount - 1] = -1;
        }
        return count[amount - 1];
    }
}
// @lc code=end

