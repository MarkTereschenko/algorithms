package algorithms;

public class BinarySearch {

    /**
     Linear Search                                              Binary Search
     In linear search input data need not to be in sorted.	    In binary search input data need to be in sorted order.
     It is also called sequential search.	                    It is also called half-interval search.
     The time complexity of linear search O(n). 	            The time complexity of binary search O(log n).
     Multidimensional array can be used.	                    Only single dimensional array is used.
     Linear search performs equality comparisons	            Binary search performs ordering comparisons
     It is less complex and very slow process                   It is more complex and very fast process
     */

    int binarySearchEasiest(int arr[], int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void binarySearch(int arr[], int first, int last, int key) {

        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element is not found");
        }
    }

    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    // Using Arrays.binarySearch()
    // int index = Arrays.binarySearch(sortedArray, key);

    // Using Collections.binarySearch()
    // int index = Collections.binarySearch(sortedList, key);

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);

        BinarySearch ob = new BinarySearch();
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearchRecursive(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }

    int binarySearchRecursive(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearchRecursive(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
