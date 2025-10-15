package com.oops.overload;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10);
//		shape.area((int)10.5f);
		shape.area(10.5f);
//		int rect = (int)shape.area(10, 20);
		int rect = shape.area(10, 20);
		System.out.println("Rect "+rect);
//		float tri = shape.area(12, (int)10.0f);
		float tri = shape.area(12, 10.0f);
		System.out.println("Tri "+tri);
		
	}
}
