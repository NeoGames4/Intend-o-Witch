package game;

import java.awt.Color;

public class SolidThingy extends Thingy {
	
	public float health;

	public SolidThingy(float x, float y, float radius, Color defaultColor, float health) {
		super(x, y, radius, defaultColor);
		this.health = health;
	}

}
