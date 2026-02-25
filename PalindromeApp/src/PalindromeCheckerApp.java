import java.util.Deque;
import java.util.LinkedList;


public class PalindromeCheckerApp {
    // Hardcoded string
    String word = "racecar";

    // Create Deque
    Deque<Character> deque = new LinkedList<>();

    // Insert characters into deque (at rear)
        for (int i = 0; i < word.length(); i++) {
        deque.addLast(word.charAt(i));
    }

    boolean isPalindrome = true;

    // Compare front and rear elements
        while (deque.size() > 1) {

        char front = deque.removeFirst();  // Remove from front
        char rear = deque.removeLast();    // Remove from rear

        if (front != rear) {
            isPalindrome = false;
            break;
        }
    }

    // Display result
        if (isPalindrome) {
        System.out.println("The word \"" + word + "\" is a Palindrome.");
    } else {
        System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
    }





    }
}
