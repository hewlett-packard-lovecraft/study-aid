import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public ArrayList<Quiz> quizzes;

    public UserInterface(ArrayList<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public void newQuiz(String name) {
        String quizName = name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<Question>();

        if (quizName.equals("")) {
            System.out.println("What would you like your quiz to be named?");
            quizName = scanner.nextLine();
        }

        for (Quiz quiz : this.quizzes) {
            if (quiz.quizName.equals(name)) {
                System.out.println("An existing quiz possesses the same name!");
                return;
            }
        }

        for (int i = 0; i < 20; i++) {
            String qName;
            String qDescriptionText;
            String qAnswer;

            System.out.println("Enter the question: (" + i+1 + "/20)");
            qName = scanner.nextLine();

            System.out.println("Enter the answer: (" + i+1 + "/20)");
            qAnswer = scanner.nextLine();

            System.out.println("Enter the answer's explanation, if any: (" + i+1 + "/20)");
            qDescriptionText = scanner.nextLine();

            questions.add(new Question(qName, qAnswer, qDescriptionText));
        }

        this.quizzes.add(new Quiz(quizName, questions));
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
            System.out.println(q.getAnswer());
            System.out.println("Explanation: " + q.getDescriptionText());
            scan.nextLine();
        }
    }

    public void listQuizzes() {
        System.out.println("Your quizzes are:");
        ArrayList<Quiz> quizzes = this.quizzes;
        for (Quiz quiz : quizzes) {
            System.out.println(quiz.quizName);
        }
    }

    public void help() {
        System.out.println(
                """
                Usage:
                run [quiz]      View elect 10 questions of an existing quiz
                rm [quiz]       Remove an existing quiz
                new [quiz name] Create a 20 question quiz with the interactive cli
                """
        );
    }
}
