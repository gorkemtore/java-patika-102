package maceraOyunu.game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import maceraOyunu.characters.Bowman;
import maceraOyunu.characters.Characters;
import maceraOyunu.characters.Knight;
import maceraOyunu.characters.Samurai;

@SuppressWarnings("unused")
public class Player {
	public Characters character;
	public Inventory inventory;

	private int damage;
	private int health;
	private int money;
	private String name;

	int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return health;
	}

	public void setHealthy(int health) {
		this.health = health;
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


	@SuppressWarnings("resource")
	Characters selectChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir karakter seçin:\n" + "1- Samurai , " + "2- Bowman ," + "3- Knight  : ");
		String charName = sc.nextLine();

		switch (charName) {
		case "1": {

			character = new Samurai();
			break;
		}
		case "2": {
			character = new Bowman();
			break;
		}
		case "3": {
			character = new Knight();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + charName);
		}
		System.out.println("Seçilen karakter: " + character.getName() + " Başarılar.");

		sc.close();

		return character;
	}

}
