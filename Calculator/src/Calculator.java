import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.UIManager.setLookAndFeel;

public class Calculator {

    public static void main(String[] args) {

        JFrame welcome = new JFrame("Calculator App");

        JLabel message = new JLabel("Press this button below to begin!");

        JButton startButton = new JButton("Begin");
        Dimension buttonSize = new Dimension();
        buttonSize.setSize(500,150);
        startButton.setMinimumSize(buttonSize);

        welcome.add(message,BorderLayout.NORTH);
        welcome.add(startButton,BorderLayout.SOUTH);
        welcome.setSize(600,400);
        welcome.setVisible(true);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton.addActionListener((ActionEvent e) -> {

            welcome.setVisible(false);
            UserChoiceDialog.choiceDialog();

        } );

    } //end main

    public static void goodbye() {

        JFrame goodbye = new JFrame("Calculator App");

        JLabel endMessage = new JLabel("Thanks for using the calculator!");

        JButton endButton = new JButton("Exit");
        Dimension buttonSize = new Dimension();
        buttonSize.setSize(500,150);
        endButton.setMinimumSize(buttonSize);

        goodbye.add(endMessage,BorderLayout.NORTH);
        goodbye.add(endButton,BorderLayout.SOUTH);
        goodbye.setSize(300,200);
        goodbye.setVisible(true);
        goodbye.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        endButton.addActionListener((ActionEvent e) -> {

            goodbye.setVisible(false);
            System.exit(0);

        } );


    }

}
