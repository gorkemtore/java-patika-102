package sigortaYonetimSistemi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Insurance> insurances = new ArrayList<>();
		insurances.add(new TravelInsurance());
//		System.out.println("Sınıf adı : "+insurances.get(0).getClass().getSimpleName());
		
		//created user1 
		User user1 = new User("Görkem", "TÖRE", "gorkemtore1@gmail.com", "123456", "Student", 20);
		
		//our user now has an address or addresses
		AddressManager addressManager = new AddressManager(user1);
		addressManager.addAddress((new HomeAddress("Türkiye","Eskişehir","Odunpazarı", "X","Y")));
		
		//now user1 has an individualAccount
		Account indAcc = new IndıvıdualAccount(user1, insurances , "True");
		indAcc.showUserInfo();
	}

}
