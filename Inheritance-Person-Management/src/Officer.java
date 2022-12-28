public class Officer extends Person{
	
	private String department;
	private String shift;
	
	public Officer(String name, String surname, String phone, String email, String department, String shift) {
		super(name, surname, phone, email);
		this.department = department;
		this.shift = shift;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public void work() {
		System.out.println("Officer is working!");
	}
	
	

}
