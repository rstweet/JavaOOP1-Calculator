package calculator;

import java.lang.Math;

public class MagicCalculator extends Calculator {

	// Finds the square root of a number
	public double sqrt(double num1) {
		return Math.sqrt(num1);
	}
	// Finds the sin (trigonometry) of a number.
	// Math.sin(double radians)

	public double sin(double radians) {
		return Math.sin(radians);
	}

	// Finds the cosine (trigonometry) of a number.
	// Math.cosin(double radians)
	public double cos(double radians) {
		return Math.cos(radians);
	}

	// Finds the tangent (trigonometry) of a number.
	// Math. tangent(double radians)
	public double tan(double radians) {
		return Math.tan(radians);
	}

	// Finds factorial of given number
	// class Test
	// {
	// method to find factorial of given number
	public int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

//		     Driver method 
//		    public static void main(String[] args)  
//		    { 
//		    	MagicCalculator mcalc = new MagicCalculator();
//		        int num = 5; 
//		        System.out.println("Factorial of "+ num + " is " + mcalc.factorial(num)); 
//		    } 

	public MagicCalculator() {
		// TODO Auto-generated constructor stub
	}

}
