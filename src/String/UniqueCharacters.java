import java.util.Scanner;

public class UniqueCharacters {


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


    public static char[] findUniqueChars(String str) {
        int length = findLength(str);
        char[] temp = new char[length]; // temporary storage
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;


            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to temp
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }


        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        char[] uniqueChars = findUniqueChars(input);


        System.out.println("\nUnique characters in the string:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}