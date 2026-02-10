import java.util.Scanner;

public class BMICalculator {

    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);


        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] computeAllBMI(double[][] hwArray) {
        String[][] result = new String[hwArray.length][4]; // height, weight, BMI, status
        for (int i = 0; i < hwArray.length; i++) {
            double weight = hwArray[i][0];
            double height = hwArray[i][1];
            String[] bmiData = computeBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    (i+1), table[i][0], table[i][1], table[i][2], table[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hwArray = new double[10][2]; // 10 persons, [weight, height]

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i+1));
            System.out.print("Weight (kg): ");
            hwArray[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            hwArray[i][1] = sc.nextDouble();
        }


        String[][] result = computeAllBMI(hwArray);


        displayTable(result);

        sc.close();
    }
}