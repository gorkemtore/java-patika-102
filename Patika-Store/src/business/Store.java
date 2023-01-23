package business;

import java.util.Comparator;
import java.util.Scanner;

import product.Notebook;
import product.Product;
import product.SmartPhone;

public class Store {
	
	public static void printSelectOptions() {
		System.out.println("PatikaStore Product Management Panel");
		System.out.println("-------------------------------------");
		System.out.println("1 - Notebook ");
		System.out.println("2 - Mobile Phone");
		System.out.println("3 - List Brands");
		System.out.println("4- Add Product");
		System.out.println("5- Remove Product");
		System.out.println("0 - Exit");
		System.out.print("Your select: ");
	}
	
	public void openStore() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean isContinue = true;
		while (isContinue) {
			printSelectOptions();
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
			case 4:
				Product.addProduct();
				break;
			
			case 5:
				System.out.println("1- SmartPhones : ");
				System.out.println("2- Notebook : ");
				System.out.print("Select :");
				int selectRemove = sc.nextShort();
				if(selectRemove == 1) {
					SmartPhone.printSmartPhone();
					Product.removeProduct("SmartPhone");
				}
				else if(selectRemove == 2) {
					Notebook.printNotebooks();
					Product.removeProduct("Notebook");
				}
				break;
			case 0:
				System.out.println("Thank you for choosing us :)");
				isContinue = false;
				break;
			default:
				System.out.println("Unexpected value, try again! ");
			}
		} // while endpoint

	}

}
