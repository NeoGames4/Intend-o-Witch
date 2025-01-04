package pi;

import game.Frame;
import game.MainPanel;

public class Launcher {
	
	public static final String	TITLE	= "Intend-o-Witch",
								VERSION	= "0.x";
	
	public static final int FPS = 30;

	public static MainPanel mainPanel = new MainPanel();
	public static Frame frame = new Frame(mainPanel);
	
	public static void main(String[] args) {
		System.out.println("Launching " + TITLE + " v" + VERSION + "...");
	}

}
