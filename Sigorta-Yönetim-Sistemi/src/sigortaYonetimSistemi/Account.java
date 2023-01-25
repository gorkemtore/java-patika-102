package sigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	private User user;
	private List<Insurance> insurances = new ArrayList<>();
	private String loginStatus;
	
	public final void showUserInfo() {
		System.out.println("--------------Müşteri Bilgileri-------------");
		System.out.println("User Name : "+user.getName());
		System.out.println("User Surname : "+user.getSurname());
		System.out.println("User E-Mail : "+ user.getEmail());
		System.out.println("User Age : "+user.getAge());
		System.out.println("User Job : "+user.getJob());
		System.out.println();
		System.out.println("---------------Address List------------------");
		for(int i = 0; i< user.getAddressList().size() ; i++) {
			System.out.print((i+1)+". address : "); 
			System.out.print(user.getAddressList().get(i).getNeighborhood()+", "+user.getAddressList().get(i).getStreet()
					+", "+user.getAddressList().get(i).getTown()+", "+user.getAddressList().get(i).getCity()+ ", "+user.getAddressList().get(i).getCountry()+"\n");
		}
		System.out.println("---------------------------------------------");
		
		System.out.println("\n---------------Insurance List----------------");
		for(Insurance s : insurances) {
			System.out.println("Type of Insurance : "+s.getClass().getSimpleName());
			System.out.println("Price : "+s.getPrice());
			System.out.println("Start date : "+s.getStartDate());
			System.out.println("Finish date : "+s.getFinishDate());
			System.out.println();
		}
		

	}

	public Account(User user, List<Insurance> insurances, String loginStatus) {
		super();
		this.user = user;
		this.insurances = insurances;
		this.loginStatus = loginStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
}
