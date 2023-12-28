package arrays;

import java.util.Arrays;

public class ReverseNamesInArray {

    // Reverse names in the array

    public static String[] reverseNamesInArray(String namesInArray[]) {
        String tempName = "";
        for (int i =0; i < namesInArray.length; i++) {
            tempName = namesInArray[i];
            String second = "";
            for (int k = tempName.length()-1; k >= 0; k--) {
                second = second + tempName.charAt(k);
            }
            namesInArray[i]=second;
        }
        return namesInArray;
    }

    public static void main(String[] args) {
        String[] arrr = new String[]{"Ivvl", "James"};
        String[] strings = reverseNamesInArray(arrr);
        Arrays.stream(strings).forEach(System.out::println);
    }
}
