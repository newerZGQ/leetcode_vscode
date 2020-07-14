import java.util.ArrayList;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int L = i + 1; 
            int R = nums.length - 1;
            while(L < R){
                int t = nums[i] + nums[L] + nums[R];
                if(t == 0) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[L]);
                    tmp.add(nums[R]);
                    res.add(tmp);
                    while( L < R && nums[L] == nums[L+1]){
                        L++;
                    }
                    while( L < R && nums[R] == nums[R - 1]){
                        R--;
                    }
                    L++;
                    R--;
                }
                if(t > 0) {
                    R--;
                }
                if(t < 0) {
                    L++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

