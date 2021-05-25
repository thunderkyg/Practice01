package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

		public static void main(String[] args) {
		
		
		double rate = 1.609;
		Scanner sc = new Scanner (System.in);
		System.out.print("마일을 입력하세요: ");
		int distance = sc.nextInt();
		System.out.print(distance + "마일은 " + (distance*rate) + " 킬로미터입니다.");

		
				
				
				
		sc.close();
}
}
