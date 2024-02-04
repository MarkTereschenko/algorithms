package arrays.easy;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            count++;
        }
        else {
            if (count > max) {
                max = count;
                count = 0;
            }
        }
        }
        return count > max ? count : max; //Math.max(count, max)
    }

    public int correctSolution(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int n : nums) {
            sum = sum * n;
            sum = sum + n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.correctSolution(new int[]{1, 1, 1, 0, 0, 0, 0, 0, 1});
        System.out.println(result);
    }
}
