package maceraOyunu2.places;

import maceraOyunu2.characters.Characters;

public class SafeHouse extends NormalLocation {

	public SafeHouse() {
		
	}

	public void onLocation() {

		System.out.println("\nŞuan SafeHouse konumundasınız. Can değeriniz yenilenecek!!!!");
		for (Characters character : player.chars) {
			if (character.getName() == player.character.getName()) {
				player.character.setHealth(character.getHealth());
				System.out.println("Base can yeniledi! Mevcut can : " + player.character.getHealth()+"\n");
			}
		}
	}
}
