
public class Ex13_plusEqual {

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 사용형태 : 저장할변수명 대입연산자 저장할값(상수) 또는 변수
		//예) num += 2; ---> num = num + 2;
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		System.out.println("result : " + result);
		result += 15; //result = result + 15;
		System.out.println("result += 15 : " + result);
		
		result += 15;
		System.out.println("result += 15 : " + result);

		System.out.println("-- -=연산 --");
		result -= 10; //result = result - 10;
		System.out.println("result -= 10 : " + result);
		System.out.println(); //빈줄 하나 추가
		
		result *= 10; //result = result * 10;
		System.out.println("result *= 10 : " + result);
		
		result /= 130; //result = result / 130;
		System.out.println("result /= 130 : " + result);
		
		System.out.println();
		result = 10;
		System.out.println("result : " + result);
		result %= 3;
		System.out.println("result %= 3 : " + result);
		
		//------------------
		System.out.println();
		System.out.println("num1: "+ num1 + ", num2: " + num2);
		System.out.println("result : " + result);
		
		result += num2;
		System.out.println("result += num2 : " + result);
		
		result -= num1;
		System.out.println("result -= num1 : " + result);
	}

}















