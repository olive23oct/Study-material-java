
public class Ex02_if_else {

	public static void main(String[] args) {
		//if문 3종류
		//if (조건) {}
		//if (조건) {} else {}
		//if (조건) {} else if () {} else if () {} ...
		int num1 = 30;
		int num2 = 50;
		System.out.println("num1: "+ num1 +", num2: "+ num2);
		
		//1. if (조건) {}
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		}
		if (num1 <= num2) {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		System.out.println(">> if() 끝");
		
		System.out.println("------------------");
		//2. if (조건) {} else {}
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		
		System.out.println("-------------------");
		//3. if (조건) {} else if () {} else if () {} ...
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else if (num1 == num2) {
			System.out.println("num1은 num2와 같다");
		} else {
			System.out.println("num1은 num2보다 작다");
		}
		
		//====================================
		/*
		if () {
			if () {
				if () {
				} else {
				}
			}
		} else {
			if () {
			} else if () {
			} else if () {
			} else if () {
			} else {
			}
		}
		*/
	}

}











