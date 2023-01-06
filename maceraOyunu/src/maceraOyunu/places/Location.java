package maceraOyunu.places;

import maceraOyunu.game.Player;

public abstract class Location {
	public Player player;
	public String name;

	public void Locations() {
		
	}
	abstract boolean onLocation();
	
}
