package concatArray;

public class Solution {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[2 * nums.length];

        for (int counter = 0; counter < nums.length; counter++) {

            ans[counter] = nums[counter];

            ans[counter + nums.length] = nums[counter];
        }

        return ans;
    }
}