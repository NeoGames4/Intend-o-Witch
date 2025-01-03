package game;

import java.util.ArrayList;

public class Game {

	public static final Player player = new Player(0, 0);
	
	public static final ArrayList<Thingy> things = new ArrayList<>();
	{{
		things.add(new Thingy());
	}}

}
