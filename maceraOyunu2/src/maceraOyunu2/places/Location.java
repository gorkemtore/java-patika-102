package maceraOyunu2.places;

import maceraOyunu2.game.Player;

public abstract class Location {
	Player player;
	
	public String name;
	
	public Location(Player player) {
		this.player = player;		
	}
	
	public abstract void onLocation();
	
}
