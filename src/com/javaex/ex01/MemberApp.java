package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member first = new Member();
		first.setId("jws");
		first.setName("정우석");
		first.setPoint(50000);
		
		Member second = new Member();
		second.setId("yjs");
		second.setName("유재석");
		second.setPoint(30000);
		
		Member third = new Member();
		third.setId("lhs");
		third.setName("이효리");
		third.setPoint(40000);
		
		first.showInfo();
		second.showInfo();
		third.showInfo();
	}

}
