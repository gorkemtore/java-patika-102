package maceraOyunu2.places;

import java.util.Random;
import java.util.Scanner;

import maceraOyunu2.obstacles.Obstacle;
import maceraOyunu2.obstacles.Snake;

public class Pit extends BattleLocation{

	public Pit(Obstacle o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onLocation() {
		Random rnd = new Random();
		super.x=rnd.nextInt(1,6);//1-5 arası canavar
		
		if(chance()==1) {
			characterShot();
		}else {
			obstacleShot();
		}
		
		if (player.character.getHealth() > 0) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			Snake snake = new Snake();
			
			String lootItem = snake.lootItem();	
			if(lootItem == null) {
				System.out.println("Herhangi bir loot düşmedi");
			}
			
			else if (lootItem.equals("Hafif")) {
				System.out.print("Hafif Zırh ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setArmorName(lootItem);
					player.inventory.setArmorDefance(3);
				}
			}
			else if (lootItem.equals("Orta")) {
				System.out.print("Orta Zırh ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setArmorName(lootItem);
					player.inventory.setArmorDefance(3);
				}
			}
			else if (lootItem.equals("Ağır")) {
				System.out.print("Ağır Zırh ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setArmorName(lootItem);
					player.inventory.setArmorDefance(5);
				}
			}
			else if (lootItem.equals("Tüfek")) {
				System.out.print("Tüfek ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setWeaponDamage(7);
					player.inventory.setWeaponName("Tüfek");
				}
			}
			else if (lootItem.equals("Kılıç")) {
				System.out.print("Kılıç ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setWeaponDamage(3);
					player.inventory.setWeaponName("Kılıç");
				}
			}
			else if (lootItem.equals("Tüfek")) {
				System.out.print("Tüfek ekipmanı düştü. Mevcut ile değiştirmek için (E) tuşlayın:  ");
				String karar = sc.next();
				if(karar.toLowerCase().equals("e")) {
					player.inventory.setWeaponDamage(7);
					player.inventory.setWeaponName("Tüfek");
				}
			}
			
			else if (lootItem.equals("1") || lootItem.equals("5") || lootItem.equals("10") ) {
				System.out.println(lootItem+ " gold düştü, paranıza eklendi!");
				int lootMoney = Integer.parseInt(lootItem);
				player.character.setMoney(player.character.getMoney()+lootMoney);
				System.out.println("Yeni paranız : "+player.character.getMoney());
			}
			
		}
		
	}
	

}
