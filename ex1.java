package java_test;

import java.util.Scanner;

public class ex1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 
		 System.out.println("Enter the integer: ");
		 int num = scan.nextInt();
		 
		 System.out.println("Enter the string: ");
		 String str = scan.next();
		 
		 System.out.println("Integer is :" + num);
		 System.out.println("String is : " + str);
	}
}
