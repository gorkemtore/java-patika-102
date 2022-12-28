public class LabAssistant extends Assistant{

	public LabAssistant(String name, String surname, String phone, String email, String department, String title,
			String officeTime) {
		super(name, surname, phone, email, department, title, officeTime);
		// TODO Auto-generated constructor stub
	}
	
	public void attendLab() {
		System.out.println("The LabAssistant attended the lab!");
	}

}
