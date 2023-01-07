package maceraOyunu.places;

import maceraOyunu.game.Player;

public class SafeHouse extends NormalLocation {
	private String name = "SafeHouse";
	public Player player;
	public String getName() {
		return name;
	}
	
	public SafeHouse() {
		
	}

	public static void increaseHealth() {
		
		//player.setHealthy(player.selectChar().getHealth());
		//System.out.println(player.getHealthy());

	}

}
