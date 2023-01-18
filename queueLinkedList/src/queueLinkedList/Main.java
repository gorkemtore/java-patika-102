package queueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();//polimorfizm
		
		q.add("Mustafa");
		q.add("Çetindağ");
		
		q.offer("Patika");
		
		q.remove("Patika");//herhangi bir değer girmezsek kuyruğun başındaki değeri siler(index de kabul etmez)
		
		System.out.println(q.element()+" kuyruğun başıdır.");//kuyruğun başındaki elemeanı verir
		System.out.println(q.peek()+" kuyruğun başındadır.");
		System.out.println(q.poll()+" kuyruğun başındaki elemanı verir ve sonrasında kuyruktan çıkarır!");
		
		
		
		Iterator<String> itr = q.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
