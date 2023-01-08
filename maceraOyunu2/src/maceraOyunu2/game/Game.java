package maceraOyunu2.game;

import java.util.Scanner;
import maceraOyunu2.characters.Characters;
import maceraOyunu2.obstacles.Bear;
import maceraOyunu2.obstacles.Vampire;
import maceraOyunu2.obstacles.Zombie;
import maceraOyunu2.places.*;

public class Game {
	public static Characters character;
	public static Inventory inventory;
	public Player player;
	public Location location;
	
	void chooseLocation() throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("1- SafeHouse, 2- ToolStore, 3- Forest, 4-Cave, 5-River :  ");
		String sL = sc.nextLine();
		if(sL.equals("1"))
			location = new SafeHouse();
		else if(sL.equals("2"))
			location = new ToolStore();
		else if(sL.equals("3"))
			location = new Forest(new Vampire());
		else if(sL.equals("4"))
			location = new Cave(new Zombie());
		else if(sL.equals("5"))
			location = new River(new Bear());
		
		else {
			throw new Exception("Hatalı seçim!");
		}
		
	}
	
	public void start() throws Exception {
		player = new Player();
		player.selectChar();
		character = player.character;
		inventory = player.inventory;
		while(character.getHealth()>0) {
			chooseLocation();
			location.onLocation();
			if(player.inventory.isFirewoord() && player.inventory.isFood() && player.inventory.isWater()) {
				System.out.println("KAZANDIN!!! ");
				break;
			}
		}
				

	}
}
