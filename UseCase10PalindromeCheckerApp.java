public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = original.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Check palindrome using two-pointer technique
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display Results
        System.out.println("Original String   : " + original);
        System.out.println("Normalized String : " + normalized);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome (Ignoring case & spaces).");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}