import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestCommonPrefixTest {

    @Test
    public void checkLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = new String[]{"word", "worst", "wormy"};
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        assertThat(result).isEqualTo("wor");

        String[] words = new String[]{"word", "worst", "wormy", ""};
        String actualResult = longestCommonPrefix.longestCommonPrefix(words);
        assertThat(actualResult).isEqualTo("");
    }

}
