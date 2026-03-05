import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseCheck(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Method 2: Stack Check
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque Check
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String testString = "racecar";

        System.out.println("Testing String: " + testString);
        System.out.println("----------------------------------");

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseCheck(testString);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(testString);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(testString);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("Reverse Method Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result  : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method Result  : " + result3 + " | Time: " + time3 + " ns");
    }
}