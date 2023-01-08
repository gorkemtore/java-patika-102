package maceraOyunu2.places;

import maceraOyunu2.game.Game;
import maceraOyunu2.game.Player;

public abstract class Location {

	public Player player;
	public String name;
	public Location() {
		player = new Player();
		player.character = Game.character;
		player.inventory= Game.inventory;
		
	}
	
	public abstract void onLocation();
	
}
