package arrays;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
 */

// Time Complexity - O(n) linear
// Space Complexity - O(1) constant complexity

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] =  nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1,5,8};
        int arr2[] = new int[]{2,6,4,};
        int arr3[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=arr1[i];
            arr3[i+1]=arr2[i];
        }
//        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr3).forEach(System.out::println);
    }
}
