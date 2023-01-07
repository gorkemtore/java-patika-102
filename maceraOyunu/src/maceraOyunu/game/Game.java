package maceraOyunu.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;

import maceraOyunu.characters.Bowman;
import maceraOyunu.characters.Characters;
import maceraOyunu.characters.Knight;
import maceraOyunu.characters.Samurai;
import maceraOyunu.places.Cave;
import maceraOyunu.places.Forest;
import maceraOyunu.places.Location;
import maceraOyunu.places.River;
import maceraOyunu.places.SafeHouse;
import maceraOyunu.places.ToolStore;

@SuppressWarnings("unused")
public class Game {
	public Player player = new Player();
	public Characters character;
	public Location location;
	public Inventory inventory;

	
	public void showCharacterProperties() {
		Characters[] chars = {new Samurai(), new Bowman(),new Knight()};
		for (int i = 0; i < chars.length; i++) {
			System.out.println("ID : "+chars[i].getId()+"\t"+"Karakter: "+chars[i].getName()+"\tSağlık: "
												+chars[i].getHealth()+"\tPara: "+chars[i].getMoney());
		}		
	}
	
	public void createCharacter() {//seçilen karakteri oluşturur
		switch (player.selectChar()) {
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
			throw new IllegalArgumentException("Unexpected value");
		}
		System.out.println("Seçilen karakter: " + character.getName() + " Başarılar.");

	}
	
	public void start() {
		
		showCharacterProperties();//karakter özelliklerini gösterir
		createCharacter();
		//character = player.selectChar();//selectCharı da çağırır.
		getLocation();
		player.character = character;
		location.player = player;
		goLocation(location);
		
	}
	
	public Location getLocation() {//gidilecek lokasyonu döndürür
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String prefer="";
		
		System.out.print("Gitmek istediğiniz yeri seçiniz...\n"
				+ "River \t\t(R)\n"
				+ "Cave  \t\t(C)\n"
				+ "Forest\t\t(F)\n"
				+ "SafeHouse \t(H)\n"
				+ "ToolStore \t(M)");
		prefer= input.next();
		 
		 switch (prefer) {
			case "R","r" : {
				location = new River();
				break;
			}
			case "C","c" :{
				location = new Cave();
				break;
			}
			case "F","f" :{
				location=new Forest(); 
				break;
			}
			case "H","h" :{
				location = new SafeHouse();
				break;
			}
			case "M","m" :{
				location= new ToolStore();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value");
			}
		 return location;
		 
	}

	
	public void goLocation(Location location){//lokasyona 
		character.setHealth(character.getHealth()-10);
		System.out.println(location.player.character.getHealth());

	}
	
	
}
