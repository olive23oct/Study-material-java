package com.mystudy.pm02_interface;

//인터페이스(기본적으로 모두가 추상체)
//단, default, static 메소드는 구현체
public interface I_Animal {
	void eat(); //추상메소드(public abstract 생략됨)
	abstract void sleep();
	public abstract void sound();
}
