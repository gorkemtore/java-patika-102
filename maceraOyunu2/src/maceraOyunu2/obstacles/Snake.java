package maceraOyunu2.obstacles;

import java.util.Random;

public class Snake extends Obstacle {

	public Snake() {
		Random rnd = new Random();
		int dmg = rnd.nextInt(3,7);//3-6 arası damage
		this.setDamage(dmg);
	}
	
	private String name = "Snake";
	private int id = 4;
	private int health = 12;
	private int damage;// 3-6 arası
	private int money=0;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
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

	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
