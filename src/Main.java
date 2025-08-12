import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //QuestionList questions = new QuestionList();
        //Question question = questions.getRandomQuestion();

        //System.out.println(question.getQuestion());
        //System.out.println(question.getAnswer());
        SwingUtilities.invokeLater(() -> {
            QuizFrame frame = new QuizFrame();
        });
    }
}