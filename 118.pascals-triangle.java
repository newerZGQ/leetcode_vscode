import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (49.35%)
 * Likes:    1169
 * Dislikes: 95
 * Total Accepted:    349.1K
 * Total Submissions: 687.8K
 * Testcase Example:  '5'
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 5
 * Output:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        geneCell(res, numRows - 1);
        return res;
    }

    public List<Integer> geneCell(List<List<Integer>> res, int numRows) {
        if (numRows == 0) {
            ArrayList cell = new ArrayList<>();
            cell.add(1);
            res.add(cell);
            return cell;
        }

        List<Integer> pre = geneCell(res, numRows - 1);
        List<Integer> crn = new ArrayList<>();
        for (int i = 0; i < pre.size() + 1; i++) {
            int preT = (i - 1) >= 0 ? pre.get(i - 1) : 0;
            int preT2 = (i) >= (pre.size()) ? 0 : pre.get(i);
            crn.add(preT + preT2);
        }
        res.add(crn);
        return crn;
    }
}
// @lc code=end
