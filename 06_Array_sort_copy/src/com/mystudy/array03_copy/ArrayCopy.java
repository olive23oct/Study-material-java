package com.mystudy.array03_copy;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("==== 배열복사(주소값 복사 / 얕은복사)");
		//방법1 : 주소값 복사
		num2 = num1; //같은 데이타 공유(데이타는 하나만 존재) 
		num1[0] = 99999;
		printData("num1", num1);
		printData("num2", num2);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("===== 배열값 복사(물리적인복사 / 깊은복사(deep copy)) ====");
		int[] num3 = new int[5];
		printData("num3", num3);
		
		//num3 <- num1 데이타 복사
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i];
		}
		System.out.println(">>> 복사후 num3 <- num1");
		printData("num3", num3);
		System.out.println("num1 주소: " + num1);
		System.out.println("num3 주소: " + num3);
		
		num1[0] = 888;
		System.out.println("--- num1[0] = 888 변경후 ---");
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		
		num3[1] = 777;
		System.out.println("--- num3[1] = 777 변경후 ---");
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		
		System.out.println("============================");
		System.out.println("=== System.arraycopy() ===");
		int[] num4 = new int[num1.length];
		printData("num4", num4);
		
		//System.arraycopy(src, srcPos, dest, destPos, length)
		//System.arraycopy(소스객체, 시작위치, 대상객체, 대상시작위치, 크기)
		System.arraycopy(num3, 0, num4, 0, num1.length);
		
		System.out.println(">>> System.arraycopy() 복사후");
		printData("num4", num4);
		
		num1[num1.length - 1] = 5555; //num1의 마지막 데이타
		System.out.println(">> num1[num1.length - 1] = 5555 실행후");
		printData("num1", num1);
		printData("num4", num4);
		
		//----------------------------
		System.out.println("==== 배열객체.clone() 복사 ====");
		int[] num5 = num4.clone();
		printData("num4", num4);
		printData("num5", num5);
		//num4, num5 : 객체 주소값 확인
		//데이타 변경 후 값 비교
		
		
		
		//num4와 num5가 주소값 복사/데이타 복사 여부 확인
		
		
		//=====================================
		
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	//메소드 오버로딩(method overloading)
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}









