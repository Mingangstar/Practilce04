package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		int num = scanner.nextInt();
		int y = 0;
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		for(int i = 0; i < wonArray.length; i++) {
			y = num % wonArray[i];
			num = num / wonArray[i];
			System.out.println(wonArray[i] + "원:"+ num + "개");
			num = y;
		}
		scanner.close();
	}


	
}