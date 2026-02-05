import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Weight: ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Height: ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] =
                    personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if (personData[i][2] < 25)
                status[i] = "Normal";
            else if (personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
            System.out.println("BMI: " + personData[i][2] + " Status: " + status[i]);

        sc.close();
    }
}
