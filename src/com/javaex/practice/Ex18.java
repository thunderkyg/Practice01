package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("화씨: ");
		int temperature = sc.nextInt();
		System.out.println("화씨 " + temperature + " 의 섭씨온도는 " + ((temperature-32.0) * 5/9) );
		sc.close();

	}

}
