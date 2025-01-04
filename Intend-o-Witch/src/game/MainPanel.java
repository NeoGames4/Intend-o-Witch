package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	public static final Color GRASS_COLOR = new Color(40, 160, 35),
							  NEXT_THING_HIGHLIGHT_COLOR = Color.WHITE;
	
	public static final int	  NEXT_THING_HIGHLIGHT_THICKNESS = 3;

	public MainPanel() {
		setBackground(GRASS_COLOR);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// Update & draw things
		int playerScreenX = getWidth() / 2;
		int playerScreenY = getHeight() / 2;
		float objectOffsetX = playerScreenX - Player.x;
		float objectOffsetY = playerScreenY - Player.y;
		
		Thingy closestThing = null;
		float closestThingDistance = Player.range;
		
		for(Thingy t : Game.things) {
			g2.fillOval(Math.round(objectOffsetX + t.x - t.radius()), Math.round(objectOffsetY + t.y - t.radius()), 2*Player.rInt(), 2*Player.rInt());
			if(Player.distanceTo(t) < closestThingDistance) {
				closestThing = t;
				closestThingDistance = Player.distanceTo(t);
			}
		}
		
		if(closestThing != null) {
			g2.setColor(NEXT_THING_HIGHLIGHT_COLOR);
			g2.setStroke(new BasicStroke(NEXT_THING_HIGHLIGHT_THICKNESS));
			g2.drawOval(
				Math.round(objectOffsetX + closestThing.x - closestThing.radius()),
				Math.round(objectOffsetY + closestThing.y - closestThing.radius()),
				2*closestThing.rInt(),
				2*closestThing.rInt()
			);
		}
		
		// Draw player
		g2.setColor(Player.color);
		g2.fillOval(playerScreenX - Player.rInt(), playerScreenY - Player.rInt(), 2*Player.rInt(), 2*Player.rInt());
	}
}
