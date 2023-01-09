package maceraOyunu2.places;

import maceraOyunu2.obstacles.Obstacle;

public class River extends BattleLocation {

	public River(Obstacle o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	public void onLocation() {

		if(chance()==1) {
			characterShot();
		}else {
			obstacleShot();
		}

		if (player.character.getHealth() > 0) {

			if (player.inventory.isWater() == false) {

				System.out.println("Görev tamamlandı! Kazandığın su envanterine eklendi!");
			}
			player.inventory.setWater(true);
			System.out.println("Kazandığın ganimet para : " + loot);
			player.character.setMoney(player.character.getMoney() + loot);// ganimet parası eklendi.

		}
	}

}
