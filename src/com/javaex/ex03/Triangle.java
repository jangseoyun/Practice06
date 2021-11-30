package com.javaex.ex03;

public class Triangle extends Shape{
	//필드
	private int width;
	private int height;
	//생성자
	public Triangle() {
		super();
	}
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드 g,s
	
	//메소드 일반
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+super.getFillColor());
		System.out.println("#선색:"+super.getLineColor());
		System.out.println("#가로:"+width);
		System.out.println("#세로:"+height);
	}
}





