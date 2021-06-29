package Part_02.Part02_01_Squared;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = number * number;
        System.out.println(result);
    }
}