package maceraOyunu2.characters;

public abstract class Characters {
	private String name;
	private int id;
	private int health;
	private int money;
	private int damage;

	
	public Characters(String name, int id, int health, int money, int damage) {
		super();
		this.name = name;
		this.id = id;
		this.health = health;
		this.money = money;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}