package java_test;

import java.util.Scanner;

//import javax.swing.text.Position;

public class ex2 {
public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first float: ");
	float first_float = scan.nextFloat();
	
	System.out.println("Enter the secoend float: ");
	float secoend_float = scan.nextFloat();
	
	System.out.println("multiple float is : " + (first_float * secoend_float));
	
}
}
