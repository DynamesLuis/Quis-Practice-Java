import javax.swing.*;

public class QuizFrame extends JFrame {
    int widthWindow = 700;
    int heightWindow = 500;

    public QuizFrame() {
        JPanel mainPanel = new MainPanel();
        this.add(mainPanel);
        this.setTitle("Quiz Java :D");
        this.setSize(widthWindow, heightWindow);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
