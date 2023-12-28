package matrix;

public class Searcha2DMatrixII {

    // 240. https://leetcode.com/problems/search-a-2d-matrix-ii/
    /*
    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
     */

    // BAD AND SLOW solution
    // O (n*m);
    public boolean searchMatrix(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }


    // BAD AND SLOW solution
    // O (m+n);
    public boolean searchMatrixOptimal(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n -1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == k) {
                return true;
            }

            if (matrix[i][j] > k) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
