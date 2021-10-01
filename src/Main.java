import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=0;

        String[] correctAnswers ={"Кошка", "Заяц", "Собака"};
        String[] correctAnswers1 ={"кошка", "заяц", "собака"};

        MyTest dialog=new MyTest();
        dialog.showDialog();

        MyTest qestion1=new MyTest();
        qestion1.showQestion1();

        MyTest answerOption1=new MyTest();
        answerOption1.showAnswerOption1();

        String  answer1= sc.nextLine();
        if (answer1.equals(correctAnswers[0])){
            x+=1;
        }
        if (answer1.equals(correctAnswers1[0])){
            x+=1;
        }
        MyTest qestion2=new MyTest();
        qestion2.showQestion2();

        MyTest answerOption2=new MyTest();
        answerOption2.showAnswerOption2();

        String  answer2= sc.nextLine();
        if (answer2.equals(correctAnswers[1])){
            x+=1;
        }
        if (answer2.equals(correctAnswers1[1])){
            x+=1;
        }
        MyTest qestion3=new MyTest();
        qestion1.showQestion3();

        MyTest answerOption3=new MyTest();
        answerOption3.showAnswerOption3();

        String  answer3= sc.nextLine();
        if (answer3.equals(correctAnswers[2])){
            x+=1;
        }
        if (answer3.equals(correctAnswers1[2])){
            x+=1;
        }

        System.out.println("Количество правильных ответов:"+ x);

    }
}






