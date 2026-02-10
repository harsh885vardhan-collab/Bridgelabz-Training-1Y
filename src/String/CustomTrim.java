import java.util.Scanner;

public class CustomTrim {


    public static int[] findTrimIndexes(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        int start = 0;
        int end = length - 1;

        // Trim leading spaces
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }


        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }


    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();


        int[] indexes = findTrimIndexes(input);


        String trimmedCustom = customSubstring(input, indexes[0], indexes[1]);


        String trimmedBuiltIn = input.trim();


        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);


        System.out.println("\nCustom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Comparison Result: " + (isSame ? "Strings are identical" : "Strings differ"));

        sc.close();
    }
}