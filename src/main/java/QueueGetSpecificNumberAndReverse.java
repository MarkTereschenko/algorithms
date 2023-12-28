import java.util.*;

public class QueueGetSpecificNumberAndReverse {
    // 10,20,30,40,50,60,70,80,90 --> 5 -> 50,40,30,20,10,60,70,80,90

//    public static void main(String[] args) {
//        Queue<Integer> given = new LinkedList<>();
//
//        given.add(10);
//        given.add(20);
//        given.add(30);
//        given.add(40);
//        given.add(50);
//        given.add(60);
//        given.add(70);
//        given.add(80);
//        given.add(90);
//        Stack<Integer> stack = new Stack<>();
//        Queue<Integer> result = new LinkedList<>();
//        System.out.println(given);
//
//        //k element number = 5;
//        for (int i = 0; i < 5; i++){
//            if(!given.isEmpty()) {
//                stack.push(given.remove());
//            }
//            System.out.println(given);
//
//            while (!stack.empty()) {
//                given.add(stack.peek());
//                stack.pop();
//            }
//            System.out.println(given);
//
//            for (int i=0; i < given.size()-4; i++) {
//                given.add(given.peek());
//                given.remove();
//            }
//
//            System.out.println("-----------------");
//            System.out.println("result " + given);
//        }
//    }

//    public static String findFriquency(String str) {
//
//        String nonDup = "";
//
//        for (int i = 0; i < str.length(); i++)
//            if (!nonDup.contains(str.charAt(i) + "")){
//                nonDup = nonDup + str.charAt(i);
//        }
//        String result ="";
//        for (int j = 0; j < str.length(); j++) {
//            int count = 0;
//            if (nonDup.charAt(j) == str.charAt(i)) {
//                count++;
//            }
//        }
//        result += nonDup.charAt(j) + ":" + count + "";
//        return result;
//    }

//    public static void main(String[] args) {
//        int[] numbers = new int[]{5, 1, 23, 5, 6, 1, 3};
//        int large = numbers[0];
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//
//                if (numbers[i] > numbers[j]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//            System.out.println((numbers[1]));
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("1");
//        Thread.sleep(Long.parseLong("5000"));
//        System.out.println("2");

        Set<Number> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
//        set.add(1L);
//        set.add(1.00);
        System.out.println(set.size());
    }
}
