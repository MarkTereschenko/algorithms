import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {
        // 5,1,6,7,1,3,5,5,5,5,3,7 -> 5,1,6,7,3

    @Test
    public void rdTest() {
        RemoveDuplicates rm = new RemoveDuplicates();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 4, 6, 1));
        rm.removeDuplicates(numbers).forEach(System.out::println);
    }


}
