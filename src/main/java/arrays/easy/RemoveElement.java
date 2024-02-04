package arrays.easy;

public class RemoveElement {

    // https://leetcode.com/problems/remove-element/
    // Time complexity : O(n)
    // Space complexity : O(1)
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    // two points method
    public int removeElementTwoPoints(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums [i - 1];
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
}
