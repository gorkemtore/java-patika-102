package patikaStore;

import business.Brand;
import business.Store;
import product.Notebook;
import product.Product;
import product.SmartPhone;

public class Main {

	public static void main(String[] args) {
		// adds categories
		Product.productCategories.add("Notebook");
		Product.productCategories.add("SmartPhone");

		// adds brands
		String[] brands = { "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster" };

		int index = 0;
		for (String brand : brands) {
			Brand.addBrand(brand, index++);
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// adds product
		SmartPhone.smartPhones
				.add(new SmartPhone(5500, 12.5, 5, "Redmi Note 10 Pro 8GB", "Xiaomi", 128, 6.5, 3046, "Mavi", 35, 12));
		SmartPhone.smartPhones
				.add(new SmartPhone(23500, 9, 5, "iPhone 11 64 GB", "Apple", 64, 6.1, 3046, "Mavi", 5, 6));
		SmartPhone.smartPhones
				.add(new SmartPhone(9700, 7, 5, "SAMSUNG GALAXY A51", "Samsung", 128, 6.5, 4400, "Siyah", 32, 6));

		Notebook.notebooks.add(new Notebook(15000, 4.5, 2, "HUAWEI Matebook 14", "Huawei", 16, 512, 14.0));
		Notebook.notebooks.add(new Notebook(9000, 1.5, 2, "LENOVO V14 IGL", "Lenovo", 8, 1024, 14.0));
		Notebook.notebooks.add(new Notebook(22000, 2.3, 2, "Asus TUF Gaming", "Asus", 32, 2048, 15.6));
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		Store store = new Store();
		store.openStore();

	}

}