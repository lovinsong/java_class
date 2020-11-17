package kgtest;

import java.util.Random;
import java.util.Scanner;

public class test3 {

//	컴퓨터가 0부터 1000 사이의 정답을 생성하면
//	사용자가 숫자를 입력하여 정답을 맞추는 게임을 만들어보세요
//
//	사용자가 숫자를 입력했을 때 상황별로 알맞은 정보를 출력해야 합니다
//	사용자가 선택한 숫자가 정답보다 낮은 숫자인 경우 - UP!
//	사용자가 선택한 숫자가 정답보다 높은 숫자인 경우 - DOWN!
//	사용자가 정답을 맞춘경우 - 정답!
//
//	게임 종료시 정답이었던 숫자와 여태까지의 총 시도횟수를 출력해야 합니다.
//	사용자 > 5
//	UP!
//	사용자 > 577
//	DOWN!
//	사용자 > 400

	public static void main(String[] args) {

		Random ran = new Random();
		// 0 ~ 1000 까지
		int computer_ran = (int) (Math.random() * 1000 + 1);
		int count = 1;
		while (true) {
			System.out.println("사용자 > :");
			int user_input = new Scanner(System.in).nextInt();
			if (computer_ran > user_input) {
				System.out.println("UP!");
				count++;
			} else if (computer_ran < user_input) {
				System.out.println("DOWN!");
				count++;
			} else if (computer_ran == user_input) {
				System.out.println("정답!");
				System.out.println("정답인 숫자: " + computer_ran);
				System.out.println("시도횟수 : " + count);
				System.exit(0);

			}
		}

	}

}
