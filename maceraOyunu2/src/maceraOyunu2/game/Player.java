package maceraOyunu2.game;

import java.util.Scanner;
import maceraOyunu2.characters.Bowman;
import maceraOyunu2.characters.Characters;
import maceraOyunu2.characters.Knight;
import maceraOyunu2.characters.Samurai;

public class Player {
	public Characters character;
	public Inventory inventory;

	private int damage;
	private int healthy;
	private int money;
	private String name;

	public Player() {
		inventory = new Inventory();
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Characters[] chars = { new Samurai(), new Bowman(), new Knight() };
	public void selectChar() throws Exception {
		// Karakter özelliklerini bas
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println("ID : " + chars[i].getId() + "\t" + "Karakter: " + chars[i].getName() + "\tSağlık: "
					+ chars[i].getHealth() + "\tHasar: " + chars[i].getDamage() + "\tPara: " + chars[i].getMoney());
		}

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Karakter seç: \n1- Samurai, 2- Bowman, 3-Knight:  ");

		String secim = sc.next();

		switch (secim) {
		case "1":
			character = new Samurai();
			break;
		case "2":
			character = new Bowman();
			break;
		case "3":
			character = new Knight();
			break;

		default:
			throw new Exception("Hatalı giriş!");
		}
		System.out.println(character.getName()+" adlı karakteri seçtiniz. Başarılar.\n");

	}
}
