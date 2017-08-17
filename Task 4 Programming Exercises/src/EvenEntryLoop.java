import java.util.Scanner;

public class EvenEntryLoop {

    public static void main (String[] args) {
        int STOP_VALUE = 999;
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an even number (or 999 to stop the program): ");
        input = scanner.nextInt();

        while (input != STOP_VALUE) {
            if ((input % 2) == 0) {
                System.out.println("Good job!");
                return;
            }
            if ((input % 2 != 0)) {
                System.out.println("Error.");
                System.out.print("Input an even number (or 999 to stop the program): ");
                input = scanner.nextInt();
            }
            if (input == STOP_VALUE) {
                return;
            }
        }


    }
}
