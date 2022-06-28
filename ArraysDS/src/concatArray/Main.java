package concatArray;

import java.util.Arrays;

public class Main {

    public void testSolution(int[] nums) {
        Solution sol = new Solution();
        int output[] = sol.getConcatenation(nums);
        System.out.println(Arrays.toString(output));
    }

    public static void main(String args[]) {

        Main main = new Main();
        int testCase1[] = { 1, 2, 1 };
        int testCase2[] = { 1, 3, 2, 1 };
        main.testSolution(testCase1);
        main.testSolution(testCase2);

    }
}
