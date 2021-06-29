package Part_02.Part02_17_SumOfASequence;

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Last number?");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
