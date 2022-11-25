package Project;

public class Mobile {
	
	String color;
	String brand;
	int count;
	Boolean android;
	
	public void print() {
		
		System.out.println("mobile color is "+ color);
		
		System.out.println("mobile color is "+ brand);
		
		System.out.println("mobile color is "+ count);
	}

	public static void main(String[] args) {
		
		//class name new objct = new class name
		Mobile shop = new Mobile();
		shop.color="black";
		shop.brand="iPhone";
		shop.count=2;
		shop.print();
				
		
		

	}

}
