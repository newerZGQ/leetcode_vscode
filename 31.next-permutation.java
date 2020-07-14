/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1) return;
        boolean needReverse = true;
        for(int i = nums.length-1; i >= 0; i--){
            if((i+1) < nums.length && nums[i] < nums[i+1]){
                needReverse = false;
                int j = i + 1;
                int min = j;
                while(j < nums.length && nums[i] < nums[j]){
                    min = j++;
                }
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
                reSort(nums, i + 1, nums.length - 1);
                break;
            }
        }
        if(needReverse) {
            reSort(nums, 0, nums.length-1);
        }
    }
    private void reSort(int[] nums, int left, int right){
        while(left < right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
// @lc code=end

