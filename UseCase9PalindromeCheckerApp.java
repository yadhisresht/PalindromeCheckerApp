public class UseCase9PalindromeCheckerApp {

    // Recursive Method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or become equal
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call with smaller substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String original = "racecar";

        boolean result = isPalindrome(original, 0, original.length() - 1);

        System.out.println("Original String : " + original);

        if (result) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }
    }
}