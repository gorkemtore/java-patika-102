package product;

import java.util.Arrays;

public class SmartPhone extends Product {

	private int id;
	private int storage;
	private double screenSize;
	private int bateryMh;
	private String color;
	private int camera;
	private int ram;

	

	private static int idCount = 1;

	public SmartPhone(double price, double discountAmount, int stock, String name, String brand, int storage,
			double screenSize, int bateryMh, String color, int camera, int ram) {

		super(price, discountAmount, stock, name, brand);
		
		this.id = idCount++;
		if(Arrays.asList(64,128).contains(storage)) {
			this.storage = storage;
		}else {
			this.storage = 64;
			System.out.println("Wrong typed storage! Assigned as the default value: 64 GB");
		}
		
		this.screenSize = screenSize;
		this.bateryMh = bateryMh;
		
		if(Arrays.asList("Siyah","Kırmızı","Mavi").contains(color)) {
			this.color = color;

		}else {
			System.out.println("Wrong thped color! Assigned as the default value: Siyah");
			this.color="Siyah";
		}
		this.camera = camera;
		this.ram = ram;

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBateryMh() {
		return bateryMh;
	}

	public void setBateryMh(int bateryMh) {
		this.bateryMh = bateryMh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void addSmartPhone(SmartPhone smartPhone) {

	}

	public static void printSmartPhone() {

		System.out.println(
				"\n------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Renk   |");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (SmartPhone phone : smartPhones) {
			System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-10s \n",
					phone.getId(), phone.getName(), phone.getPrice() + " TL", phone.getBrand(), phone.getStock(),
					phone.getDiscountAmount(), phone.getRam(), phone.getScreenSize(), phone.getStorage(),
					phone.getColor());
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
