import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GuiGame {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

    public static void main(String[] args) {

        new GuiGame();

    }

    public GuiGame() {

        // Creating the display
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        con = window.getContentPane();
        // title panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Adventure Game");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        // start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        startButton.addActionListener(tsHandler);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //
        window.setVisible(true);
    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        // Choice panel

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(choiceButtonPanel);

        // Option buttons
        // 1
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        // 2
        choice2 = new JButton("Choice 2 ");
        choice2.setBackground(Color.black);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        // 3
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        // 4
        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);

    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            createGameScreen();
        }
    }
}