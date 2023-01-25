package sigortaYonetimSistemi;

public class HealthInsurance extends Insurance{

	public HealthInsurance() {
		
	}

	@Override
	public void calculate() {
		this.setPrice(1000);
	}

}
