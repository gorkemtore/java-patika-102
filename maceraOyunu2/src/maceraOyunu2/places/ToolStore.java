package maceraOyunu2.places;

import java.util.Scanner;
import maceraOyunu2.places.equipment.Armor;
import maceraOyunu2.places.equipment.Weaponary;

public class ToolStore extends NormalLocation {
	public ToolStore() {

	}

	public void onLocation() {
		System.out.println("Mağazaya hoş geldiniz!!");
		menu();
		System.out.println();
	}

	void menu() {

		Weaponary w1 = new Weaponary(1, "Tabanca", 2, 25);
		Weaponary w2 = new Weaponary(2, "Kılıç", 3, 35);
		Weaponary w3 = new Weaponary(3, "Tüfek", 7, 45);
		Weaponary[] wList = { w1, w2, w3 };

		System.out.println("-------SİLAHLAR-----");
		System.out.println("SİLAH\t  ID\t HASAR\t PARA");

		for (int i = 0; i < wList.length; i++) {
			System.out.println(
					wList[i].name + "\t  *" + wList[i].id + "\t    *" + wList[i].damage + "\t  *" + wList[i].money);

		}

		Armor a1 = new Armor(1, "Hafif", 1, 15);
		Armor a2 = new Armor(2, "Orta", 3, 25);
		Armor a3 = new Armor(3, "Ağır", 5, 40);
		Armor[] aList = { a1, a2, a3 };

		System.out.println("-----ZIRHLAR-------");
		System.out.println("ZIRH\t ID\t  BLOK\t PARA");

		for (int i = 0; i < aList.length; i++) {
			System.out.println(aList[i].type + "\t *" + aList[i].id + "\t    *" + aList[i].block + "\t  *"
					+ aList[i].money + "\n");
		}
		
		System.out.println("Paranız : "+player.character.getMoney());
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Silah almak ister misiniz ? (E/H) : ");
		String weapon_askBuy = sc.next();

		if (weapon_askBuy.toLowerCase().equals("e")) {
			System.out.print("Almak istediğiniz id numarasını girin: ");
			int weapon_buyId = sc.nextInt();

			boolean checkId = false;

			for (Weaponary weapon : wList) {
				if (weapon.id == weapon_buyId) {

					checkId = true;

					if (player.character.getMoney() >= weapon.money) {
						this.player.inventory.setWeaponName(weapon.name);
						
						this.player.inventory.setWeaponDamage(weapon.damage);
						
						System.out.println("Envantere eklendi: " + player.inventory.getWeaponName());
						
						player.character.setMoney(player.character.getMoney() - weapon.money);
						System.out.println("Kalan para : " + player.character.getMoney());
					} else {
						System.out.println("Üzgünüz yetersiz bakiye! Bakiyeniz : " + player.character.getMoney());
					}
				}
			}
			if (!checkId) {
				System.out.println("Hatalı id girdiniz!");
			}

		} else {
			System.out.println("İsteğiniz üzerine silah almadınız!");
		}

		System.out.print("Zırh almak ister misiniz ? (E/H) : ");
		String armor_askBuy = sc.next();
		if (armor_askBuy.toLowerCase().equals("e")) {
			System.out.print("Almak istediğiniz id numarasını girin: ");
			int armor_buyId = sc.nextInt();

			boolean checkId = false;

			for (Armor armor : aList) {
				if (armor.id == armor_buyId) {

					checkId = true;

					if (player.character.getMoney() >= armor.money) {
						this.player.inventory.setArmorName(armor.type);
						
						this.player.inventory.setArmorDefance(armor.block);
						
						System.out.println("Envantere eklendi: " + player.inventory.getArmorName());

						player.character.setMoney(player.character.getMoney() - armor.money);
						System.out.println("Kalan para : " + player.character.getMoney());
					} else {
						System.out.println("Üzgünüz yetersiz bakiye! Bakiyeniz : " + player.character.getMoney());
					}
				}

			}

			if (!checkId) {
				System.out.println("Hatalı id girdiniz!");
			}

		} else {
			System.out.println("İsteğiniz üzerine zırh almadınız!");
		}

	}

}
