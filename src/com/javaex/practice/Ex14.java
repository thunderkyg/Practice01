package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.print("가로를 입력하세요: ");
	int length = sc.nextInt();
	System.out.print("세로를 입력하세요: ");
	int height = sc.nextInt();
	System.out.println("사각형의 넓이는 " + length*height);
	System.out.println("사각형의 둘레는 " + (length+length+height+height));
	sc.close();
	}
}
