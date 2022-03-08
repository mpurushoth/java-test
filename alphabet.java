package java_test;

import java.security.PublicKey;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class alphabet {
	
	public static String readline1() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the sentence or exit to END the program:  ");  
		String sentence = sc.nextLine().toLowerCase();	
		return sentence;
		
	}
	
	public static void vowel_cons(String temp) {
		 
		char[] word =temp.toCharArray();
		String vowel="",consonant = "";
		
		   for(int i= 0;i<word.length;i++) {
			   
			   if((word[i] >='A' && word[i]<='Z')|| (word[i] >='a' && word[i]<='z')) {
				   
			   
				if(word[i]=='a' || word[i]=='e' || word[i]=='i' || word[i]=='o' || word[i]== 'u') {
					
					vowel +=  Character.toString(word[i]);
				}
				else 
					
				    consonant +=  Character.toString(word[i]);
			   }
			   
		   }  
			   System.out.println( vowel + " : is a vowels.");
			   System.out.println("The vowel count is : " + vowel.length());
			   System.out.println(consonant+ " : is a consonants.");
			   System.out.println("The consonant count is : " + consonant.length());
	}
	
	
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
			
		String sentence = readline1();
		String var ="exit";	
		while(!sentence.equals(var)) {
		
		 String[] word1=sentence.split("\\s");
		 System.out.println("The Word count is : " + word1.length);
		 
		 System.out.println("\ncomputation is for the sentence : " + sentence);
		 
		 vowel_cons(sentence); 
		  
		 for(int i = 0;i < word1.length;i++) {
			 
			 
			System.out.println("\ncomputation is for the word : " + word1[i]);
			vowel_cons(word1[i]); 
		 
			
		 }
		   sentence = readline1();
		   
		}
		
		
		System.out.println("Thank You");
	}

}
