package productBusiness;


public class Product {

	private double price;
	private int discountAmount;
	private int stock;
	private String name;
	private String brand;

	public Product(double price, int discountAmount, int stock, String name, String brand) {
		super();
		this.price = price;
		this.discountAmount = discountAmount;
		this.stock = stock;
		this.name = name;
		this.brand = brand;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getPrice() {
		return price-(price*discountAmount)/100;
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

}
