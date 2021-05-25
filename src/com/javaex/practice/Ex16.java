package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("상품가격: ");
	int price = sc.nextInt();
	System.out.print("받은돈: ");
	int rcv = sc.nextInt();
	System.out.println("=======================");

	System.out.println("받은돈:" + rcv);
	System.out.println("상품가격" + price);
	System.out.println("부가세" + price/10);
	System.out.println("잔액" + (rcv-price));
	
	sc.close();
	}
}
