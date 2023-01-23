package business;

import java.util.Comparator;
import java.util.Scanner;

import product.Notebook;
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
		//adds product
		
		SmartPhone.smartPhones.add(new SmartPhone(5500, 12.5, 5, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 3046, "Mavi",35,12));
		SmartPhone.smartPhones.add(new SmartPhone(23500, 9, 5, "iPhone 11 64 GB", "Apple", 64, 6.1, 3046, "Mavi",5,6));
		SmartPhone.smartPhones.add(new SmartPhone(9700, 7, 5, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 4400, "Siyah",32,6));

		Notebook.notebooks.add(new Notebook(15000, 4.5, 2, "HUAWEI Matebook 14", "Huawei", 16, 512, 14.0));
		Notebook.notebooks.add(new Notebook(9000, 1.5, 2, "LENOVO V14 IGL", "Lenovo", 8, 1024, 14.0));
		Notebook.notebooks.add(new Notebook(22000, 2.3, 2, "Asus TUF Gaming", "Asus", 32, 2048, 15.6));
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
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
				System.out.print("Sorting Process\n"
						+ "1- By Name\n"
						+ "2- By ID\n"
						+ "Select: ");
				int selectSort = sc.nextShort();
				if(selectSort == 1) {
					Notebook.notebooks.sort((notebook1, notebook2) -> notebook1.getName().compareTo(notebook2.getName()));
					Notebook.printNotebooks();
				}else if(selectSort == 2) {
					
					//sorts notebooks by id
					Notebook.notebooks.sort(new Comparator<Notebook>() {

						@Override
						public int compare(Notebook o1, Notebook o2) {
							// TODO Auto-generated method stub
							return o1.getId()-o2.getId();
						}
					});;
					////////////////////////////////////////////////////////////
					Notebook.printNotebooks();
				}else {
					System.out.println("Wrong typing!");
				}
				
				break;

			case 2:
				System.out.print("Sorting Process\n"
						+ "1- By Name\n"
						+ "2- By ID\n"
						+ "Select: ");
				selectSort = sc.nextShort();
				if(selectSort == 1) {
					SmartPhone.smartPhones.sort((smartphone1, smartphone2) -> smartphone1.getName().compareTo(smartphone2.getName()));
					SmartPhone.printSmartPhone();
				}else if(selectSort == 2) {
					
					//sorts smartphones by id
					SmartPhone.smartPhones.sort(new Comparator<SmartPhone>() {

						@Override
						public int compare(SmartPhone o1, SmartPhone o2) {
							// TODO Auto-generated method stub
							return o1.getId()-o2.getId();
						}
					});;
					////////////////////////////////////////////////////////////
					SmartPhone.printSmartPhone();
				}else {
					System.out.println("Wrong typing!");	
				}
				break;

			case 3:
				Brand.printBrands();
				break;

			case 0:
				System.out.println("Exited! ");
				isContinue = false;
				break;
			default:
				System.out.println("Unexpected value, try again! ");
			}
		} // while endpoint

	}

}
