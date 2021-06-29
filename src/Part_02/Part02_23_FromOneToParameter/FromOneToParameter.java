package Part_02.Part02_23_FromOneToParameter;

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}