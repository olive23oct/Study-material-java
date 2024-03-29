package com.mystudy.ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ----");
		int num = 100;
		int num1 = 0;
		int num2 = 30;
		int result = 0;
		System.out.println(">> 연산 시작");
		
		//result = num / num1;
		
		//예외처리 -------------------
		if (num1 == 0) {
			System.out.println("[예외발생]나누는 값이 0입니다.");
		} else {
			result = num / num1;
			System.out.println("result : " + result);
		}
		
		//try ~ catch 문으로 예외 처리
		System.out.println("------ try ~ catch 문 처리 ----");
		try {
			result = num / num1;
			System.out.println("result : " + result);
		} catch(ArithmeticException ex) {
			System.out.println("[예외발생-메시지]" + ex.getMessage());
			//ex.printStackTrace();
		} catch(RuntimeException ex) {
			System.out.println("[예외발생-runtime]" + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("[예외발생] 0으로 나누려고 했습니다.");
		}
		
		System.out.println("--- main() 끝 ----");
	}

}
