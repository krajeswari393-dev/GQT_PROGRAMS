package com.gqt.gqt_core_java.A_variables;

class Dog{
	String name;
	String color;
	int age;
	int cost;
	String breed;
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
	}
	
}
public class MainAppInstance{
	public static void main(String args[]){
		Dog d1=new Dog();
		d1.display();
		d1.name="Puppy";
		d1.color="White";
		d1.age=8;
		d1.cost=7000;
		d1.breed="GR";
		d1.display();

	}

}