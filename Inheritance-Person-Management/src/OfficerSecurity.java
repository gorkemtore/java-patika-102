public class OfficerSecurity extends Officer{

	private String document;
	
	public OfficerSecurity(String name, String surname, String phone, String email, String department, String shift, String document) {
		super(name, surname, phone, email, department, shift);
		this.document = document;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	
	public void onGuard() {
		System.out.println("Security is on guard!");		
	}

}
