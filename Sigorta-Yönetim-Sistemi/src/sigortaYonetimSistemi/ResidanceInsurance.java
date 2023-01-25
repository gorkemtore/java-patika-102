package sigortaYonetimSistemi;

public class ResidanceInsurance extends Insurance{

	public ResidanceInsurance(int price) {
		super(price);
	}

	@Override
	public double calculate() {
		return (this.getPrice() * 0.30);
	}

}
