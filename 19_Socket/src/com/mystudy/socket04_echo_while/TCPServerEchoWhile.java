package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		// 클라이언트에서 보내는 메시지를 받고 보내기 반복처리
		// 수신(input)후에 수신메시지를 화면출력 후 클라이언트로 전송(output)

		ServerSocket server = null;
		
		//데이타를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//데이타를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		PrintWriter pw = null;
		
		System.out.println(">> 서버 시작~~~");
		try {
			server = new ServerSocket(10000);
			System.out.println(">> 클라이언트 접속 대기중...");
			
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨");
			
			//연결된 소켓과 데이타를 주고 받기 위한 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//필터 추가 : 바이트(byte) 처리 계열을 문자(char) 처리 계열로 전환
			isr = new InputStreamReader(is);
			
			//필터추가 : 버퍼(buffer) 사용으로 편리하게 라인단위 입출력
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			System.out.println(">> 데이타 읽기");
			while (true) {
				//읽기
				String msg = br.readLine();
				System.out.println("받은메시지> " + msg);
				
				//클라이언트가 작업종료(exit)하면 종료 처리
				if ("exit".equalsIgnoreCase(msg) || msg == null) {
					break;
				}
				
				//쓰기
				pw.println(msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>>> 서버 종료 ------------");
	}

}













