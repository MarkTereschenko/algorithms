import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        int tatar = firstUniqueCharacter.firstUniqueChar("TAMAR");
        System.out.println(tatar);
    }
}
