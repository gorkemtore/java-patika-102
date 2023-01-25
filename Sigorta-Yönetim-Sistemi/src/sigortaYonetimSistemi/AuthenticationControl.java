package sigortaYonetimSistemi;

import java.util.Scanner;

public class AuthenticationControl {
	private User user;
	public enum AuthenticationStatus {
	    SUCCESS, FAIL
	}
	
	public AuthenticationControl(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@SuppressWarnings("resource")
	public AuthenticationStatus login() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Mail address : ");
		String mail = sc.next();
		System.out.print("Password : ");
		String pw = sc.next();
		
	    if (user.getEmail().equals(mail) && user.getPw().equals(pw)) {
	        return AuthenticationStatus.SUCCESS;
	    } else {
	        return AuthenticationStatus.FAIL;
	    }
	}
	
}

