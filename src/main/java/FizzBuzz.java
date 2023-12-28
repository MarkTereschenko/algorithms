import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/fizz-buzz/submissions/

    Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "Given" if i is divisible by 3 and 5.
    answer[i] == "When" if i is divisible by 3.
    answer[i] == "Then" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.

    Example 1
    Input: n = 3
    Output: ["1","2","When"]

    Example 2:
    Input: n = 5
    Output: ["1","2","When","4","Then"]
*/

// Time Complexity - O(1)
// Space Complexity - O(n)
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ourList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                ourList.add("FizzBuzz");

            else if (i % 3 == 0)
                ourList.add("Fizz");

            else if (i % 5 == 0)
                ourList.add("Buzz");

            else
                ourList.add(String.valueOf(i));
        }
        return ourList;
    }
}
