package maceraOyunu2.places;

import maceraOyunu2.obstacles.Obstacle;

public abstract class BattleLocation extends Location{
	
	public Obstacle obstacle;
	
	public BattleLocation(Obstacle o) {
		this.obstacle = o;
	}

	@Override
	public void onLocation() {
		// TODO Auto-generated method stub
		
	}

}
