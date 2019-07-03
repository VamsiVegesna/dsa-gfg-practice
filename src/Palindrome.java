public class Palindrome {

    private static boolean isPalindrome(String input, int length, int index) {
        if(index == length) {
            return true;
        }
        if(index > length) {
            return true;
        }
        if(input.charAt(length) != input.charAt(index)) {
            return false;
        }
        return isPalindrome(input, length - 1, index + 1);
    }

    public static boolean isPalidrome(String input) {
        input = input.toLowerCase();
        return isPalindrome(input, input.length() - 1, 0);
    }

}
