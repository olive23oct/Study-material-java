package com.mystudy.ex01_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//������ �б� ���� ��ü ����(File Ÿ���� ��ü �Է¹���)
			fis = new FileInputStream(file);
			
			//read(byte[] b) : byte[] �迭ũ�⸸ŭ �о� b������ ����
			byte[] bytes = new byte[10];
			
			int byteCnt = 0;
			/*
			byteCnt = fis.read(bytes);
			System.out.println("�о�� ���� : " + byteCnt);
			System.out.println("�о�� �� : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("int�� : " + bytes[i]
						+ ", char: " + (char)bytes[i]);
			}
			*/
			
			//���� ������ ���� ������ �ݺ� ó��~~~
			while (true) {
				byteCnt = fis.read(bytes);
				if (byteCnt == -1) break;
				
				System.out.println("�о�� ���� : " + byteCnt);
				System.out.println("�о�� �� : " + Arrays.toString(bytes));
				for (int i = 0; i < byteCnt; i++) {
					System.out.println("int�� : " + bytes[i]
							+ ", char: " + (char)bytes[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











