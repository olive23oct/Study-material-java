package com.mystudy.am02_extends;

class Phone {
	//필드(속성) ----------
	private String type; //전화타입(형태)
	private String phoneNo; //전화번호
	
	//생성자
	//public Phone() {}
	
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//메소드 ------------------------
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//전화걸기 기능
	public void call() {
		System.out.println(">> 전화걸기");
	}
	//전화받기 기능
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}
	//전화정보 보기
	public void view() {
		System.out.println("타입: " + type 
				+ ", 전화번호: " + phoneNo);
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
	
}














