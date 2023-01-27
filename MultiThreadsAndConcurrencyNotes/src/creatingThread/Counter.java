package creatingThread;

public class Counter extends Thread{

	
	public String name;
	
	public Counter(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + " çalıştı! ");
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(this.name + " "+ i);
		}
		
	}
	
	
}
