package game;

import java.awt.Color;
import java.util.ArrayList;

public class Game {
	
	public static final ArrayList<Thingy> things = new ArrayList<>();
	static {{
		things.add(new Thingy(20, 50, 5, Color.RED));
	}}

}
