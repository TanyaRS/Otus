import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;

        MyTest dialog = new MyTest();
        dialog.showDialog();

        Question[] questions1 = {new Question("Кто умеет мяукать?",
                "- Собака" + "\n" + "- Кошка" + "\n" + "- Петух",
                "кошка")
        };
        Question[] questions2 = {new Question("у кого длинные уши?",
                "- Заяц" + "\n" + "- Курица" + "\n" + "- Коза",
                "заяц")
        };
        Question[] questions3 = {new Question("Кто умеет бегать",
                "- Змея" + "\n" + "- Собака" + "\n" + "- Гусеница",
                "Собака")
        };
        for (Question question : questions1) {
            question.showQestion();
            question.showAnswerOption();
            String answer1 = sc.nextLine();
            if (question.isCorrectAnswers(answer1)) {
                x += 1;
            }
        }
        for (Question question : questions2) {
            question.showQestion();
            question.showAnswerOption();
            String answer2 = sc.nextLine();
            if (question.isCorrectAnswers(answer2)) {
                x += 1;
            }
        }
        for (Question question : questions3) {
            question.showQestion();
            question.showAnswerOption();
            String answer3 = sc.nextLine();
            if (question.isCorrectAnswers(answer3)) {
                x += 1;
            }
        }

        System.out.println("Количество правильных ответов:" + x);
    }
    }







