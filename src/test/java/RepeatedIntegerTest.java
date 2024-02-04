import arrays.easy.RepeatedInteger;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RepeatedIntegerTest {

    @Test
    public void repetitionTest() {
        RepeatedInteger repeatedInteger = new RepeatedInteger();
        int resultOfRepeatedNumbers = repeatedInteger.checkRepeatedIntegerInArray(new int[]{2, 3, 1, 2, 4, 3});
        assertThat(resultOfRepeatedNumbers).as("Counts of repeated numbers not equal").isEqualTo(2);
    }

}
