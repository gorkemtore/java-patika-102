import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static Scanner scan = new Scanner(System.in);
public static int B;
public static int H;
public static boolean flag = false;

static{
    B = scan.nextInt();
    H = scan.nextInt();
    
    if(H<=0 || B<=0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else{
        flag = true;
    }
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

