public class LongestCommonPrefix {
    /*
    Task: write a function which will find the longest common prefix of a string amongst an array of strings.
    Additionally: if there is no common prefix, return an empty string "".
    Example #1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example #2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
    */

    // Time Complexity: O(n) - linear complexity
    // Space Complexity - O(n) or O(1)
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
