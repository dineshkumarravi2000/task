package Javalearning;

public class TeaStall {
	String tea;
	String chocolate;
	String biscuit;
	int count;
	
	
	public TeaStall(String tea,String biscuit,String chocolate,int count) {
		this.tea=tea;
		this.biscuit=biscuit;
		this.chocolate=chocolate;
		this.count=count;
	}
	
	public void displayInfo() {
		System.out.println("Tea:"+tea+",Biscuit:"+",Chocolate:"+chocolate+",TotalQuantity:"+count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaStall myTeashop=new TeaStall("Lemone Tea","Good day","Munch",3);
		myTeashop.displayInfo();
	}

}
