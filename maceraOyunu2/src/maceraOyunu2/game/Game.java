package maceraOyunu2.game;

import maceraOyunu2.places.Location;
import maceraOyunu2.places.SafeHouse;
import maceraOyunu2.places.ToolStore;

@SuppressWarnings("unused")
public class Game {
	public Player player;
	public Location location;

	Location[] locations = {new SafeHouse(player), new ToolStore(player)};
	public void start() throws Exception {
		player = new Player();
		player.selectChar();
//		System.out.println(player.character.getHealth());
//		location = new SafeHouse(player);
//		location.onLocation();
		
		

	}
}
