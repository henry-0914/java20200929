package chap11.textbook.s110601;

import chap06.textbook.s060802.Car;

public class ClassExample {
	public static void main(String[] args) {
	Car car = new Car();
	Class clazz1 = car.getClass();
	System.out.println(clazz1.getClass());
	System.out.println(clazz1.getSimpleName());
	System.out.println(clazz1.getPackage());
	System.out.println();
	
	
	try {
		Class clazz2 = Class.forName("sec06.exam01_class.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackage().getName());
		
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}