package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> liste = new LinkedList<>();
		liste.add("Mustafa");
		liste.add("Çetindağ");
		liste.add("Mustafa");
		liste.add("JAVA");
		liste.add("102");
		
		//ARAYA ELEMAN EKLEMEK LİNKEDLİSTLERDE DAHA AZ SİSTEMİ YORAR !! 
		
		liste.remove(2);//2. indexi siler
		
		Iterator<String> iter = liste.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
