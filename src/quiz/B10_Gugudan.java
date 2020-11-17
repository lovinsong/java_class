package quiz;

public class B10_Gugudan {
	// 1. 구구단을 다음과 같이 가로로 출력해보세요
	
	// 2단 : 2x1 =2 2x2 = 4.....
	
	// 2. 국단을 다음과 같이 세로로 출력해보세요
	
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.printf("\n %d단 : ",dan);
			
			for(int gop = 1; gop <=9; ++gop)
				System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);
		}
		System.out.println();
		System.out.println();
	
		//Q2. 풀이
		for (int gop = 0; gop <= 9; ++gop) {
			//줄의 시작
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.printf("%d단\t", dan);
				}else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}
			System.out.println();
			//줄의 끝
		}
		
		//Q2. 풀이2
//		for(int dan2 = 2; dan2 <= 9; ++dan2) {
//			System.out.print(" " + dan2 + "단\t");
//		}
//		System.out.println();
//			for(int gop = 1; gop <= 9; ++gop) {
//				for(int dan = 2; dan <=9; ++dan) {
//				System.out.print(" " + dan + "x" + gop + "=" + gop*dan +"\t" );	
//			}
//				System.out.println();
//	}
}
}