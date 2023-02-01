package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {
    JFrame jFrame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton buttons [] = new JButton[9];
    boolean player1turn;
    Random random = new Random();
    TicTacToe() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,800);
        jFrame.getContentPane().setBackground(new Color(50,50,50));
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(true);

        textField.setBackground(new Color(19, 17, 17, 255));
        textField.setForeground(new Color(166, 83, 245));
        textField.setFont(new Font("Brush Script MT",Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic Tac Toe");
        textField.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,800,100);

        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setBackground(new Color(123, 47, 162));

        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Brush Script MT", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlePanel.add(textField);
        jFrame.add(titlePanel, BorderLayout.NORTH);
        jFrame.add(buttonPanel);

        firstTurn();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void firstTurn() {
    }

    public void check() {

    }

    public void xWins (int a, int b, int c) {

    }

    public void oWins (int a, int b, int c) {

    }
}
