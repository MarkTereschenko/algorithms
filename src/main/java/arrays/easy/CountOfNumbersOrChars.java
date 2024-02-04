package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOfNumbersOrChars {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (myMap.containsKey(diff)) {
                return new int[]{myMap.get(diff), i};
            }
            myMap.put(num, i);
        }
       return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,6,33};
        int[] ints = twoSum(nums, 10);
        Arrays.stream(ints).forEach(System.out::println);
    }
}
