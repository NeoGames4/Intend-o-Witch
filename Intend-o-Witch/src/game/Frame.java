package game;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pi.Launcher;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 1L; // ...
	
	public Frame(JPanel mainPanel) {
    	add(mainPanel);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setTitle(Launcher.TITLE + " v" + Launcher.VERSION);
        setVisible(true);
        
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> {
			mainPanel.repaint();
			// …
		}, 50, (int) (1000d/Launcher.FPS), TimeUnit.MILLISECONDS);
    }
}
