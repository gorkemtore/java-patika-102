package sigortaYonetimSistemi;

import java.time.LocalDate;

public abstract class Insurance {

	private double price;
	private LocalDate startDate;
	private LocalDate finishDate;

	public abstract void calculate();
	
	
	public Insurance() {
		super();
		this.startDate = LocalDate.now();
		this.finishDate = startDate.plusYears(2);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	
	

}
