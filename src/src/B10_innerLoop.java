
public class B10_innerLoop {

	public static void main(String[] args) {
		
		// #�ݺ��� ���ο� �ݺ��� ����ϱ�
		
		for (int i =0; i<10; ++i) {
			System.out.printf("======================�ٱ� �ݺ��� %d\n", i);
			for (int j = 0; j <5; ++j) {
				System.out.printf("--------------- ���� �ݺ��� %d-%d\n", i, j);
				
				for(int k = 0; k < 2; ++k) {
					System.out.printf("++++++++++++���� ���� �ݺ��� %d-%d-%d\n",i ,j, k);
				}
			}
		}
		
		// # ���� �ݺ������� ������ ����ϱ�
		//	- 2�� - 9�� 
		//	- �� �ܸ��� x1 - x9
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.printf("      + + + %d�� + + +\n", dan);
			for(int gop = 1; gop <=9; ++gop) {
				System.out.printf("\t%d x %d = %d\n", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
	}
}
