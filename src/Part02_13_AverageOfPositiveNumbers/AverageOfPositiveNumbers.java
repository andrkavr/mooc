package Part02_13_AverageOfPositiveNumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                positives++;
                sum = sum + number;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(1.0 * sum / positives);

    }
}