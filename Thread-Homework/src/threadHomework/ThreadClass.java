package threadHomework;

import java.util.ArrayList;
import java.util.List;

public class ThreadClass implements Runnable {

	private int firstNumber = 1;

	private final Object LOCK = new Object();
	private List<Integer> dividedList1 = new ArrayList<>();
	private List<Integer> dividedList2 = new ArrayList<>();
	private List<Integer> dividedList3 = new ArrayList<>();
	private List<Integer> dividedList4 = new ArrayList<>();
	private List<Integer> evenList = new ArrayList<>();
	private List<Integer> oddList = new ArrayList<>();

	public ThreadClass() {
		super();
	}

	@Override
	public void run() {

		synchronized (LOCK) {
//			System.out.println(getFirstNumber());
			if (this.firstNumber <= 2500) {

				this.dividedList1.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to dividedList1");

			} else if (this.firstNumber <= 5000) {

				this.dividedList2.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to dividedList2");

			} else if (this.firstNumber <= 7500) {

				this.dividedList3.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to dividedList3");

			} else {
				this.dividedList4.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to dividedList4");

			}

			if (this.firstNumber % 2 == 0) {

				this.evenList.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to even list");

			} else {
				
				this.oddList.add(this.firstNumber);
				System.out.println(this.firstNumber + " added to odd list");
			}

			this.firstNumber++;
			
		}

	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public List<Integer> getDividedList1() {
		return dividedList1;
	}

	public void setDividedList1(List<Integer> dividedList1) {
		this.dividedList1 = dividedList1;
	}

	public List<Integer> getDividedList2() {
		return dividedList2;
	}

	public void setDividedList2(List<Integer> dividedList2) {
		this.dividedList2 = dividedList2;
	}

	public List<Integer> getDividedList3() {
		return dividedList3;
	}

	public void setDividedList3(List<Integer> dividedList3) {
		this.dividedList3 = dividedList3;
	}

	public List<Integer> getDividedList4() {
		return dividedList4;
	}

	public void setDividedList4(List<Integer> dividedList4) {
		this.dividedList4 = dividedList4;
	}

	public List<Integer> getOddList() {
		return oddList;
	}

	public void setOddList(List<Integer> oddList) {
		this.oddList = oddList;
	}

	public void setEvenList(List<Integer> evenList) {
		this.evenList = evenList;
	}

	public List<Integer> getEvenList() {

		return evenList;
	}

}
