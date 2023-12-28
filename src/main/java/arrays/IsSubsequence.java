package arrays;

public class IsSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
     */

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i = i + 1;
            }
            j = j + 1;
        }
        if (i == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSubsequenceTwo(String s, String t) {
        if (s.equals("")) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
            if (index >= s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean subsequence = isSubsequence.isSubsequence("aab", "ab");
        System.out.println(subsequence);
    }
}
