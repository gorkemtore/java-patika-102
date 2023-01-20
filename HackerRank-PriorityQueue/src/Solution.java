import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


class Priorities{

	Queue<String> queue;
    public Priorities() {
        this.queue = new LinkedList<>();
    }
    public void addQueue(String str) {
        this.queue.add(str);
    }

    public List<Student> getStudents(List<String> events) {
        List<Student> listStudent = new ArrayList<>();

        Comparator<Student> orderStudents = new Comparator<>() {
            @Override
            public int compare(Student t1, Student t2) {
                if(t1.getCGPA() < t2.getCGPA()) return 1;
                else if (t1.getCGPA() > t2.getCGPA()) return -1;
                else {
                    int temp = t1.getName().compareTo(t2.getName());
                    if(temp>0) return 1;
                    else if (temp<0) return -1;
                    else {
                        if(t1.getID() > t2.getID()) return -1;
                        else return 1;
                    }
                }
            }
        };


        PriorityQueue<Student> queueStudent = new PriorityQueue<>(orderStudents);
        for (String str:
                events) {
            String[] tempStr = str.split(" ");
            if (tempStr[0].equals("ENTER")) {
                queueStudent.add(new Student(Integer.parseInt(tempStr[3]), tempStr[1], Double.parseDouble(tempStr[2])));
            } else queueStudent.poll();
            this.addQueue(str);
        }
        while (!queueStudent.isEmpty()) {
            listStudent.add(queueStudent.poll());
        }
        return listStudent;
    }

	
}

class Student{
	
	int id;
	String name;
	double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name=name;
		this.cgpa = cgpa;
	}
	
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getCGPA() {
		return this.cgpa;
	}
	
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
    	
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}