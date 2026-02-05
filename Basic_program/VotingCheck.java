import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define an array of 10 integer elements
        int[] ages = new int[10];

        // Take user input for the students' ages
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility:");

        // b. Loop through the array using the length property
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
