package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*ImageIcon spaceBackground = new ImageIcon("/background/space_background.png");
        JLabel background = new JLabel("", spaceBackground, JLabel.CENTER);
        background.setSize(768, 768);
        background.setLayout(new FlowLayout());
        background.setBounds(0, 0, 768, 768);*/

        JFrame window = new JFrame();
        //window.add(background);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("WARBLADE DEMO 2.0");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}