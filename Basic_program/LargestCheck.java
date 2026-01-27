import java.util.Scanner;
public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Is the first number the largest? " + (x > y && x > z));
        System.out.println("Is the second number the largest? " + (y > x && y > z));
        System.out.println("Is the third number the largest? " + (z > x && z > y));
    }
}