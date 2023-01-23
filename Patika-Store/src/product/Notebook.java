package product;

public class Notebook extends Product {
	private int id;
	private int ram;
	private int storage;
	private double screenSize;


	private static int idCount = 1;

	public Notebook(double price, double discountAmount, int stock, String name, String brand, int ram, int storage, double screenSize) {
		super(price, discountAmount, stock, name, brand);
		// TODO Auto-generated constructor stub
		this.ram = ram;
		this.storage = storage;
		this.screenSize = screenSize;
		this.id = idCount++;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
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

	public int getId() {
		return id;
	}

	public static void printNotebooks() {
		
		System.out.println("------------NOTEBOOKS------------");
		System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | RAM   | Ekran Boyutu      | Hafızası   |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	
        for(Notebook n : notebooks) {
        	System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-5s | %-17s | %-10s \n",
        			n.getId(), n.getName(), n.getPrice()+" TL", n.getBrand(), n.getStock(), n.getRam(), n.getScreenSize(), n.getStorage());
        }
	}

}
