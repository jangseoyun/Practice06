package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//---------회원------------------------
		//배열 공간 생성 (전체 관리)
		User[] uArray = new User[3];

		//---------직원-----------------------
		//객체 생성
		User e01 = new Employee("master","m7788","운영자",5000000);
		
		//배열에 객체 대입
		uArray[2] = e01;

		//---------고객------------------------
		
		//객체 생성
		User c01 = new Customer("jws","j1234","정우성",1000);
		User c02 = new Customer("yjs","y2345","이효리",2000);
		
		//배열에 객체 대입
		uArray[0] = c01;
		uArray[1] = c02;
		
		for(int i = 0; i<uArray.length; i++) {
			uArray[i].showinfo();
		}

	}

}
