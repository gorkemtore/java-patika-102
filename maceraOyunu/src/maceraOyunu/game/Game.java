package maceraOyunu.game;

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
	public String getLocation;
	
	public void showCharacterProperties() {
		Characters[] chars = {new Samurai(), new Bowman(),new Knight()};
		for (int i = 0; i < chars.length; i++) {
			System.out.println("ID : "+chars[i].getId()+"\t"+"Karakter: "+chars[i].getName()+"\tSağlık: "
												+chars[i].getHealth()+"\tPara: "+chars[i].getMoney());
		}		
	}
	public void start() {
		showCharacterProperties();
		character = player.selectChar();//selectCharı da çağırır.
		System.out.println(getLocation());
		
	}
	

	public String getLocation() {//gidilecek lokasyonun adını döndürür
		
		Scanner input = new Scanner(System.in);
		System.out.println("Gitmek istediğiniz yeri seçiniz...\n"
				+ "River \t\t(R)\n"
				+ "Cave  \t\t(C)\n"
				+ "Forest\t\t(F)\n"
				+ "SafeHouse \t(H)\n"
				+ "ToolStore \t(M)");
		 getLocation = input.nextLine();
		 
		 switch (getLocation) {
			case "R","r" : {
				getLocation = "River";
				break;
			}
			case "C","c" :{
				getLocation = "Cave";
				break;
			}
			case "F","f" :{
				getLocation="Forest";
				break;
			}
			case "H","h" :{
				getLocation = "SafeHouse";
				break;
			}
			case "M","m" :{
				getLocation="ToolStore";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + getLocation);
			}
		 return getLocation;
		 
	}

	
	public void goLocation(String getLocation){
		Location[] locations = {new Cave(), new Forest(), new River(), new SafeHouse(), new ToolStore()};
		for (Location location : locations) {
			if(location.name == getLocation) {
				System.out.println(location.name+" seçildi.");
			}
		}
	}
	
	
}
