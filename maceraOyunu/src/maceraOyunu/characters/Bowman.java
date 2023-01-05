package maceraOyunu.characters;

public class Bowman extends Characters {
	private int id = 2;
	private int damage = 7;
	private int health = 18;
	private int money = 20;

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
