package Javalearning;

public class Car {
	// Fields
	String model;
	String color;
	int year;
	// Constructor
	public Car(String model,String color,int year) {
		this.model=model;
		this.color=color;
		this.year=year;
	}
		void displayInfo() {
			System.out.println("Model:"+model +", Color:"+color+",year:"+year);
			
		
	}
		public static class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar =new Car("Tesla Model S","Red",2022);
		myCar.displayInfo();
	}

	}

}
