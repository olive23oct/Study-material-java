package com.mystudy.ex03_file;

import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		// File 클래스
		String separator = File.separator; //파일경로 구분자
		System.out.println("File.separator : " + File.separator);

		char separatorChar = File.separatorChar;
		System.out.println("File.separatorChar : " + File.separatorChar);
		
		String pathSeparator = File.pathSeparator; //경로(path) 구분자
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		
		File[] listRoots = File.listRoots();
		for (int i = 0; i < listRoots.length; i++) {
			System.out.println(listRoots[i]);
		}
	}

}











