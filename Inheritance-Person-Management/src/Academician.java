public class Academician extends Person{
		
		private String department;
		private String title;
		
		 
		public Academician(String name, String surname, String phone, String email,String department, String title) {
		super(name, surname, phone, email);
		this.department = department;
		this.title = title;
		// TODO Auto-generated constructor stub
	}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}
		
		public void attendClass() {
			System.out.println("The Academician attended the class!");
		}
		
		
		
		

	
}
