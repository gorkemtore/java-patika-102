package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(10);
		liste.add(1);
		liste.add(4);
		liste.add(5);
		liste.add(null);
//		System.out.println(liste);
		
		Iterator<Integer> iter = liste.iterator();
		/*
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		for(Integer element: liste) {
			System.out.println(element);
		}
		
		System.out.println(liste.get(3)+" değeri 3. indextir...");
	
		
		List<Integer> liste2 = new ArrayList<>();
		liste2.addAll(liste);
		liste2.add(11);
		System.out.println(liste2);
		
		
		List<Integer> liste3 = liste2.subList(2, 5);//5. indexi almıyor
		System.out.println(liste3);
		
	}

}
