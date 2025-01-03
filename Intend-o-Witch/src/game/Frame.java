package game;

import pi.Launcher;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        add(Launcher.mainPanel);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
