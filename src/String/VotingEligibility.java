import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {


    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }
        return ages;
    }


    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }


    public static void displayTable(String[][] table) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("-------------------");
        for (int i = 0; i < table.length; i++) {
            int age = Integer.parseInt(table[i][0]);
            boolean canVote = Boolean.parseBoolean(table[i][1]);
            System.out.println(age + "\t" + canVote);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int n = sc.nextInt();


        int[] ages = generateAges(n);


        String[][] eligibilityTable = checkEligibility(ages);


        displayTable(eligibilityTable);

        sc.close();
    }
}