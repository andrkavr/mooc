package Part_02.Part02_19_Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;

        System.out.println("Give a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println(factorial);

    }
}
