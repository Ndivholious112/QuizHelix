import java.util.Scanner;

public class Welcome {
    public static void welcomeMessage() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to QuizHelix");
        System.out.println("Twisting Questions, Sharpening Minds.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("\nWhat's your name?: ");
            String name = input.nextLine();

            System.out.print("What's your age?: ");
            int age = Integer.parseInt(input.nextLine());

            System.out.println("\nAwesome " + name + ", let the quiz begin!\n");
            Quiz.startQuiz();

        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a number.");
            return;
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
            return;
        }
    }
}
