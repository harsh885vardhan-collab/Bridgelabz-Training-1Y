import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];


        int length = 0;
        try {
            while (true) {
                char ch = str.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }


        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }


        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // reset to avoid duplicates
                index++;
            }
        }

        return result;
    }


    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        String[][] result = findFrequency(input);


        displayTable(result);

        sc.close();
    }
}