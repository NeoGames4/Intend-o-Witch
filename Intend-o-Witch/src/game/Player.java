package game;

import java.awt.Color;
import java.util.HashMap;

import pi.Joystick;

public class Player {

	public static float x = 0, y = 0, direction = 0;
	
	public static float radius = 10,
						range  = 500,
						health = 100;
	
	public static final HashMap<Thingy, Integer> inventory = new HashMap<>();
	
	public static final Color color = new Color(100, 80, 15);
	
	public static final float VELOCITY_MULTIPLIER = 2;
	
	public static float distanceTo(float x, float y) {
		return (float) Math.hypot(x-Player.x, y-Player.y);
	}
	
	public static float distanceTo(Thingy t) {
		return distanceTo(t.x, t.y);
	}
	
	// FLOAT TO INT
	
	public static int xInt() {
		return Math.round(x);
	}
	
	public static int yInt() {
		return Math.round(y);
	}
	
	public static int rInt() {
		return Math.round(radius);
	}
	
	// UPDATE
	
	public static void tick() {
		float vx = Joystick.readX();
		float vy = Joystick.readY();
		
		float vt = (float) Math.hypot(vx, vy);
		
		if(vt > 1) {
			vx /= vt;
			vy /= vt;
		}
		
		vx = Math.round(vx*10f)/10f;
		vy = Math.round(vy*10f)/10f;
		
		direction = (float) Math.atan2(vy, vx);
		
		x += vx * VELOCITY_MULTIPLIER;
		y += vy * VELOCITY_MULTIPLIER;
	}

}
