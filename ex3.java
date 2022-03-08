package java_test;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class ex3 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int num =  sc.nextInt();;
		
			while( num != 0) {
				
				
				if (num % 2 == 0) {
					System.out.println("integer : " + num + " is even Number");
				}
				else {
					System.out.println("integer :" + num + " is odd Number");
				}
				System.out.println("do you want to end press 0, Otherwise Enter the integer ");
				num = sc.nextInt();
			}
			System.out.println("Thank you...Bye");
		}
		
		
}
