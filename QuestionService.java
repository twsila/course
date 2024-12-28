import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    QuestionService(){
        questions[0] = new Question(1,"What is my Favorite Programming Language","Java","CPP","C-Sharp","Python","Java");
        questions[1] = new Question(2,"What is my Favorite Car Model","Toyota","Range Rover","BMW","Mercedes","Range Rover");
        questions[2] = new Question(3,"What is my Favorite Country to travel","UK","UAE","USA","Asia","USA");
        questions[3] = new Question(4,"What is my Favorite meal","Kabsa","Foul","Shawarma","Hamburger","Hamburger");
        questions[4] = new Question(5,"What is make happy in life ","Money","Power","Family and Health","Cars","Family and Health");

    }
    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
            System.out.println("-----");

        }
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}