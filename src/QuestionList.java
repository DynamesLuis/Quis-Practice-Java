import java.util.ArrayList;

public class QuestionList {
    private static final ArrayList<Question> questions = new ArrayList<>();

    public QuestionList() {
        ReadFile.readFile();
    }

    public Question getRandomQuestion() {
        int randomNum = (int)(Math.random() * questions.size()); // 0 to 100
        return questions.get(randomNum);
    }

    public static void  addQuestion(String data) {
        String[] parts = data.split("\\|");
        Question newQuestion = new Question(parts[0], parts[1]);
        questions.add(newQuestion);
    }
}
