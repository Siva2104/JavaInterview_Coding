package practise_Java;

import java.util.Arrays;
import java.util.Map;

public class Interview_questions {
	
	
	public static void main(String[]args) {
		System.out.println("1-------------1.Occurance--------------");
		int c = "hello world one again hello".split("o",-1).length-1;
		System.out.println("Method 1:"+ " "+c);
		
		String str = "hello wwwwworld";
		String substr = "hello";
		
		int index = 0;
		int count = 0;
		
		while((index = str.indexOf(substr,index)) !=-1) {
			count ++;
			index += substr.length();
			
		}
		System.out.println("Method 2:"+ " "+c);
		System.out.println(substr+" n"+count);
		System.out.println("-----------------------------------------");
		
		
		
		//duplicate
		
		System.out.println("2-------------------Duplicate--------------------");
		
		 int[] charCount = new int[256]; // Array to store character counts
	       StringBuilder duplicates = new StringBuilder();
	       // Count occurrences of each character
	       for (int i = 0; i < str.length(); i++) {
	           charCount[str.charAt(i)]++;
	       }
	       // Identify characters that appear more than once
	       for (int i = 0; i < charCount.length; i++) {
	           if (charCount[i] > 1) {
	               duplicates.append((char) i).append(": ").append(charCount[i]).append("\n");
	           }
	       }
	       // Print duplicates
	       System.out.println(duplicates.toString());
		
	       System.out.println("-----------------------------------------");
	
	
	
	
	       System.out.println("3-------------------ANagaram`--------------------");
	
	       
	       String ana1 = "stop";
	       String ana2 = "top";
	       
	      boolean ana =  Arrays.equals(ana1.chars().sorted().toArray(), ana2.chars().sorted().toArray());
	      System.out.println(ana);	  
	      
	      System.out.println("4-------------------Reverse`--------------------");

	      String reverse = " ";
	      for (int i = str.length()-1;i>=0;i--) {
	    	  reverse += str.charAt(i);
	      }
	      System.out.println(reverse);
	     
	      
	      System.out.println("5------------------- charcater`--------------------");
	      
	      String Character_4 = "Heelo oworld";
	      String res = Character_4.substring(Character_4.length() - 4);
	      System.out.println(res);
	      
	    
	      
	      
	      System.out.println("5------------------- Palindrome`--------------------");
	      
	      
	      String palindrome = "radar";
	      boolean ispalendrome = new StringBuilder(palindrome).reverse().toString().equals(palindrome);
	      System.out.println(ispalendrome);
	}

}

//method 2 revrese ::

/*
 * public static string reverse (String str){
 * 
 * if(str.isempty()){ return str}
 * 
 * retrun reverse(str.substring(1) + str.charAt(0))
 * }
 * 
 * */

