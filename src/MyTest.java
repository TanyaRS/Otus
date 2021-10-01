public class MyTest {

    String dialog = "Ответьте на вопросы, выбрав один из варинтов ответов:";
    String[] qwestion = {"Кто умеет мяукать?", "у кого длинные уши?", "Кто умеет бегать"};

    String answerOption1 = "- Собака" + "\n" + "- Кошка" + "\n" + "- Петух";
    String answerOption2 = "- Заяц" + "\n"+ "- Курица" +"\n" + "- Коза";
    String answerOption3 = "- Змея"+"\n"+"- Собака"+"\n"+"- Гусеница";

    public void showDialog() {

        System.out.println(this.dialog);
    }

    void showQestion1() {
        System.out.println(this.qwestion[0]);
    }

    void showAnswerOption1() {
        System.out.println(this.answerOption1);
    }
    void showQestion2() {
        System.out.println(this.qwestion[1]);
    }

    void showAnswerOption2() {
        System.out.println(this.answerOption2);
    }
    void showQestion3() {
        System.out.println(this.qwestion[2]);
    }

    void showAnswerOption3() {
        System.out.println(this.answerOption3);
    }
}
