package calculator;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public double square(double num1, double num2) {
		return Math.pow(num1,num2);
	}

	public Calculator() {		
		
	}

}
