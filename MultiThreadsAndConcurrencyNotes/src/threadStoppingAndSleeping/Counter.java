package threadStoppingAndSleeping;

public class Counter implements Runnable {

	private String name;
	private int id;

	private boolean isRun = true;
	
	public Counter(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println(this.getName() + " çalıştı! ");
		int i = 1;
		while(isRun) {
	
				try {
					Thread.sleep(1000 * this.getId()); // timer
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}

				System.out.println(this.name + " : "+i++);
			}

		
	}//
	
	public void stop() {
		this.isRun = false;
	}

}
