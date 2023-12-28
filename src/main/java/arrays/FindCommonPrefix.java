package arrays;

public class FindCommonPrefix {


    public static String findCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            throw new RuntimeException("Array is empty");
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, strs[i].length() - 1);
            }

        }
        if (prefix.equals("")) {
            System.out.println("Array is empty");
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] hyu = new String[]{"vik", "vikki", "vika"};
        String commonPrefix = findCommonPrefix(hyu);
        System.out.println(commonPrefix);
    }
}
