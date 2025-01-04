package game;

import java.awt.Color;

public class Thingy {
	
	public float x, y;
	
	private float radius = 10;
	
	private Color defaultColor = Color.RED;

	public Thingy(float x, float y, float radius, Color defaultColor) {
		this.x = x;
		this.y = y;
		setRadius(radius);
		setDefaultColor(defaultColor);
	}
	
	public float distanceTo(float x, float y) {
		return (float) Math.hypot(x-this.x, y-this.y);
	}
	
	// SETTER
	
	/**
	 * @param radius must be larger than 0.
	 * @return itself.
	 */
	public Thingy setRadius(float radius) {
		if(radius <= 0)
			throw new IllegalArgumentException("The radius must be larger than 0.");
		
		this.radius = radius;
		
		return this;
	}
	
	/**
	 * @param color must not be null.
	 * @return itself.
	 */
	public Thingy setDefaultColor(Color color) {
		if(color == null)
			throw new IllegalArgumentException("The default color must not be null.");
		
		defaultColor = color;
		
		return this;
	}
	
	// GETTER
	
	public float radius() {
		return radius;
	}
	
	public int xInt() {
		return Math.round(x);
	}
	
	public int yInt() {
		return Math.round(y);
	}
	
	public int rInt() {
		return Math.round(radius);
	}
	
	public Color defaultColor() {
		return defaultColor;
	}

}
