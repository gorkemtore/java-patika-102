public class OfficerIT extends Officer{

	private String duty;
	
	public OfficerIT(String name, String surname, String phone, String email, String department, String shift, String duty) {
		super(name, surname, phone, email, department, shift);
		this.setDuty(duty);
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}
	
	public void networkSetup() {
		System.out.println("Network established");
	}

}
