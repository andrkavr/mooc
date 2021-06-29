package Part_02.Part02_02_SquareRootOfSum;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
