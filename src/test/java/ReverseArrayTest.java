import arrays.easy.ReverseArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArrayTest {

    @Test
    public void reverseArrayTest() {
        ReverseArray reverseArray = new ReverseArray();
        int[] expectedReverseArray = reverseArray.reverseIntArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertArrayEquals(expectedReverseArray, new int[]{5, 4, 3, 2, 1});
        Stream.of(expectedReverseArray).map(Arrays::toString).forEach(System.out::println);
    }

}
