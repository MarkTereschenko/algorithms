package arrays.medium;

import java.util.Arrays;

public class Hindex {

    // Time O(n)2
    // https://leetcode.com/problems/h-index/
    public int hIndex(int[] citations) {
        int n = citations.length;

        for (int hIndex = 1; hIndex <= n; hIndex++) {
            int count = 0;

            for (int i = 0; i < n; i++) {

                if (citations[i] >= hIndex) {
                    count++;
                }
            }
            if (count < hIndex) {
                return hIndex - 1;
            }
        }
        return n;
    }

    // O n logn
    public int hIndexWithSort(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 1;

        for (int i = n-1; i < n; i--) {
            if (citations[i] < hIndex) {
                return hIndex - 1;
            }
            hIndex++;
        }
        return n;
    }

    // O(n) - best time, most complex
    public int hIndexWithOn(int[] citations) {
        int n = citations.length;
        int[] count = new int[n+1];
        for (int citation : citations) {
            if ( citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        int pos = 0;
        for (int i =0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                citations[pos] = i;
                pos++;
            }
        }

        int hIndex = 1;
        for (int i = n -1; i >= 0; i--) {
            if (citations[i] > hIndex) {
                return hIndex -1;
            }
            hIndex++;
        }
        return n;
    }
}
