package maceraOyunu.places;

import maceraOyunu.obstacles.Obstacle;

public abstract class BattleLocation extends Location{
	Obstacle obstacle;
	
	public BattleLocation(Obstacle o) {
		this.obstacle=o;
	}
	public BattleLocation() {
		// TODO Auto-generated constructor stub
	}
	
	abstract boolean onLocation();
	abstract void combat();
}
