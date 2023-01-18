package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
//		HashSetlerin alt sınıfıdır. Tüm özelliklerini sağlar. Tek farkı, giren değerlerin sıralaması ile çıkan değerlerin sırası aynıdır.
		
		LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
		lSet.add(10);
		lSet.add(10);
		lSet.add(20);
		lSet.add(30);
		
		Iterator<Integer> iter = lSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
