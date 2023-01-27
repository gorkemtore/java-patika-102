package creatingThread;

public class Main {

	public static void main(String[] args) {
		Counter c1 = new Counter("Counter-1");
		c1.start();
		
		Counter c2 = new Counter("Counter-2");
		c2.start();//run metodunu start metodu çağırıyor.

	}

}
