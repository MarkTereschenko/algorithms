package arrays;

public class RepeatedInteger {

    public int checkRepeatedIntegerInArray(int[] array) {
        int countOfRepeatedNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(array[i])] > 0) {
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            } else {
                countOfRepeatedNumbers++;
                System.out.println(Math.abs(array[i]) + " is a repetition!");
            }
        }
        return countOfRepeatedNumbers;
    }

}
