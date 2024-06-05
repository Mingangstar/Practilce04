package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[]; 
		num = new int[5];
		// 5개의 정수를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.print("정수를 입력해주세요:");
			num [i] = scanner.nextInt();
			sum = num [i] + sum;
		}
		
		System.out.println("평균은" + sum / 5 + "입니다.");
		scanner.close();
	}
	
	

}