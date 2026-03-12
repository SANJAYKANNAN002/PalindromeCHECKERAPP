import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two Pointer Approach
    public static boolean twoPointerCheck(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackCheck(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: String Reverse Approach
    public static boolean reverseCheck(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Reverse Timing
        long start3 = System.nanoTime();
        boolean result3 = reverseCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse String Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}