package com.mystudy.ex01_exception;

public class ExceptionThrow {

	public static void main(String[] args) {
		// 예외처리 throw : 예외를 발생시킬 때 사용
		//throw new ArithmeticException();
		//throw new ArithmeticException("예외 메시지 작성 전달");

		throw new ArrayIndexOutOfBoundsException();
	}

}
