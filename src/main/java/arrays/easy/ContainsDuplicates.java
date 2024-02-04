package arrays.easy;

import java.util.*;
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

    // time complexity of this approach is O(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
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

    //  time complexity of this approach is O(n^2)
    public boolean containsDuplicateDoubleLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    // time complexity O(n)
    public boolean containsDuplicateWithHashMap(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1) {
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
