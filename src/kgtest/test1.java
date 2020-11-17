package kgtest;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		System.out.println("시간 입력 > ");
		int hour = new Scanner(System.in).nextInt();
		System.out.println("분 입력 > ");
		int min = new Scanner(System.in).nextInt();

		System.out.println("입력한 시간 :" + hour + "시" + min + "분");
		if (hour >= 24 || min >= 60 || hour < 0 || min < 0) {
			System.err.println("에러");
		} else if (hour >= 15) {
			System.out.println("결석");
		} else if (hour >= 9 && min >= 10) {
			System.err.println("지각");
		} else
			System.out.println("정상");
	}

}

