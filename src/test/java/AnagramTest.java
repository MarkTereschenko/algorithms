import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void isPalindromeTest() {
        Anagram anagram = new Anagram();
        assertTrue(anagram.checkIsWordAnagram("mama".toCharArray(), "amam".toCharArray()));
        assertFalse(anagram.checkIsWordAnagram("papa".toCharArray(), "amam".toCharArray()));
    }


}
