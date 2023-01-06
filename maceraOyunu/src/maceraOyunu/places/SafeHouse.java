package maceraOyunu.places;

import maceraOyunu.characters.Characters;
import maceraOyunu.game.Game;
import maceraOyunu.game.Player;

public class SafeHouse extends NormalLocation {
	public Player player;
	private String name = "SafeHouse";
	Game game = new Game();
	public Characters character = game.character;
	
	public String getName() {
		return name;
	}

	public SafeHouse() {
		
		
	}

	public void increaseHealth(Characters characters) {
		System.out.println(game.character.getName());
		//player.setHealthy(player.selectChar().getHealth());
		//System.out.println(player.getHealthy());

	}

}
