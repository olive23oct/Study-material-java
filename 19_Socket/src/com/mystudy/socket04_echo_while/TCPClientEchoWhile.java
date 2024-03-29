package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		//메시지를 작성해서 서버로 전송하고, 서버로 부터 전달받은 메시지 수신 반복
		//메시지 작성 : Scanner 객체 사용해서 콘솔에서 입력
		Socket socket = null;
		
		//byte 단위 입출력 처리 변수 선언
		InputStream is = null;
		OutputStream os = null;
		
		//필터 추가
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		System.out.println("---- 클라이언트 시작 ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//소켓과 연결된 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//필터 추가 : 바이트(byte) 처리 계열을 문자(char) 처리 계열로 전환
			isr = new InputStreamReader(is);
			
			//필터추가 : 버퍼(buffer) 사용으로 편리하게 라인단위 입출력
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			
			//쓰기, 읽기 반복 처리
			Scanner scan = new Scanner(System.in);
			while (true) {
				//메시지 작성
				System.out.print("메시지작성> ");
				String msg = scan.nextLine();
				
				//작성된 메시지 서버로 전송
				pw.println("[클라이언트] " + msg);
				pw.flush();
				
				//메시지 내용 확인해서 "exit"인 경우 작업 종료
				if ("exit".equalsIgnoreCase(msg)) {
					break;
				}
				
				//서버에서 보내온 메시지 수신
				String reMsg = br.readLine();
				System.out.println("from서버> " + reMsg);
			}
			
			System.out.println("---- 클라이언트 정상 종료 ----");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[예외발생] 클라이언트 비정상 종료" 
					+ " - " + e.getMessage());
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












