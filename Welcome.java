import java.util.Scanner;

public class Welcome {
    public static void welcomeMessage() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to QuizHelix");
        System.out.println("Twisting Questions, Sharpening Minds.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat's your name?: ");
        String name = input.nextLine();

        System.out.println("\nWhat's your age?: ");
        int age = input.nextInt();

        System.out.println("\nAre you ready for your Quiz?:(Y/N) ");
        char answer = input.next().toUpperCase().charAt(0);

        if (answer == 'Y') {
            System.out.println("\nAwesome " + name + " let the quiz begin");
        }
        else if (answer == 'N') {
            System.out.println("\nNo problem " + name + ". Come back when you are ready");
        } else {
            System.out.println("\nInvalid input. Please restart the program and enter Y or N.");
        }
    }
}
