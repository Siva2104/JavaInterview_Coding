/**
 * 
 * 
 * 
 * <<piece of memory store value>>
 * 

<varaiable>
 1. Local variable//local variable should be initialized >> within the methods
 2. Instance variable >> will have default values >> inside the class
 3. Class . static 
 
 <Data_type>
 
 String
 int
 float
 boolean

 
 **/



package practise_Java;

public class tut_variable_dataType {

	 static int month ;
	public static int year = 2000;
	
	public static void  main (String [] args) {

		int a=2012;
		char c; //error 
		float f; //error
		String str; //error
		
		System.out.println(a);
		System.out.println(month); //output: 0
		System.out.println(year); //2000
		System.out.println("hi");
	}

		public static void  main1  (String [] args) {
			System.out.println(month); //output: 0
			System.out.println(year);
		}
}
