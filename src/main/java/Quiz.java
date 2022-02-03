import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    public String quizName;
    private ArrayList<Question> questionBank;

    public Quiz(String name, ArrayList<Question> _questionBank) {
        this.questionBank = _questionBank;
        this.quizName = name
    }

    public Question[] tenRandomQuestions() {
        ArrayList<Question> random_questions = this.questionBank;
        Collections.shuffle(random_questions);
        return (Question[]) random_questions.subList(0,9).toArray();
    }
}
