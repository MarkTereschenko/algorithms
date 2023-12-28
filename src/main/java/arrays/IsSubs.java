package arrays;

public class IsSubs {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            throw new RuntimeException("S string is not a subsequence of string T");
        }
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

    public static void main(String[] args) {
        String s = "abc", t = "qsahbgdc";
        boolean subsequence = isSubsequence(s, t);
        System.out.println(subsequence);
    }
}
