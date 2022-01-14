public class LeetCode_1342 {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
    public static void main(String[] args) {
        int res = numberOfSteps(14);
        System.out.println(res);
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
