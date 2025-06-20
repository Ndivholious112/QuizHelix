import java.util.*;

public class Quiz {

    public static void startQuiz() {
        try {
            List<Question> questions = CreateQuestions.createQuestions();
            Collections.shuffle(questions);
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            for (int i = 0; i < 10; i++) {
                Question q = questions.get(i);
                String[] shuffledOptions = q.getOption().clone();
                List<String> shuffledList = Arrays.asList(shuffledOptions);
                Collections.shuffle(shuffledList);
                shuffledOptions = shuffledList.toArray(new String[0]);

                System.out.println("\nQuestion " + (i + 1) + ": " + q.getQuestion());
                char[] labels = {'A', 'B', 'C', 'D'};
                Map<Character, String> optionMap = new HashMap<>();

                for (int j = 0; j < shuffledOptions.length; j++) {
                    System.out.println(labels[j] + ": " + shuffledOptions[j]);
                    optionMap.put(labels[j], shuffledOptions[j]);
                }

                System.out.print("Your answer: ");
                char userAnswer;

                try {
                    userAnswer = scanner.nextLine().toUpperCase().charAt(0);

                    if (!optionMap.containsKey(userAnswer)) {
                        System.out.println("Invalid choice. Skipping question.");
                        continue;
                    }

                    String correctAnswerText = q.getOption()[q.getCorrectAnswer() - 'A'];
                    if (optionMap.get(userAnswer).equals(correctAnswerText)) {
                        score++;
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input. Skipping this question.");
                }
            }

            int percentage = (score * 100) / 10;
            System.out.println("\nYou scored " + score + "/10 (" + percentage + "%)");

            if (percentage < 40) {
                System.out.println("Result: Failed");
            } else if (percentage < 50) {
                System.out.println("Result: Supplementary");
            } else if (percentage < 80) {
                System.out.println("Result: Passed");
            } else {
                System.out.println("Result: Distinction");
            }

        } catch (Exception e) {
            System.out.println("An error occurred while running the quiz. Please restart.");
        }
    }
}
