import java.util.*;

public class  CalculateRepeats {
    public Map<Integer, Integer> calcRepeats(List<Integer> input) {

//        List<Integer> input = new ArrayList<>(Arrays.asList(1,1,5,7,4,3,4,7));
//        Output: 1 : 2, 3 : 1, 4 : 2, 5 : 1, 7 : 2
        Map map1 = new HashMap();

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer el : input) {
            if (map.containsKey(el)) {
                Integer num = map.get(el);
                map.put(el, ++num);
            } else {
                map.put(el, 1);
            }
        }
        return map;
    }

    public Map<Integer, Integer> calcRepeatsWithStreams(List<Integer> input) {
        Map<Integer, Integer> map = new HashMap<>();
        input.forEach(rec -> {
            if (map.containsKey(rec)) {
                Integer num = map.get(rec);
                map.put(rec, ++num);
            } else {
                map.put(rec, 1);
            }
        });
        return map;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1,5,2,2,3,3,2};
        List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 1, 1, 5, 1, 3, 3, -1, -1, 8));
        CalculateRepeats calculateRepeats = new CalculateRepeats();
        Map<Integer, Integer> integerIntegerMap = calculateRepeats.calcRepeats(num);
        integerIntegerMap.entrySet().forEach(System.out::println);
    }
}
