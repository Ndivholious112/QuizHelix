public class Question {
    private String question;
    private char correctAnswer;
    private String option[];

    public Question(String question, char correctAnswer, String[] option) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.option = option;
    }

    public String getQuestion() {
        return question;
    }
    public char getCorrectAnswer() {
        return correctAnswer;
    }
    public String[] getOption() {
        return option;
    }
}
