import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    // Time Complexity - O(n) Linear
    // Space Complexity - O(1) - constant complexity
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = map.get(s.charAt(i));
//            int previousValue = (i > 0 ? map.get(s.charAt(i - 1)) : currentValue);
            int previousValue;
            if (i > 0)  {
                previousValue = map.get(s.charAt(i - 1));
            }
            else previousValue = currentValue;
            if (currentValue > previousValue) {
                sum = sum + currentValue - previousValue - previousValue;
                // or sum = sum + currentValue - previousValue * 2;
            }
            else {
                sum = sum + currentValue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = romanToInt("III");
        System.out.println(result);
    }
}
