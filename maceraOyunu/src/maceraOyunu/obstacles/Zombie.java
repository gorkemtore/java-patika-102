package maceraOyunu.obstacles;

public class Zombie extends Obstacle{
	
	private int id =1;
	private int damge= 3;
	private int health = 10;
	private int money = 4;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamge() {
		return damge;
	}
	public void setDamge(int damge) {
		this.damge = damge;
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
