package com.mystudy.ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ----");
		int num = 100;
		int num1 = 0;
		int num2 = 30;
		int result = 0;
		System.out.println(">> ���� ����");
		
		//result = num / num1;
		
		//����ó�� -------------------
		if (num1 == 0) {
			System.out.println("[���ܹ߻�]������ ���� 0�Դϴ�.");
		} else {
			result = num / num1;
			System.out.println("result : " + result);
		}
		
		//try ~ catch ������ ���� ó��
		System.out.println("------ try ~ catch �� ó�� ----");
		try {
			result = num / num1;
			System.out.println("result : " + result);
		} catch(ArithmeticException ex) {
			System.out.println("[���ܹ߻�-�޽���]" + ex.getMessage());
			//ex.printStackTrace();
		} catch(RuntimeException ex) {
			System.out.println("[���ܹ߻�-runtime]" + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("[���ܹ߻�] 0���� �������� �߽��ϴ�.");
		}
		
		System.out.println("--- main() �� ----");
	}

}