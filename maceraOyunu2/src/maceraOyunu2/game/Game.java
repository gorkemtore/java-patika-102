package maceraOyunu2.game;

import java.util.Scanner;
import maceraOyunu2.characters.Characters;
import maceraOyunu2.places.*;

public class Game {
	public static Characters character;
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
			location = new Forest();
		else if(sL.equals("4"))
			location = new Cave();
		else if(sL.equals("5"))
			location = new River();
		
		else {
			throw new Exception("Hatalı seçim!");
		}
		
	}
	
	public void start() throws Exception {
		player = new Player();
		player.selectChar();
		character = player.character;
		
		while(character.getHealth()>0) {
			chooseLocation();
			location.onLocation();
		}
				

	}
}
