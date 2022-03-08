package java_test;

import java.util.Scanner;

public class loan_amount {
public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
	int amount,interest,bal,i;
	
	System.out.println("Enter the Loan Amount: ");
	amount = sc.nextInt();
	
	for(i = 1;i<=3;i++) {
		interest = amount * 10/100;
		bal = amount - interest;
		System.out.println( i + "St Month  Balence Amount is : " + bal);
		amount = bal;
	}
}
}
