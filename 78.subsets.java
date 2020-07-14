import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> track = new ArrayList<>();
        helper(nums, track, res, 0);
        return res;
    }
    private void helper(int[] nums, List<Integer> track, List<List<Integer>> res, int start){
        res.add(new ArrayList(track));
        for(int i = start; i < nums.length; i++){
            track.add(nums[i]);
            helper(nums, track, res, i + 1);
            track.remove(track.size() - 1);
        }
    }
}
// @lc code=end

