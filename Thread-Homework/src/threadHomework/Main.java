package threadHomework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		
		ExecutorService executor = Executors.newFixedThreadPool(15);
		
		for(int g = 0 ; g < 10_000 ; g++) {
			executor.execute(threadClass);
		}
		executor.shutdown();
		
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Even numbers : "+ threadClass.getEvenList().size());

	}

}
