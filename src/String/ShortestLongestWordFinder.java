import java.util.Scanner;

public class ShortestLongestWordFinder {


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

        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                if (start != i) {
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


    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }


    public static int[] findShortestLongest(String[][] wordTable) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int currentLength = Integer.parseInt(wordTable[i][1]);
            int shortestLength = Integer.parseInt(wordTable[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordTable[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        String[] words = customSplit(input);


        String[][] wordTable = wordLengthArray(words);


        int[] result = findShortestLongest(wordTable);


        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]);
            System.out.println(word + "\t\t" + length);
        }

        System.out.println("\nShortest word: " + wordTable[result[0]][0] +
                " (Length: " + wordTable[result[0]][1] + ")");
        System.out.println("Longest word: " + wordTable[result[1]][0] +
                " (Length: " + wordTable[result[1]][1] + ")");

        sc.close();
    }
}