package com.mystudy.am02_extends;

class Phone {
	//�ʵ�(�Ӽ�) ----------
	private String type; //��ȭŸ��(����)
	private String phoneNo; //��ȭ��ȣ
	
	//������
	//public Phone() {}
	
	public Phone(String phoneNo) {
		this.type = "Phone Ÿ��";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//�޼ҵ� ------------------------
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//��ȭ�ɱ� ���
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	//��ȭ�ޱ� ���
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	//��ȭ���� ����
	public void view() {
		System.out.println("Ÿ��: " + type 
				+ ", ��ȭ��ȣ: " + phoneNo);
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
	
}













