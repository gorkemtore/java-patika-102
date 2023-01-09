package maceraOyunu2.places;

import java.util.Random;

import maceraOyunu2.obstacles.Obstacle;

public abstract class BattleLocation extends Location {

	public int loot;
	public int x;

	public Obstacle obstacle;
	public String obstacleName;
	public BattleLocation(Obstacle o) {
		this.obstacle = o;
		obstacleName = o.getName();
	}

	@Override
	public void onLocation() {
		// TODO Auto-generated method stub

	}

	public int chance() {
		Random rnd = new Random();
		return rnd.nextInt(1,3);//1 ya da 2 döndürür.
	}

	public void characterShot() {
		int healthObstacle = obstacle.getHealth();
		Random rnd = new Random();
		x = rnd.nextInt(1, 4);// 1-3 adet rastgele canavar
		loot = 0;
		int playerDamage = player.character.getDamage() + player.inventory.getWeaponDamage();
		System.out.println(x + " tane " + obstacle.getName() + " üretilecek!!\n");
		for (int i = 0; i < x; i++) {
			
			while (player.character.getHealth() > 0 && obstacle.getHealth() > 0) {

				// KARAKTER VURUŞ
				System.out.println(player.character.getName() + " vuruyor...");
				obstacle.setHealth(obstacle.getHealth() - playerDamage);

				if (obstacle.getHealth() > 0) {
					System.out.println((i + 1) + ". " + obstacle.getName() + " kalan can : " + obstacle.getHealth());
				} else {
					System.out.println("\n" + (i + 1) + ". " + obstacle.getName() + " öldü!\n");
					loot += obstacle.getMoney();
					obstacle.setHealth(healthObstacle);
					
					break;
				}

				// CANAVAR VURUŞ
				System.out.println((i + 1) + ". " + obstacle.getName() + " vuruyor...");
				if(!(player.inventory.getArmorDefance()>obstacle.getDamage())) {//kullanıcının zırhı, canavarın hasarından büyük değilse
					player.character.setHealth(
							player.character.getHealth() - (obstacle.getDamage() - player.inventory.getArmorDefance()));
				}
				
				if (player.character.getHealth() > 0) {
					System.out.println(player.character.getName() + " adlı karakterin kalan canı : "
							+ player.character.getHealth());
				} else {
					System.out.println("Oyuncu öldü!!!!");
					break;
				}

			}

		}

	}

	public void obstacleShot() {
		int healthObstacle = obstacle.getHealth();
		Random rnd = new Random();
		x = rnd.nextInt(1, 4);// 1-3 adet rastgele canavar
		loot = 0;
		int playerDamage = player.character.getDamage() + player.inventory.getWeaponDamage();
		System.out.println(x + " tane " + obstacle.getName() + " üretilecek!!\n");
		for (int i = 0; i < x; i++) {
			
			//canavar üret
			
			
			
			while (player.character.getHealth() > 0 && obstacle.getHealth() > 0) {

				// CANAVAR VURUŞ
				System.out.println((i + 1) + ". " + obstacle.getName() + " vuruyor...");
				if(!(player.inventory.getArmorDefance()>obstacle.getDamage())) {//kullanıcının zırhı, canavarın hasarından büyük değilse
					player.character.setHealth(
							player.character.getHealth() - (obstacle.getDamage() - player.inventory.getArmorDefance()));
				}
				if (player.character.getHealth() > 0) {
					System.out.println(player.character.getName() + " adlı karakterin kalan canı : "
							+ player.character.getHealth());
				} else {
					System.out.println("Oyuncu öldü!!!!");
					break;
				}

				// KARAKTER VURUŞ
				System.out.println(player.character.getName() + " vuruyor...");
				obstacle.setHealth(obstacle.getHealth() - playerDamage);

				if (obstacle.getHealth() > 0) {
					System.out.println((i + 1) + ". " + obstacle.getName() + " kalan can : " + obstacle.getHealth());
				} else {
					System.out.println("\n" + (i + 1) + ". " + obstacle.getName() + " öldü!\n");
					loot += obstacle.getMoney();
					obstacle.setHealth(healthObstacle);
					
					break;
				}

			}
		}

	}

}
