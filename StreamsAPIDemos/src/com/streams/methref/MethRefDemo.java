package com.streams.methref;

import java.util.function.Consumer;

public class MethRefDemo {

	public static void main(String[] args) {
		//using Lambda
		ICalculator calc = (x,y)->System.out.println("Sum "+(x+y));
		calc.add(1, 2);
		
		//using method reference - referring to a static method
		ICalculator calc1 = Operations::sum;
		calc1.add(10, 20);
		
		//using method reference - referring to a non-static(instance) method
		Operations operations = new Operations();
		// implementation
//		IGreeter greeter = operations::greet;
		IGreeter greeter = new Operations()::greet;
		System.out.println(greeter.welcomeUser("Sri"));
		
		
		
		Consumer<String> con = str-> System.out.println(str);
		con.accept("Priya");
		
		con = System.out::print;
		con.accept("Priya");
		
		
		
	}
}
