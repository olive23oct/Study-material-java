package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Select {

	public static void main(String[] args) {
		//JDBC�� �̿��� DB ���� ���α׷��� ���
		//0. JDBC ���̺귯���� ����ȯ�濡 ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		//2. DB���� - Connection ��ü ���� <- DriverManager
		//3. Statement �� ����(SQL�� ����)
		//4. SQL ���� ����� ���� ó��
		//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
		//   - INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//////////////////////////////////////////////
		
		//0. JDBC ���̺귯���� ����ȯ�濡 ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[����] ����̹� �ε� ����!!!");
			e.printStackTrace();
		}
		
		//2. DB���� - Connection ��ü ���� <- DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			System.out.println(">> DB���� ����");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("[����] DB���� ����!!!");
		}
		
		//3. Statement �� ����(SQL�� ����)
		Statement stmt = null;
		ResultSet rs = null; //select ����� ���Ϲޱ� ���� ����
		try {
			//Connetion ��ü�� ���� Statement ��ü ����
			stmt = conn.createStatement();
			
			//SQL�� ����
			System.out.println(">> SQL ����");
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG ";
			sql += "  FROM STUDENT ";
			sql += " ORDER BY NAME";
					
			rs = stmt.executeQuery(sql);
			
			//4. SQL ���� ����� ���� ó��
			//   - SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			System.out.println(">> SELECT ��� ó�� ---------");
			while (rs.next()) {
				String str = "";
				str += rs.getString("ID") + "\t";
				str += rs.getString("NAME") + "\t";
				str += rs.getInt("KOR") + "\t";
				str += rs.getInt("ENG") + "\t";
				str += rs.getInt("MATH") + "\t";
				str += rs.getInt("TOT") + "\t";
				str += rs.getDouble("AVG");
				
				System.out.println(str);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//   --��ü ���� ������ �������� close ó��
		try {
			if (rs != null) rs.close();
			System.out.println(">>ResultSet close ó��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (stmt != null) stmt.close();
			System.out.println(">>Statement close ó��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (conn != null) conn.close();
			System.out.println(">>Connection close ó��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}








