import java.util.HashMap;
import java.util.Map;

/*
Count of each character in string
Input: str = "fffllooower"
Output:
f 3
l 2
o 3
w 1
e 1
r 1

Input: str = "nnname"
Output:
n 3
a 1
m 1
e 1
 */
public class CountOfEachCharacterInWord {
    public StringBuilder countOfEachCharacterInWord(String row) {
        char[] chars = row.toCharArray();
        Map<Character, Integer> mapOfLetters = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (row.charAt(i) == chars[j]) {
                    count++;
                    mapOfLetters.put(chars[i], count);
                }
            }
        }
        StringBuilder stringBuffer = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : mapOfLetters.entrySet()) {
            String concatenatedRow = String.valueOf(entry.getValue()).concat(entry.getKey().toString());
            stringBuffer.append(concatenatedRow);
        }
        System.out.println(stringBuffer);
        return stringBuffer;
    }

}
