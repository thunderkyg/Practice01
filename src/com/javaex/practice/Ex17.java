package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("반지름: ");
		int radius = sc.nextInt();
		System.out.println("구의부피는: " + (radius*radius*radius*3.14*4/3));
		sc.close();

	}

}
