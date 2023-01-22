package business;

import java.util.Scanner;

import product.SmartPhone;

public class Store {

	public void openStore() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		//adds brands 
		String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster" };

		int index = 0;
		for (String brand : brands) {
			Brand.addBrand(brand, index++);
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		SmartPhone.smartPhones.add(new SmartPhone(9700, 7, 5, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 4400, "Siyah",32,6));
		SmartPhone.smartPhones.add(new SmartPhone(23500, 9, 5, "iPhone 11 64 GB", "Apple", 64, 6.1, 3046, "Mavi",5,6));
		SmartPhone.smartPhones.add(new SmartPhone(5500, 13, 5, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 3046, "Mavi",35,12));

		
		
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("PatikaStore Product Management Panel");
			System.out.println("-------------------------------------");
			System.out.println("1 - Notebook ");
			System.out.println("2 - Mobile Phone");
			System.out.println("3 - List Brands");
			System.out.println("0 - Exit");
			System.out.print("Your select: ");
			int select = sc.nextShort();

			switch (select) {
			case 1:
				break;

			case 2:
				SmartPhone.printSmartPhone();
				break;

			case 3:
				Brand.printBrands();
				break;

			case 0:
				System.out.println("Exited! ");
				isContinue = false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + select);
			}
		} // while endpoint

	}

}
