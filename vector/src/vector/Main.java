package vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Ankara");
		vector.add("Ankara");
		vector.add("Eskişehir");
		vector.add("İzmir");
		
		vector.add(2, "İstanbul");
		System.out.println(vector.contains("Sakarya"));//sakarya yok false döndü.
		
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
