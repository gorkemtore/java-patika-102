package Solution;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.out.print("Sayı :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine().trim());
		Object o;// Must be used to hold the reference of the instance of
					// the class Solution.Inner.Private

		Inner inner = new Inner();
		Inner.Private p = inner.new Private();
		System.out.println(num + " is " + p.powerof2(num));
		o = p;

		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

		// end of try

	}// end of main

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}// end of Inner

}// end of Solution