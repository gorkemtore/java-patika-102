package business;

import java.util.Scanner;

public class Store {

	public void openStore() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster" };

		int index = 0;
		for (String brand : brands) {
			Brand.addBrand(brand, index++);
		}

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
