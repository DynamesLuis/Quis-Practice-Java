import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizFrame frame = new QuizFrame();
        });
    }
}