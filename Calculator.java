package Javalearning;

public class Calculator {
	//Method to add two number
	public int add(int a, int b) {
		return a+b;
	}
	//method to subtract two numbers
	public int subtract(int a,int b) {
		return a-b;
	}
	//method to multiply two numbers
	public int multiply(int a,int b) {
		return a*b;
	}
	public static class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc =new Calculator();
		System.out.println("Addition:"+ calc.add(10, 5));
		System.out.println("Subtraction:"+ calc.subtract(10, 5));
		System.out.println("Multiplication:"+ calc.multiply(10, 5));
		

	}

}
}
