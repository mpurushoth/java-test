package java_test;

import java.util.Scanner;

public class ex5 {
	public static void main (String[] args) {
	   
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = sc.nextLine();
		
		String str_split[] = str.split(" ");
		
		
		for(String a: str_split)
		System.out.println(a);
		
	}
}
