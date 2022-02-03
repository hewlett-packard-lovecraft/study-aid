public class Question {
    public String question;
    private String answer;
    private String descriptionText;

    public Question(String _question, String _answer, String _descriptionText) {
        this.question = _question;
        this.answer = _answer;
        this.descriptionText = _descriptionText;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getDescriptionText() {
        return this.descriptionText;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

}
