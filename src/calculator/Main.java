package calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 8;
		int num2 = 6;

		MagicCalculator mcal = new MagicCalculator();
		// testing out all the magic calculator methods inherited from calculator
		System.out.println("Output of add method: " + mcal.add(num1, num2));
		System.out.println("Output of subtract method: " + mcal.subtract(num1, num2));
		System.out.println("Output of multiple method: " + mcal.multiply(num1, num2));
		System.out.println("Output of divide method: " + mcal.divide(num1, num2));
		System.out.println("Output of square method: " + mcal.square(num1, num2));

		// testing out all the magic calculator methods
		System.out.println("Output of sqrt method: " + mcal.sqrt(81));
		System.out.println("Output of sin method: " + mcal.sin(30));
		System.out.println("Output of cos method: " + mcal.cos(45));
		System.out.println("Output of tan method: " + mcal.tan(60));
		System.out.println("Output of factorial method: " + mcal.factorial(5));

	}

}
