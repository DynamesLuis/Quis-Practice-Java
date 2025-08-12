import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    Color mainColor = new Color(36,42,97);
    Font questionFont = new Font("Times New Roman", Font.BOLD, 20);
    Font answerFont = new Font("Times New Roman", Font.PLAIN, 16);

    public MainPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(new Color(0, 0, 0, 0));
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
        //components
        JTextArea questionText = new JTextArea("What is the difference between an abstract class and an interface?");
        questionText.setBackground(new Color(0, 0, 0, 0));
        questionText.setFont(questionFont);
        questionText.setForeground(Color.white);
        questionText.setLineWrap(true);
        questionText.setWrapStyleWord(true);
        questionText.setMaximumSize(new Dimension(600, 200));
        questionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextArea answerText = new JTextArea("An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods. A class can implement multiple interfaces but can extend only one abstract class.");
        answerText.setBackground(new Color(0, 0, 0, 0));
        answerText.setFont(answerFont);
        answerText.setForeground(Color.white);
        answerText.setLineWrap(true);
        answerText.setWrapStyleWord(true);
        answerText.setMaximumSize(new Dimension(600, 150));
        answerText.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton showBtn = new JButton("Show answer");
        JButton nextBtn = new JButton("Next Answer");
        showBtn.setBackground(Color.white);
        showBtn.setForeground(mainColor);
        showBtn.setBorderPainted(false);
        showBtn.setFocusPainted(false);
        showBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextBtn.setBackground(Color.white);
        nextBtn.setForeground(mainColor);
        nextBtn.setBorderPainted(false);
        nextBtn.setFocusPainted(false);
        nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        btnPanel.setBackground(mainColor);
        btnPanel.add(showBtn);
        btnPanel.add(nextBtn);

        innerPanel.add(questionText);
        innerPanel.add(Box.createVerticalStrut(50));
        innerPanel.add(answerText);
        innerPanel.add(Box.createVerticalStrut(50));
        innerPanel.add(btnPanel);

        //this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(mainColor);
        this.add(innerPanel);
        //this.add(questionText);
        //this.add(Box.createVerticalStrut(20));
        //this.add(answerText);
        //this.add(Box.createVerticalStrut(20));
        //this.add(btnPanel);
    }

}
