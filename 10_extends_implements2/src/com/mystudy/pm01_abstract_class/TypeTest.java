package com.mystudy.pm01_abstract_class;

public class TypeTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); //추상클래스 객체생성 못함
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);
		
	}
	
	static void sound(Animal animal) {
		animal.sound();
	}

}
