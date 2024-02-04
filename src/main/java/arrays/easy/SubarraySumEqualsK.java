package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    /**
     https://leetcode.com/problems/subarray-sum-equals-k/
     Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.x
     A subarray is a contiguous non-empty sequence of elements within an array.
     Example 1:
     Input: nums = [1,1,1], k = 2
     Output: 2
     Example 2:
     Input: nums = [1,2,3], k = 3
     Output: 2
     */

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num : nums) {
            sum = sum + num;
            int difference = sum - k;
            if (map.containsKey(difference)) {
                result = result + map.get(difference);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
