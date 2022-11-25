package Project;

public class PrintName {
	
	public void AddNumbers() {
		int a =20;
	    int b = 2;
	    int sum = a+b;
	    
	    System.out.println(sum);                 // added a method to add two numbers
	    System.out.println(sum-b);                 // addition , substraction, 
	    System.out.println(a+b+a+b+a); 
	    System.out.println(b-b); 
	    System.out.println(a+a); 
	   
	}
	
	public void weekday() {
		int day = 1;
		switch(day){
		case 1:
		System.out.println("Today is Monday");   //print weekday based
		break;
		case 3:
		System.out.println("Today is Tuesday");
		break;
		case 4:
		System.out.println("Today is Wednesday");
		break;
		case 5:
		System.out.println("Today is Thursday");
		break;
		case 6:
		System.out.println("Today is Friday");
		break;
		case 7:
		System.out.println("Today is Saturday");
		break;
		default:
		System.out.println("Today is Sunday");
		break;
		}
	}
	
	public void EvenOrOdd() {                        //print number is even or Odd
		int number = 6;
				boolean result = number % 2 == 0;
					if (result  ) {
			System.out.println("Number is Even");
		}else {
				System.out.println("Number is Odd");	// if it is 0, print 0
		}
		
	}
	
	public void GreaterNumber() {
		int a=15; int b=63; int c=85;  
		boolean result1 = a>=b;
		boolean result2 = a>=c;
		boolean result3 = b>=a;
		boolean result4 = b>=c;
		
		
	if (result1 && result2)
		System.out.println(a+" is the largest Number"); 
	else if (result3 && result4)  
		System.out.println(b+" is the largest Number"); 
	else  
		 
		System.out.println(c+" is the largest number");  
		 
		}  
	
	public void EvenOddNumber() {
		int num=23;
		if (num!=0) {
			boolean result = num % 2 == 0;
			
			if (result)
				System.out.println("Number is even"); 
			else  
				System.out.println("Number is Odd"); 
		}
		
	else { 
		 
		System.out.println("Number is Zero");  
		 
		}  }
	
	public void vote() {
		
      int age =-17;
      String namefull = "Ravi";
    		 
    		     if (age <=17) {
    		    	 System.out.println(namefull+"  cannot vote"); 
    		     }
    				
    		
    			else {
    				System.out.println(namefull+"  can vote"); 
    			}
    				 
    				 
    				 
    				}  
	
	public void NegPos() {                        //print number is even or Odd
		int u = -1;
		
					if (u >0) 
			System.out.println("Number is Positive");
			else if( u <0)  
				System.out.println("Number is Negative");	// if it is 0, print 0
			else 
				System.out.println("Number is zero");
	}
    		  
    		
    public void Swap() {
    	int x = 10;
    	int y = 11;
    	
    	 System.out.println("before swapping numbers: "+x +"  "+ y);  //do without third variable
    	int t;
    	
    	t = x; //10
    	x = y; //11
    	y = t; 
    	
    	 System.out.println("After swapping: "+x +"   " + y);  
    	
    	
    	
    }
    
    public void Swap55() {     //swap without temproray variable
    	
    	int x =10;
    	int y = 11;
    	
    	System.out.println("Enter the number before swap:"  +x +" "+y);
    	 x= y -x; //1
    	 y = y - x; //10
    	 x = y + x;
    	 System.out.println("Enter the number after swap:"  +x +" "+y);
    	 
    	 
    	
    	
    	
    }
    
    int x =10;
    int y =11;
    
    
    		  
	
	public void ForLoop() {
		int num = 5;
		for(int i=1; i<=10; i++) {
						System.out.println(i+"*"+num +"=" +i*num);
		}
	}
	
	public void forloop2() {
		int i =1;
		for( i=1; i<=10; i++) {             ///naturtal numbers in asceding orders
				System.out.println(i); }
	}
	
	public void forloop3() {
		int i = 10;
		for( i=10;i<=1;i++) {
			System.out.println(i);
		}
	}
	
	
	public void Whileloop() {    //Ascending order
		int i = 1;
		while (i <= 10) {
		 System.out.println(i);
		 i++;
		}
		System.out.println("Whileloop Completed");
		}
	
	
	public void Whileloop2() {    //Descending order
		int i = 10;
		while (i >= 0) {
		 System.out.println(i);
		 i--;
		}
		System.out.println("Whileloop Completed");
		}
	
		
	public void forloop5() {      //Multiplication of a number
	int j =5 ;
	for(int i=1; i<=30; i++) {
	
	System.out.println(j+ "*" +i +"=" +j*i);
	}}

	
	//private String max(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	
	public void split() {     //split
		
		int num=123;
		
				
				while (num>0)
				{
					System.out.println(num % 10);
			       num = num/10;
			
				}
				
	}
	
	
	public void lastNumber() {
		
		int num =123;
		
		 {
			System.out.println("The last digiy is:" +num%10);
			
			
		}

	}
	
	public void sumOfDigits() {
		int number =123; // 12
			 int sum = 0; //0+3    
			 
			 while (number>0) {
				 sum = sum + number%10;
				 number = number/10;
			 } 
				 {
					 System.out.println("The sum is:" +sum);
				 }
				 				 
			 
				
		
		
	}
	
	public void reverse() {
		
		int n =123;
		int r;
		
		while (n>0) {
			
			r = n%10;
			//System.out.println(r);   //Println  in new line and Print in same line
			System.out.print(r);     //how to print in same line
			n = n/10;
				
			
					}
	}
	
	public int Parameters (int x, int y, int z) {
		
		int sum = x+y+z;
		
		return sum;
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
//		String name = "My name is Libu";                //printed name
//
//		System.out.println("Hello");
//		System.out.println(name);
//		//Classname objName = new ClassName();
        PrintName ADD = new PrintName();
//		ADD.AddNumbers();                        //called the method
//		ADD.weekday();
				//ADD.EvenOrOdd();
		//ADD.GreaterNumber();
				//ADD.EvenOddNumber();
				//ADD.vote();
        //ADD.NegPos();
        //ADD.Swap();
        //ADD.ForLoop();
        //ADD.forloop2();//
        //ADD.forloop3();
        //ADD.Whileloop();
        //ADD.Whileloop2();
        //ADD.forloop5();
        //ADD.split();
       //ADD.sumOfDigits();
        //ADD.lastNumber();
	//ADD.reverse();
        //ADD.Swap55();
        PrintName Para = new PrintName();
        int result = Para.Parameters(4, 5, 1);
        System.out.println(result);  //done
	
	}

}
