package Part_01.Part01_23_SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        int addRes = first + second;
        int subRes = first - second;
        int mulRes = first * second;
        double divRes = (double) first / second;

        System.out.println(first + " + " + second + " = " + addRes);
        System.out.println(first + " - " + second + " = " + subRes);
        System.out.println(first + " * " + second + " = " + mulRes);
        System.out.println(first + " / " + second + " = " + divRes);
    }
}