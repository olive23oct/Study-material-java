package com.mystudy.ex03_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) {
		// 파일명 : temp.txt (파일명.확장자(명))
		File file1 = new File("temp.txt");
		
		//File 객체생성은 파일의 존재여부와 관계없이 생성 가능
		System.out.println(file1);
		
		//절대경로 : root 디렉토리(폴더)로 부터 전체 경로를 표시해서 지정
		//   c:\MyStudy\temp\aaa
		//상대경로 : 현재위치로 부터 찾아가고자 하는 위치를 표시해서 지정
		//   .\..\..\aaa\a1
		
		//C:\temp\aaa\a1\temp.txt
		File file2 = new File("C:\\temp\\aaa\\a1\\temp.txt");

		//상대경로 방식(. : 현재위치, .. : 상위디렉토리(폴더))
		File file3 = new File("file/temp.txt");
		
		System.out.println("---- File getAbsolutePath() ---");
		System.out.println("파일위치(file1) : " + file1.getAbsolutePath());
		System.out.println("파일위치(file2) : " + file2.getAbsolutePath());
		System.out.println("파일위치(file3) : " + file3.getAbsolutePath());
		
		System.out.println("---- File exists() -----");
		System.out.println("있냐(file1) : " + file1.exists());
		System.out.println("있냐(file2) : " + file2.exists());
		System.out.println("있냐(file3) : " + file3.exists());
		
		//파일 속성 정보
		System.out.println("---- File 속성 정보 ------");
		System.out.println("file1.length() : " + file1.length());
		System.out.println("file1.canRead(): " + file1.canRead());
		System.out.println("file1.canWrite(): " + file1.canWrite());
		System.out.println("file1.canExecute(): " + file1.canExecute());
		
		System.out.println("---- File getPath() ----");
		System.out.println("file1.getPath() : " + file1.getPath());
		System.out.println("file2.getPath() : " + file2.getPath());
		System.out.println("file3.getPath() : " + file3.getPath());
		
		System.out.println("---- File getName() ---");
		System.out.println("file1.getName() : " + file1.getName()); //파일명(확장자포함)
		System.out.println("file2.getName() : " + file2.getName());
		System.out.println("file3.getName() : " + file3.getName());
		
		System.out.println("---- isDirectory(), isFile() ---");
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		System.out.println("file1.isFile() : " + file1.isFile());
		
		//파일생성, 파일 삭제
		File file4 = new File("file/temp4.txt");
		try {
			file4.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		file4.delete();
		
	}

}








