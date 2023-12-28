import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public List<Integer> removeDuplicates(List<Integer> inputNumbers) {
        Collections.sort(inputNumbers);
        for (int i = 0; i < inputNumbers.size(); i++) {
            int a = inputNumbers.get(i);
            int b = inputNumbers.get(i + 1);
            if (a == b) {
                inputNumbers.remove(i);
            } else {
                i++;
            }
        }
        return inputNumbers;
    }

    public static int[] solution(int[] A) {
        int[] nonDiv = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] % A[j] != 0) {
                    count++;
                }
            }
            nonDiv[i] = count;
        }

        return nonDiv;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 1, 2, 3, 6});
//        int sum = Stream.of("1235".split("")).mapToInt(Integer::parseInt).sum();
        Arrays.stream(solution).forEach(System.out::println);
    }

}
