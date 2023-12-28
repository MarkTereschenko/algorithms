public class IsPalindromeInteger {

    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x = x / 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    // O(log10(n))) logarithmic complexity
    // Space Complexity - O(1)
    public boolean isPalindromeAnotherSolution(int num) {
        if (num < 0) {
            return false;
        }

        int reversed = 0;
        int original = num;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return original == reversed;
    }
}
