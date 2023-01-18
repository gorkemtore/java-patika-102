package collect;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
//		TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());//reversed tam tersi sıralar. OrderNoteComparatore göre sıralar.
		TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());//isme göre sıralar
		students.add(new Student("Mustafa",90));
		students.add(new Student("Ahmet",100));
		students.add(new Student("Behlül",40));
		students.add(new Student("Kamil",30));
		students.add(new Student("Cengiz",70));
		students.add(new Student("Cengiz",70));//veri tekrar etmez. 1 kere yazdırılır. 
		
		
		
		for(Student stu : students) {
			System.out.println(stu.getName()+" : "+stu.getNote());
		}
		
	}

}
