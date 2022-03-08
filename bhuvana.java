package java_test;

import java.util.Scanner;

public class bhuvana {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  int i,n,max=0;
	  
	  System.out.println("Enter the array size :");
	  n=scan.nextInt();
	  
	 int arr[]=new int[n];
	  System.out.println("Enter the array element :");
	  for(i=0;i<n;i++) {
		   arr[i]=scan.nextInt();
	  }
	  
      for(i=0;i<arr.length;i++)
      {
    	  if(arr[0]<arr[i])
    	  {
    		  max=arr[i];
    	  }
    	 System.out.println(max); 
      }
	}

}
