package business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import product.Product;

@SuppressWarnings("unused")
public class Brand {

	private int id;
	private String brandName;
	private static List<String> brands = new ArrayList<>();
	public static LinkedHashMap<String, Integer> nameId = new LinkedHashMap<>();
	private Product product;

	public Brand(int id, String brandName) {
		this.id = id;
		this.brandName = brandName;
	}

	public int getId() {
		return id;
	}

	public String getBrandName() {
		return brandName;
	}

	public static void addBrand(String brand, int index) {
		brands.add(brand);
		nameId.put(brand, index);

	}

	public static List<String> getBrands() {
		return brands;
	}

	public static void printBrands() {

		System.out.println();
		System.out.println("BRANDS");
		System.out.println("-------------------------------------");

		// sorts to sortedBrands list
		brands.sort((brand1, brand2) -> brand1.compareTo(brand2));
		// After sorting, print them
		for (String brand : brands) {
			System.out.println("- " + brand);

			// returns brand's id
			// System.out.println(" ID : "+ nameId.get(brand));
		}

		System.out.println();

	}

}
