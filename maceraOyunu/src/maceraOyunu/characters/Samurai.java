package maceraOyunu.characters;

public class Samurai extends Characters {
	private int id = 1;
	private int damage = 5;
	private int health = 21;
	private int money = 15;

	public int getId() {
		return id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
