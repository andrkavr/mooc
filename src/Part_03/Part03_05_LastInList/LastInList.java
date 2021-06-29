package Part_03.Part03_05_LastInList;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        for (int i = list.size() - 1; i >= list.size() - 1; i--) {
            System.out.println(list.get(i));
        }
    }
}
