import java.util.Scanner;

public class PalindromeCheck {


    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }


    public static boolean isPalindromeCharArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }


    public static char[] reverseString(String str) {
        int length = str.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = str.charAt(length - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a text: ");
        String input = sc.nextLine();


        boolean result1 = isPalindromeIterative(input);

        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);


        boolean result3 = isPalindromeCharArray(input);


        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Array): " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}