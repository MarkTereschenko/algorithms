package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ContainsDuplicates {

    /*
Given an Integer array, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:
Input: nums = [1,2,3,4]
Output: false
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateWithStreamApi(int[] nums) {
        Arrays.sort(nums);
        return IntStream.range(1, nums.length).anyMatch(i -> nums[i] == nums[i - 1]);
    }

}
