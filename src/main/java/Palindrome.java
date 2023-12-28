import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {

    public boolean isRowPalindrome(String row) {
        List<Character> listOfChars = new LinkedList<>();
        char[] charArray = row.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            listOfChars.add(c);
        }
        ListIterator<Character> iterator = listOfChars.listIterator();
        ListIterator<Character> reverseIterator = listOfChars.listIterator(listOfChars.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.hasNext() != reverseIterator.hasPrevious()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "String is Palindrome" : "String is NOT a Palindrome");
        return isPalindrome;
    }

}
