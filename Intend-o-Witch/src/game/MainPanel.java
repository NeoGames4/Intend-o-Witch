package game;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

	public MainPanel() {
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int playerScreenX = getWidth() / 2;
		int playerScreenY = getHeight() / 2;
		int objectOffsetX = playerScreenX - Player.x;
		int objectOffsetY = playerScreenY - Player.y;
	}
}
