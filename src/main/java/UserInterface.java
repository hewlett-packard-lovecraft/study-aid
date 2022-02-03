import java.util.ArrayList;

public class UserInterface {
    public ArrayList<Quiz> quizzes;

    public UserInterface(ArrayList<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public void newQuiz(Quiz quiz) {
        this.quizzes.add(quiz);
    }

    public void runQuiz(String name) {
        Question[] myQuiz;
        int score = 0;

        for (Quiz quiz : this.quizzes) {
            if (quiz.quizName.equals(name)) {
                myQuiz = quiz.tenRandomQuestions();
            } else {
                System.out.println("Quiz not found.");
                return;
            }
        }

        for (Quiz quiz : this.quizzes) {
            System.out.println("Question: " + quiz.);
        }





    }
}
