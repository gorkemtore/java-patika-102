package maceraOyunu2.places;

import maceraOyunu2.characters.Characters;
import maceraOyunu2.game.Player;

public class SafeHouse extends NormalLocation{
	public SafeHouse(Player player) {
		super(player);
		this.player = player;
	}
	public void onLocation() {
		for (Characters character : player.chars) {
			if(character.getName() == player.character.getName()) {
				player.character.setHealth(character.getHealth());
				System.out.println("Base can yeniledi! Mevcut can : "+player.character.getHealth());
			}
		}
	}
}
