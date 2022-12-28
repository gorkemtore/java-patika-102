public class Assistant extends Person{
	
	private String officeTime;
	
	public Assistant(String name, String surname, String phone, String email,String department, String title, String officeTime) {
		super(name,surname,phone,email);
		this.officeTime = officeTime;
	}
	
	
	public String getOfficeTime() {
		return officeTime;
	}

	public void setOfficeTime(String officeTime) {
		this.officeTime = officeTime;
	}
	
	public void doQuiz() {
		System.out.println("Quiz time!");
	}

	
}
