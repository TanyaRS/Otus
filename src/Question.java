public class Question {

    private String qwestions;
    private String answerOption;
    private String correctAnswers;

    void showQestion() {
        System.out.println(this.qwestions);
    }

    void showAnswerOption() {
        System.out.println(this.answerOption);
    }

    public Question(String qwestions, String answerOption, String correctAnswers) {
        this.qwestions = qwestions;
        this.answerOption = answerOption;
        this.correctAnswers = correctAnswers;
    }

    boolean isCorrectAnswers (String userAnswer){
        return correctAnswers.equalsIgnoreCase(userAnswer);

    }

}
