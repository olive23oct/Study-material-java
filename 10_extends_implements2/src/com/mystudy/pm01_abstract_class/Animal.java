package com.mystudy.pm01_abstract_class;

//�߻�Ŭ���� : abstract class
//�����޼ҵ�� �߻�޼ҵ尡 �Բ� �ִ� �޼ҵ�(�߻�޼ҵ尡 �ϳ��� ������)
//�߻�Ŭ������ �߻�޼ҵ尡 �־ ��ü(�ν��Ͻ�)�� ������ �� ����
abstract class Animal {
	String name; //�̸�, ��Ī
	int legCnt; //�ٸ�����
	
	void eat() {
		System.out.println(">> �Դ´�");
	}
	
	void sleep() {
		System.out.println(">> ���� �ܴ�");
	}

	abstract void sound(); //�߻�޼ҵ�(abstract method)
}





















