
public class Ex04_byte {

	public static void main(String[] args) {
		//정수형 byte : 정수 숫자 저장 256가지(-128 ~ 127)
		byte byte1 = 100;
		byte byte2 = 29;
		byte byte3 = 0;
		
		//sysout 타이핑 후 ctrl + space 바 클릭
		System.out.println("byte1 : " + byte1);
		//ctrl + alt + 화살표아래 클릭으로 윗줄 복사
		System.out.println("byte2 : " + byte2);
		
		//연산결과 값이 표현범위를 벗어나면 예상치 못한 쓰레기 값이 될 수 있음
		byte3 = (byte)(byte1 + byte2);
		System.out.println("byte1 + byte2 : " + byte3);

		//-----------------------
		System.out.println("--- byte 최소, 최대값 ---");
		System.out.println("byte 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 최대값: " + Byte.MAX_VALUE);
	}

}









