package arrays.easy;

import java.util.Arrays;

public class ReplaceElements {

    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }

    public int[] replaceElementsWithWhile(int[] arr) {
        int rightMax = -1;
        int i = arr.length - 1;
        while (i >= 0) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
            i--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElements replaceElements = new ReplaceElements();
        int[] ints = replaceElements.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        Arrays.stream(ints).forEach(System.out::println);
    }
}
