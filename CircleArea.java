package com.mycompany.myapp;

public class CircleArea {
	public static void main(String[] args) {
	
	final double PI = 3.14;
	double radius = 10.2;
	double circleArea = radius*radius*PI;
	
	System.out.print("반지름 " + radius + ", ");
	System.out.print("원의 면적 = " + circleArea);
	}
}
