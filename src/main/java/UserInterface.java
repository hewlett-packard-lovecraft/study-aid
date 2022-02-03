import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public ArrayList<Quiz> quizzes;

    public UserInterface(ArrayList<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public void newQuiz(Quiz quiz) {
        this.quizzes.add(quiz);
    }

    public void runQuiz(String name) {
        Question[] myQuiz = new Question[0];

        for (Quiz quiz : this.quizzes) {
            if (quiz.quizName.equals(name)) {
                myQuiz = quiz.tenRandomQuestions();
            } else {
                System.out.println("Quiz not found.");
                return;
            }
        }

        for (Question q : myQuiz) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Question: " + q.question);
            System.out.println("Press enter to reveal the answer");
            scan.nextLine();

            System.out.println("Question");
        }
    }
}
