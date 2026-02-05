import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double phy, chem, math;

            System.out.println("Student " + (i + 1));
            phy = sc.nextDouble();
            chem = sc.nextDouble();
            math = sc.nextDouble();

            if (phy < 0 || chem < 0 || math < 0) {
                i--;
                continue;
            }

            percentage[i] = (phy + chem + math) / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < n; i++)
            System.out.println("Percentage: " + percentage[i] + " Grade: " + grade[i]);

        sc.close();
    }
}
