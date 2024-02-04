package arrays.easy;

public class FindNumbersWithEvenNumbersOfDigits {

    public int findNumbers(int[] nums) {
        int result = 0;

        for (int i =0; i < nums.length; i++) {
            int count = (int) Math.log10(nums[i]) + 1;
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        FindNumbersWithEvenNumbersOfDigits findNumbersWithEvenNumbersOfDigits = new FindNumbersWithEvenNumbersOfDigits();
        int result = findNumbersWithEvenNumbersOfDigits.findNumbers(new int[]{555, 901, 482, 1771});
        System.out.println(result);
    }
}
