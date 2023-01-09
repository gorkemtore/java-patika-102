package maceraOyunu2.places;

import maceraOyunu2.obstacles.Obstacle;

public class Cave extends BattleLocation {
	public Cave(Obstacle o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLocation() {
		
		if(chance()==1) {
			characterShot();
		}else {
			obstacleShot();
		}
		
		if (player.character.getHealth() > 0) {
			if (!player.inventory.isFood()) {

				System.out.println("Görev tamamlandı! Kazandığın yemek envanterine eklendi!");
			}
			player.inventory.setFood(true);
			System.out.println("Kazandığın ganimet para : " + loot);
			player.character.setMoney(player.character.getMoney() + loot);// ganimet parası eklendi.

		}

	}
}
