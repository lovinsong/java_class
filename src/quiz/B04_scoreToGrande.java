package quiz;

import java.util.Scanner;

public class B04_scoreToGrande {

	//점수를 입력받으면 해당 등급을 출력해주는 프로그램을 작성해보세요.
	
	// 90점 이상 : A등급
	// 80점 이상 : B등급
	// 70점 이상 : C등급
	// 60점 이상 : D등급
	// 그 외 : F등급
	
	//  ※ 점수는 0점 부터 100점 까지 있습니다.
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력하세요 >");
	int score = sc.nextInt();
	
	if (score < 0 || score > 100)
		System.out.println("점수를 다시 입력하세요");
		//return; // main()을 끝낸다
		//System.exit(0); // 프로그램을 종료한다
	else if (score < 60)
		System.out.println("F 등급 입니다.");
	else if (score < 70)
		System.out.println("D 등급 입니다.");
	else if (score < 80)
		System.out.println("C 등급 입니다.");
	else if (score < 90)
		System.out.println("B 등급 입니다.");
	else
		System.out.println("A 등급 입니다.");
	}
	//식을 줄이자.
	
	//다른 풀이2
//	System.out.println("점수를 입력하세요 >");
//	int score = new Scanner(System.in).nextInt();
//	
//	if (score < 0 || score > 100)
//		System.out.println("점수를 다시 입력하세요");
//	
//	char grade = 'F';
//	if (score >= 90)
//		grade ='A';
//	else if (score >=80)
//		grade ='B';
//	else if (score >=70)
//		grade ='C';
//	else if (score >=60)
//		grade ='D';
//		
//	System.out.printf("당신의 점수 : %d\n등급 : %c\n", score, grade);

}
