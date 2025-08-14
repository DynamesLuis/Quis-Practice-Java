import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    Color mainColor = new Color(36,42,97);
    Font questionFont = new Font("Times New Roman", Font.BOLD, 20);
    Font answerFont = new Font("Times New Roman", Font.PLAIN, 16);
    QuestionList questions;
    JTextArea questionText;
    JTextArea answerText;
    JPanel innerPanel;
    JButton showBtn;
    JButton nextBtn;
    JPanel btnPanel;
    Question question;
//agregando elementos como atributos
    public MainPanel() {
        questions = new QuestionList();
        question = questions.getRandomQuestion();
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        innerPanel = new JPanel();
        innerPanel.setBackground(mainColor);
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
        //components
        questionText = new JTextArea(question.getQuestion());
        questionText.setBackground(new Color(0, 0, 0, 0));
        questionText.setFont(questionFont);
        questionText.setForeground(Color.white);
        questionText.setLineWrap(true);
        questionText.setWrapStyleWord(true);
        questionText.setMaximumSize(new Dimension(600, 200));
        questionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerText = new JTextArea(question.getAnswer());
        answerText.setBackground(new Color(0, 0, 0, 0));
        answerText.setFont(answerFont);
        answerText.setForeground(Color.white);
        answerText.setLineWrap(true);
        answerText.setWrapStyleWord(true);
        answerText.setMaximumSize(new Dimension(600, 150));
        answerText.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerText.setVisible(false);
        showBtn = new JButton("Show answer");
        nextBtn = new JButton("Next Answer");
        showBtn.setBackground(Color.white);
        showBtn.setForeground(mainColor);
        showBtn.setBorderPainted(false);
        showBtn.setFocusPainted(false);
        showBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        showBtn.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
               System.out.println("show btn clicked");
               answerText.setVisible(true);
               revalidate();
               repaint();
            }
        });
        nextBtn.setBackground(Color.white);
        nextBtn.setForeground(mainColor);
        nextBtn.setBorderPainted(false);
        nextBtn.setFocusPainted(false);
        nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                question = questions.getRandomQuestion();
                questionText.setText(question.getQuestion());
                answerText.setText(question.getAnswer());
                answerText.setVisible(false);
                revalidate();
                repaint();
            }
        });
        btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        btnPanel.setBackground(mainColor);
        btnPanel.add(showBtn);
        btnPanel.add(nextBtn);

        innerPanel.add(questionText);
        //innerPanel.add(Box.createVerticalStrut(50));
        innerPanel.add(Box.createRigidArea(new Dimension(0, 50)));

        innerPanel.add(answerText);
        innerPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        //innerPanel.add(Box.createVerticalStrut(50));
        innerPanel.add(btnPanel);

        this.setBackground(mainColor);
        this.add(innerPanel, gbc);
        //this.add(innerPanel);
    }

}
