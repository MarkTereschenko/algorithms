import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public boolean checkIsWordAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length)
            return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s2.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(numbers.get(i) * 10);
            }
        }
    }
}
