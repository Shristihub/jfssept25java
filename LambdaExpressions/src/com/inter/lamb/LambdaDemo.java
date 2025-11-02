package com.inter.lamb;

public class LambdaDemo {
	public static void main(String[] args) {
		//implmentation ()->{}
		ICalculator ref = (int x, int y)->{
			System.out.println("Sum "+(x+y));
		};
		//calling
		ref.calculate(10, 20);
		ref = (x,y)->System.out.println("Product "+(x*y));
		ref.calculate(10, 20);
		
		
		IGreeter greeter = uname->{
			System.out.println("welcome back");
			if(uname.equals("Priya"))
				return "Hello "+uname;
			else
				return "wrong user";
		};
		System.out.println("Hi...");
		System.out.println(greeter.greetUser("Priya"));
		
		
		IGreeter greeter1 = str ->"welcome "+str;
		System.out.println(greeter1.greetUser("Sri"));
		
		
		
	}

}
