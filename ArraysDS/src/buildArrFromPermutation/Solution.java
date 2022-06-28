package buildArrFromPermutation;

public class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];

        for (int counter = 0; counter < nums.length; counter++) {

            ans[counter] = nums[nums[counter]];
        }
        return ans;
    }
}