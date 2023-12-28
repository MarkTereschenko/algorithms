import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOfEachCharacterInWordTest extends Throwable {

    @Test
    public void countOfEachCharacterInWordTest() {
        CountOfEachCharacterInWord countOfEachCharacterInWord = new CountOfEachCharacterInWord();
        StringBuilder actualResult = countOfEachCharacterInWord.countOfEachCharacterInWord("ANVIAMNMAI");
        assertThat(actualResult.toString()).as("Mismatches between results").isEqualTo("3A1V2I2M2N");
    }

    public static void main(String[] args) {
//        CountOfEachCharacterInWordTest countOfEachCharacterInWord = new CountOfEachCharacterInWordTest();
//       countOfEachCharacterInWord.countLettersForWordNew("ANVIAMNMAI");

    }

//    public static String countLettersForWordNew(String word) {
//        HashMap<Character, Integer> countLettersMap = new HashMap<>();
//        Character currentChar;
//        for (int i = 0; i < word.length(); i++) {
//            currentChar = word.charAt(i);
//            if (countLettersMap.get(currentChar) != null) {
//                countLettersMap.put(currentChar, 1);
//            } else {
//                countLettersMap.put(currentChar, countLettersMap.get(currentChar) + 1);
//            }
//        }
//        return currentChar.toString();
//    }
}


