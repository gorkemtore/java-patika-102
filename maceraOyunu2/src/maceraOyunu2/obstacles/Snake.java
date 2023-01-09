package maceraOyunu2.obstacles;

import java.util.Random;

public class Snake extends Obstacle {
	static Random rnd = new Random();
	static int dmg = rnd.nextInt(3,7);//3-6 arası damage
	public Snake() {
		super("Snake", 4, dmg, 12, 0);
		
		this.setDamage(dmg);
	}
	public String lootItem() {
		Random rnd = new Random();
		int possibility = rnd.nextInt(1, 101);

		if (possibility > 45 && possibility <= 60) {

			@SuppressWarnings("unused")
			Random gun = new Random();
			int chance = rnd.nextInt(1, 101);
			if (chance <= 20) {
				return "Tüfek";
			} else if (chance <= 50) {
				return "Kılıç";
			} else {
				return "Tabanca";
			}

		} else if (possibility > 60 && possibility <= 75) {

			@SuppressWarnings("unused")
			Random armor = new Random();
			int chance = rnd.nextInt(1, 101);
			if (chance <= 20) {
				return "Ağır";
			} else if (chance <= 50) {
				return "Orta";
			} else {
				return "Hafif";
			}

		} else if (possibility > 75 && possibility <= 100) {
			@SuppressWarnings("unused")
			Random money = new Random();
			int chance = rnd.nextInt(1, 101);
			if (chance <= 20) {
				return "10";
			} else if (chance <= 50) {
				return "5";
			} else {
				return "1";
			}
		} else {
			return null;
		}

	}

}
