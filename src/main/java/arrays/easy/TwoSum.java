package arrays.easy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TwoSum {
    @Override
    public String toString() {
        return "arrays.easy.TwoSum{}";
    }

    public static int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    firstIndex = j;
                    secondIndex = i;
//                    System.out.println(firstIndex + "," + secondIndex);
                }
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

    public static int[] twoSumV2(int[] nums, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            int sumCandidate = targetSum - num;
            if (!set.contains(sumCandidate)) {
                set.add(num);
                continue;
            }
            return new int[]{sumCandidate, num};
        }
        return new int[0];
    }


    // Time Complexity - O(n)
    // Space Complexity - O(n)
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] {prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,6,33};
        int[] ints = twoSumV2(nums, 10);
        Arrays.stream(ints).forEach(System.out::println);
    }
}