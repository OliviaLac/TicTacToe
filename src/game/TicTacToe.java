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
        jFrame.setTitle("Tic Tac Toe");

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
        for(int i=0; i<9; i++) {
            if(e.getSource()==buttons[i]){
                if(player1turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(123, 47, 162));
                        buttons[i].setText("X");
                        player1turn=false;
                        textField.setText("O turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(123, 47, 162));
                        buttons[i].setText("O");
                        player1turn=true;
                        textField.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        if(random.nextInt(2)==0) {
            player1turn=true;
            textField.setText("X turn");
        }
        else{
            player1turn=false;
            textField.setText("O turn");
        }
    }

    public void check() {
        int A = 0;
        int B = 1;
        int C = 2;
        // X wins
        String testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 3;
        B = 4;
        C = 5;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 6;
        B = 7;
        C = 8;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 0;
        B = 3;
        C = 6;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 1;
        B = 4;
        C = 7;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 2;
        B = 5;
        C = 8;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 0;
        B = 4;
        C = 8;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        A = 2;
        B = 4;
        C = 6;
        testWinner = "X";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ xWins(A,B,C); }

        // O wins

        A = 0;
        B = 1;
        C = 2;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 3;
        B = 4;
        C = 5;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 6;
        B = 7;
        C = 8;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 0;
        B = 3;
        C = 6;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 1;
        B = 4;
        C = 7;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 2;
        B = 5;
        C = 8;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 0;
        B = 4;
        C = 8;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

        A = 2;
        B = 4;
        C = 6;
        testWinner = "O";
        if((buttons[A].getText()==testWinner) && (buttons[B].getText()==testWinner) && (buttons[C].getText()==testWinner)){ oWins(A,B,C); }

    }

    public void xWins (int a, int b, int c) {
       buttons[a].setBackground(new Color(123, 47, 162));
       buttons[b].setBackground(new Color(123, 47, 162));
       buttons[c].setBackground(new Color(123, 47, 162));

       for(int i=0;i<9;i++) {
           buttons[i].setEnabled(false);
       }
       textField.setText("X wins");
    }

    public void oWins (int a, int b, int c) {
        buttons[a].setBackground(new Color(123, 47, 162));
        buttons[b].setBackground(new Color(123, 47, 162));
        buttons[c].setBackground(new Color(123, 47, 162));

        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("O wins");
    }
    }

