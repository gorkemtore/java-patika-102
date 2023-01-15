class Printer <T>
{
   //Write your code here
   public void printArray(T[] value){
       
       for (T t : value) {
           System.out.println(t);
       }
              
   }
 
}
public class Solution {

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

	}

}
