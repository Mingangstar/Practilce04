package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] num = new int [6];
		int random;
		
		for (int i = 0; i < num.length; i++) {
			random = (int)(Math.random()*45)+1;
			
			for (int j =0; j < i; j++) { //j < i; 채워져 있는 배열까지만 확인
				if (num [j] == random) { 
					random = (int)(Math.random()*45)+1;
					j = -1; // 다시 중복될수 있으니 재확인 
				}
				
			} //for(중복 값을 확인하는) 종료
			
			 num[i] = random;
			 System.out.print(num[i]+" ");
		} //for(배열에 랜덤값을 넣는) 종료 

	}

}