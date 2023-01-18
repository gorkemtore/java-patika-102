import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
// 		Hashsetler sıralama garantisi vermez. Veriler hash kodlarına göre sıralanır. 
		
		HashSet<Integer> hSet = new HashSet<>();
		hSet.add(5);
		hSet.add(5);//5 değeri daha önce eklendiyse, tekrar eklenmez.
		hSet.add(20);
		hSet.add(30);
		hSet.add(null);
		
		System.out.println(hSet.size()+" elaman vardır.");
		System.out.println("Boş mu : "+hSet.isEmpty());
		System.out.println("30 değeri var mı ? : "+hSet.contains(30));
		
		
//		hSet.clear();//tüm değerleri siler.
		
		
		hSet.remove(5);//5 değerini siler.
		
		/*
		for(Integer sayi : hSet) {//Integer yazmak gerekli. Diğer türlü null değerini yazdırırken hata alırız. 
			System.out.println(sayi);
		}
		*/
		
		Iterator<Integer> iter = hSet.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());//geriye bir sonraki objeyi döndürür.
			
		}
		
	}

}
