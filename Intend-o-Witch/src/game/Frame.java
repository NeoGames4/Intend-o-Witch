package game;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pi.Launcher;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 1L; // ...
	
	public Frame(JPanel mainPanel) {
    	add(mainPanel);
        
        setSize(480, 320);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB),
                new Point(0, 0),
                "Hidden"
        ));

        setTitle(Launcher.TITLE + " v" + Launcher.VERSION);
        setVisible(true);
    }
}
