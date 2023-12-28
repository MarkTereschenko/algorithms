package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DuplicateZeros {

    /*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
    Example 1:
    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:
    Input: arr = [1,2,3]
    Output: [1,2,3]
    Explanation: After calling your function, the input array is modified to: [1,2,3]
     */

    public void duplicateZero(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            }
            else {
                queue.add(arr[i]);
            }
            Integer first = queue.poll();
            arr[i] = first;
        }
        queue.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 23, 5, 7, 11, 13, 3, 19, 23, 29);

        Integer min = null;
        Integer secondMin = null;

        for(Integer prime : primes){
            if(min == null){
                min = prime;
            } else if(prime < min){
                min = prime;
            }

            if(secondMin == null){
                secondMin = prime;
            } else if(prime < secondMin){
                secondMin = prime;

            System.out.println(min);
            System.out.println(secondMin);
            }
        }
    }
}
