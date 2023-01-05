package maceraOyunu.game;

import javax.swing.JOptionPane;

import maceraOyunu.characters.Bowman;
import maceraOyunu.characters.Knight;
import maceraOyunu.characters.Samurai;

public class Player {
	Samurai samurai;
	Bowman bowman;
	Knight knight;
	
	Inventory inventory;
	private int damage;
	private int healthy;
	private int money;
	private String name;

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCharacterName() {
		return name;
	}

	public void setCharacterName(String characterName) {
		this.name = characterName;
	}

	void selectChar() {
		String charName = JOptionPane.showInputDialog("Bir karakter seçin: \n"
				+ "Samuray   (1)\n"
				+ "Okçu        (2)\n"
				+ "Şovalye    (3)");
		
		switch (charName) {
		case "1": {
			JOptionPane.showMessageDialog(null, "Seçilen karakter: Samurai","Karakter seçtiniz!",JOptionPane.INFORMATION_MESSAGE);
			samurai = new Samurai();
			break;
		}
		case "2":{
			JOptionPane.showMessageDialog(null, "Seçilen karakter: Bowman","Karakter seçtiniz!",JOptionPane.INFORMATION_MESSAGE);
			bowman = new Bowman();
			break;
		}
		case "3":{
			JOptionPane.showMessageDialog(null, "Seçilen karakter: Knight","Karakter seçtiniz!",JOptionPane.INFORMATION_MESSAGE);
			knight = new Knight();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + charName);
		}
	}

}
