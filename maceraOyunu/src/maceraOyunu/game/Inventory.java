package maceraOyunu.game;

public class Inventory {
	public Player player;

	private boolean water = false;
	private boolean food = false;
	private boolean firewoord = false;
	
	private String weaponName=null;
	private String armorName=null;
	private int weaponDamage = 0;
	private int armorDefance = 0;


	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFirewoord() {
		return firewoord;
	}

	public void setFirewoord(boolean firewoord) {
		this.firewoord = firewoord;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getArmorName() {
		return armorName;
	}

	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getArmorDefance() {
		return armorDefance;
	}

	public void setArmorDefance(int armorDefance) {
		this.armorDefance = armorDefance;
	}

}
