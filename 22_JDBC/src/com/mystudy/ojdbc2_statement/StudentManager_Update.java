package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Update {

	public static void main(String[] args) {
		//JDBC를 이용한 DB 연동 프로그래밍 방법
		//0. JDBC 라이브러리를 개발환경에 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이타 결과 값에 대한 처리
		//   - INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//////////////////////////////////////////////
		
		//(실습)수정 : ID '2019001' 사람의 데이타 수정 처리
		//이름: 홍기동, 국어: 99, 영어: 88, 수학: 77
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement 문 실행(SQL문 실행)
			//3-1. Connetion 객체로 부터 Statement 객체 생성
			stmt = conn.createStatement();
			
			//3-2. Statement 객체를 이용해서 SQL문 실행
			//(실습)수정 : ID '2019001' 사람의 데이타 수정 처리
			//이름: 홍기동, 국어: 99, 영어: 88, 수학: 77
			String id = "2019001";
			String name = "홍기동";
			int kor = 99;
			int eng = 88;
			int math = 77;
			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = '" + name + "' ";
			sql += "     , KOR = " + kor;
			sql += "     , ENG = " + eng;
			sql += "     , MATH = " + math;
			sql += " WHERE ID = '" + id + "' ";
			System.out.println("sql : " + sql);
			
			int result = stmt.executeUpdate(sql);
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이타 결과 값에 대한 처리
			//   - INSERT, UPDATE, DELETE : int값(건수) 처리
			System.out.println(">> 처리건수 : " + result);
			
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[예외] 드라이버 로딩 실패!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}



