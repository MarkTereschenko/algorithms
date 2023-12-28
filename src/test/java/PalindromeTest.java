import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    @Test
    public void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        boolean trueResult = palindrome.isRowPalindrome("parap");
        assertThat(trueResult).isTrue();
        boolean falseResult = palindrome.isRowPalindrome("qabaqa");
        assertThat(falseResult).isFalse();
    }

}
