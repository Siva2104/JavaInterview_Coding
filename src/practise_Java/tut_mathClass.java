package practise_Java;

public class tut_mathClass {

	
	public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 
	 * Random class
	 * Math.random() >> like min(), max(), avg(), sin(), cos(), tan(), round(), ceil(), floor(), abs() etc.
	 * Math.abs()	It will return the Absolute value of the given value.
		Basic Math methods>>>
		1. Math.max()	It returns the Largest of two values.
		2. Math.min()	It is used to return the Smallest of two values.
		3. Math.round()	It is used to round of the decimal numbers to the nearest value.
		4. Math.sqrt()	It is used to return the square root of a number.
		5. Math.cbrt()	It is used to return the cube root of a number.
		
		Trigonometric Math Methods>> Sin cos tan asin acos atan
	 * */
		
		double a = 18;
	System.out.println(Math.class);
	
	System.out.println(Math.E);
	
	System.out.println(Math.PI);
	
	System.out.println(Math.abs(a));
	
	
	
	
	
	
	
	
	
	
	int a1 = 28; 
	int b = 30;
	
	System.out.println(Math.max(a1, b));
	
	 System.out.println("Square root of y is: " + Math.sqrt(a1));   
     
     //returns 28 power of 4 i.e. 28*28*28*28    
     System.out.println("Power of x and y is: " + Math.pow(a1,b));      

     // return the logarithm of given value       
     System.out.println("Logarithm of x is: " + Math.log(a1));   
     System.out.println("Logarithm of y is: " + Math.log(b));  
       
     // return the logarithm of given value when base is 10      
     System.out.println("log10 of x is: " + Math.log10(a1));   
     System.out.println("log10 of y is: " + Math.log10(b));    
       
     // return the log of x + 1  
     System.out.println("log1p of x is: " +Math.log1p(a1));    

     // return a power of 2    
     System.out.println("exp of a is: " +Math.exp(a1));    
       
     // return (a power of 2)-1  
     System.out.println("expm1 of a is: " +Math.expm1(a1));  
     
	
		
		
		
	}
}
