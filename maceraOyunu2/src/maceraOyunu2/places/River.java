package maceraOyunu2.places;

import java.util.Random;

import maceraOyunu2.obstacles.Bear;
import maceraOyunu2.obstacles.Obstacle;

public class River extends BattleLocation {

	public River(Obstacle o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	public void onLocation() {
		Random rnd = new Random();
		int x = rnd.nextInt(1, 4);// 1-3 adet rastgele canavar
		int loot = 0;
		// ilk vuruşu biz yapacağız
		int playerDamage = player.character.getDamage() + player.inventory.getWeaponDamage();

		System.out.println(x + " tane ayı üretilecek!!\n");
		for (int i = 0; i < x; i++) {
			obstacle = new Bear();

			while (player.character.getHealth() > 0 && obstacle.getHealth() > 0) {
				System.out.println(player.character.getName() + " vuruyor...");
				obstacle.setHealth(obstacle.getHealth() - playerDamage);

				if (obstacle.getHealth() > 0) {
					System.out.println((i + 1) + ". Ayı kalan can : " + obstacle.getHealth());
				} else {
					System.out.println("\n" + (i + 1) + ". Ayı öldü!\n");
					loot += obstacle.getMoney();
					break;
				}

				System.out.println("Ayı vuruyor...");
				player.character.setHealth(player.character.getHealth() - (obstacle.getDamage()-player.inventory.getArmorDefance()));
				//playerHealth -= (obstacle.getDamage()-player.inventory.getArmorDefance());
				if(player.character.getHealth()>0) {
					System.out.println(
							player.character.getName() + " adlı karakterin kalan canı : " + player.character.getHealth());
				}else {
					System.out.println("Oyuncu öldü!!!!");
					break;
				}
			}
			
		}
		if (player.character.getHealth() > 0) {

			if (player.inventory.isWater()== false) {

				System.out.println("Görev tamamlandı! Kazandığın su envanterine eklendi!");
			}
			player.inventory.setWater(true);
			System.out.println("Kazandığın ganimet para : " + loot);
			player.character.setMoney(player.character.getMoney() + loot);// ganimet parası eklendi.
			
			
			
		}

	}

}
