import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {
		ArrayList<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Çaluşu", 125, "Reşat Nuri Güntekin", 2010));
		bookList.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 2022));
		bookList.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", 2019));
		bookList.add(new Book("1984", 352, "George Orwell", 2019));
		bookList.add(new Book("Kuyucaklı Yusuf", 221, "Sabahattin Ali", 2019));
		bookList.add(new Book("Saatleri Ayarlama Enstitüsü", 382, "Ahmet Hamdi Tanpınar", 2017));
		bookList.add(new Book("Aylak Adam", 156, "Yusuf Atılgan", 2017));
		bookList.add(new Book("Zeytindağı", 176, "Falih Rıfkı Atay", 2013));
		bookList.add(new Book("Gün Olur Asra Bedel", 413, "Cengiz Aytmatov", 2020));
		bookList.add(new Book("Nietzsche Ağladığında", 432, "Irvin D. Yalom", 2022));

		Map<String, String> bookMap = new HashMap<>();
		bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));
		
		for(String i : bookMap.keySet()) {
			System.out.println(i + " - "+ bookMap.get(i));
		}
		System.out.println("\n");
		
		//Filter												//get pageNo > 300 ! 
		List<Book> filterBook = bookList.stream().filter(book -> book.getPageNo() > 300).collect(Collectors.toList());
		filterBook.stream().forEach(b -> System.out.println(
															"Book Name : "+ b.getName()+ " "+ 
															"Page Number : "+b.getPageNo()+ " "+ 
															"Author : "+b.getAuthorName()+ " "+
															"Year : "+b.getYear()));
		System.out.println("------------------------------------------------------------------");
		
		
		// 
		long count = filterBook.stream().count();
		System.out.println("Number of books : "+ count);
		
		
	}

}
