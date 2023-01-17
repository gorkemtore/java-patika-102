package genericListHW;

import java.util.ArrayList;

public class GenericList<T> {

	private int size = 0;
	private int capacity;
	T[] list;
	T[] listTemp;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@SuppressWarnings("unchecked")
	public GenericList() {

		setCapacity(10);
		this.list = (T[]) new Object[getCapacity()];
	}

	@SuppressWarnings("unchecked")
	public GenericList(int capacity) {

		setCapacity(capacity);
		this.list = (T[]) new Object[getCapacity()];
	}

	@SuppressWarnings("unchecked")
	public void add(T data) {

		if (this.size < this.capacity - 1) {

			list[size] = data;
//			System.out.println("Veri eklendi: "+data);
			setSize(getSize() + 1);

		} else {

			listTemp = (T[]) new Object[this.capacity];
			setCapacity(getCapacity() * 2);

			int index = 0;
			for (T deger : list) {

				listTemp[index] = deger;
				index++;

			}
			index = 0;
			this.list = (T[]) new Object[getCapacity()]; // önceki veriler nerde??

			for (T deger : listTemp) {

				list[index] = deger;
				index++;

			}

			// System.out.println("2. değer : "+ list[1]);

			list[size] = data;
//			System.out.println("Alan 2 katına çıkarıldı ve veri eklendi: "+data);
			setSize(getSize() + 1);// size++
		}

	}

	public T get(int index) {

		if (index <= getSize()) {
			return list[index];
		}

		return null;
	}

	public void remove(int index) {
//		System.out.println(Arrays.toString(list));
//		list[index]= null;

		if (index <= getSize()) {
			for (int i = index + 1; i < list.length; i++) {// index+1 yazılmasının nedeni baştaki indexin yok
															// olmamasıdır.

				list[i - 1] = list[i];// örneğin 3. indexe 4. indexteki değer geliyor
			}

//			System.out.println(Arrays.toString(list));
		} else {
			System.out.println("Hatalı index");
		}
		// System.out.println(Arrays.toString(list)+" liste basıldı.");
		setSize(getSize() - 1);

	}

	public void set(int index, T data) {

		if (index <= getSize()) {

			list[index] = data;
		}

	}

	public String toString() {
		ArrayList<T> printList = new ArrayList<>();
		for (T data : list) {
			if (data != null) {
				printList.add(data);
			}
		}

		return printList.toString();
	}

	public int indexOf(T data) {
		int index = 0;
		for (T find : list) {
			if (find == data) {
				return index;
			} else {
				index++;
			}
		}
		return -1;
	}

	public int lastIndexOf(T data) {

		for (int i = list.length - 1; i >= 0; i--) {
			if (list[i] == data) {
				return i;
			}
		}
		return -1;

	}

	public boolean isEmpty() {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				return false;
			}
		}
		return true;
	}

	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] array = (T[]) new Object[getSize()];

		for (int i = 0; i < getSize(); i++) {
			array[i] = list[i];
		}
		return array;
	}

	public void clear() {
		for (int i = 0; i < list.length; i++) {
			list[i] = null;
		}
	}

	public GenericList<T> subList(int startIndex, int finishIndex) {

		/*
		 * @SuppressWarnings("unchecked") T[] array = (T[]) new
		 * Object[finishIndex-startIndex]; for(int i = startIndex; i<finishIndex; i++) {
		 * array[i] = list[i]; } return array;
		 */
		GenericList<T> array = new GenericList<>();
		for (int i = startIndex; i <= finishIndex; i++) {
			array.add(list[i]);
		}
		return array;

	}

	boolean contains(T data) {
		for (T find : list) {
			if (find == data) {
				return true;
			}
		}
		return false;
	}
}
