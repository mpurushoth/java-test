package java_test;

import java.util.Scanner;

public class revarse_number {
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	int revarse = 0,rem;
	System.out.println("Enter the number: ");
	int n = in.nextInt();
	 
	while(n != 0) {
		
		rem= n%10;
		revarse = (revarse*10)+rem;
		n=n/10;
	}
	System.out.println("Revarse Number is: "+ revarse);
}
}
