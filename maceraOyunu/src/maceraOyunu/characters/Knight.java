package maceraOyunu.characters;

public class Knight extends Characters {
	private int id = 3;
	private int damage = 8;
	private int health = 24;
	private int money = 5;

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
