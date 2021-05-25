package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		double rate = 1230.95;
		Scanner sc = new Scanner (System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		int money = sc.nextInt();
		System.out.print("받으실 달러는: " + money/rate);

		
				
				
				
		sc.close();

	}

}
