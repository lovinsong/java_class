package quiz;

public class B10_Gugudan {
	// 1. �������� ������ ���� ���η� ����غ�����
	
	// 2�� : 2x1 =2 2x2 = 4.....
	
	// 2. ������ ������ ���� ���η� ����غ�����
	
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.printf("\n %d�� : ",dan);
			
			for(int gop = 1; gop <=9; ++gop)
				System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);
		}
		System.out.println();
		System.out.println();
	
		//Q2. Ǯ��
		for (int gop = 0; gop <= 9; ++gop) {
			//���� ����
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.printf("%d��\t", dan);
				}else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}
			System.out.println();
			//���� ��
		}
		
		//Q2. Ǯ��2
//		for(int dan2 = 2; dan2 <= 9; ++dan2) {
//			System.out.print(" " + dan2 + "��\t");
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