package buildArrFromPermutation;

import java.util.Arrays;

public class Main {

    public void test(int[] nums) {
        Solution obj = new Solution();
        int ans[] = obj.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String args[]) {

        Main main = new Main();
        int testCase1[] = { 0, 2, 1, 5, 3, 4 };
        int testCase2[] = { 5, 0, 1, 2, 3, 4 };
        main.test(testCase1);
        main.test(testCase2);
    }
}
