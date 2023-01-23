package product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import business.Brand;

public abstract class Product {
	
	public static List<Notebook> notebooks = new ArrayList<>();
	public static List<SmartPhone> smartPhones = new ArrayList<>();
	public static Set<String> productCategories = new LinkedHashSet<>();

	private int id;
	private double price;
	private double discountAmount;
	private int stock;
	private String name;
	private String brand;

	
	public Product(double price, double discountAmount, int stock, String name, String brand) {
		super();
		this.price = price;
		this.discountAmount = discountAmount;
		this.stock = stock;
		this.name = name;

		if (Brand.nameId.containsKey(brand)) {
			this.brand = brand;
		} else {
			this.brand = "Samsung";
			System.out.println("Wrong thped color! Assigned as the default value: Samsung");
		}
	}

	public int getId() {
		return id;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getPrice() {
		return price - (price * discountAmount) / 100;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@SuppressWarnings("resource")
	public static void addProduct() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select category : ");

		int categoryNo = 1;
		System.out.println();
		for (String category : Product.productCategories) {
			System.out.println(categoryNo++ + "-" + category);
		}
		System.out.print("Select : ");
		int select = sc.nextShort();

		if (select == 1) {

			boolean shouldAdd = true;

			System.out.print("Brand : ");
			String taken_brand = sc.next();
			String brand = "";
			if (Brand.getBrands().contains(taken_brand)) {
				brand = taken_brand;
			} else {
				// System.out.println("Wrong brand!");
				shouldAdd = false;

				System.out.println("Something went wrong. Check the data you entered.");

			}

			if (shouldAdd) {
				System.out.print("Price : ");
				double price = sc.nextDouble();

				System.out.print("Discount Amount : ");
				double discount = sc.nextDouble();

				System.out.print("Stock : ");
				int stock = sc.nextInt();

				System.out.print("Ram : ");
				int ram = sc.nextInt();

				System.out.print("Storage : ");
				int storage = sc.nextInt();

				System.out.print("Screen Size : ");
				double screenSize = sc.nextDouble();

				// if that scanner block is not written, system do not take name ??
				sc = new Scanner(System.in);
				System.out.print("Name : ");
				String name = sc.nextLine();

				Notebook.notebooks.add(new Notebook(price, discount, stock, name, brand, ram, storage, screenSize));
				System.out.println("Product is added!");

			}

		} else if (select == 2) {
			boolean shouldAdd = true;

			System.out.print("Brand : ");
			String taken_brand = sc.next();
			String brand = "";
			if (Brand.getBrands().contains(taken_brand)) {
				brand = taken_brand;
			} else {
				// System.out.println("Wrong brand!");
				shouldAdd = false;

				System.out.println("Something went wrong. Check the data you entered.");

			}

			System.out.print("Color : ");
			String color = sc.next();
			if (!Arrays.asList("Siyah", "Kırmızı", "Mavi").contains(color)) {
				shouldAdd = false;
				System.out.println("Wrong color typed! Please try again with 'Siyah','Kırmızı' or 'Blue' ... ");
			}

			if (shouldAdd) {
				System.out.print("Price : ");
				double price = sc.nextDouble();

				System.out.print("Discount Amount : ");
				double discount = sc.nextDouble();

				System.out.print("Stock : ");
				int stock = sc.nextInt();

				System.out.print("Ram : ");
				int ram = sc.nextInt();

				System.out.print("Storage : ");
				int storage = sc.nextInt();

				System.out.print("Screen Size : ");
				double screenSize = sc.nextDouble();

				System.out.print("Batery mh : ");
				int batery = sc.nextShort();

				System.out.print("Camera : ");
				int camera = sc.nextInt();

				// if that scanner block is not written, system do not take name ??
				sc = new Scanner(System.in);
				System.out.print("Name : ");
				String name = sc.nextLine();
				SmartPhone.smartPhones.add(new SmartPhone(price, discount, stock, name, brand, storage, screenSize,
						batery, color, camera, ram));

				System.out.println("Product is added!");

			}
		} else {
			System.out.println("You keyed it wrong. You are back in the main menu!");
		}
		System.out.println();

	}

	public static void removeProduct(String categoryName) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID that you want remove product : ");
		int idRemove = sc.nextInt();
		
		if(categoryName.equals("Notebook")) {
			for(int i = 0 ; i < Product.notebooks.size(); i++) {
				if(Product.notebooks.get(i).getId()==idRemove){
					Product.notebooks.remove(i);
					System.out.println("Product removed! ");
					break;
				}
			}
		}else if(categoryName.equals("SmartPhone")) {
			for(int i = 0 ; i < Product.smartPhones.size(); i++) {
				if(Product.smartPhones.get(i).getId()==idRemove){
					Product.smartPhones.remove(i);
					System.out.println("Product removed! ");
					break;
				}
			}
		}
		
		
	}
}
