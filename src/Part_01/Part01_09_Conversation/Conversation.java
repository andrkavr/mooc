package Part_01.Part01_09_Conversation;

import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        String answer = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String more = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}