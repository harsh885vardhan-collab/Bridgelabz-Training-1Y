import java.util.Scanner;

public class CustomStringSplit {


    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }


    public static String[] customSplit(String str) {
        int length = findLength(str);


        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }


        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }


        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                if (start != i) { // avoid empty words from multiple spaces
                    words[wordIndex++] = str.substring(start, i);
                }
                start = i + 1;
            }
        }
        if (start < length) {
            words[wordIndex] = str.substring(start, length);
        }

        return words;
    }


    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        String[] customWords = customSplit(input);


        String[] builtInWords = input.trim().split("\\s+"); // handles multiple spaces


        boolean isSame = compareArrays(customWords, builtInWords);


        System.out.println("\nWords using custom method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + (isSame ? "Arrays are identical" : "Arrays differ"));

        sc.close();
    }
}