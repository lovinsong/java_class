package quiz;

public class B13_count_letter {

	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ�����
	// (��ҹ��� ����X)

	public static void main(String[] args) {

		String msg = "Hello My name is Tomb I love KImCHI and U";
		msg = msg.toUpperCase();
		// ��ҹ��� �̸� ����

		int[] count = new int[26];

		for (int i = 0; i < msg.length(); ++i) {

			char ch = msg.charAt(i);

//					'a' - 'a' -> 0 - >count[0] += 1
//					'b' - 'a' -> 1 - >count[1] += 1
//					'c' - 'a' -> 2 - >count[2] += 1

			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a'] += 1;
			}
		}
		
		for (int i = 0; i < 26; ++i) {
			if (count[i] > 0) 
			System.out.printf("%c�� ������ Ƚ���� %d�� �Դϴ�.\n",
					i + 'a', count[i]);
		}
	}

}

//		String[] mun = { "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" };
//		boolean[] test_mun = new boolean[] {
//				true,false	
//		};

//		for (int i = 0, len = mun.length; i < mun.length; ++i) {

//		System.out.println(Arrays.toString(mun));
//		String munStr = Arrays.toString(mun);
//		for (int index = 0; index < mun.length; ++index) {
//			
//			System.out.printf("%d + %s\n", index, mun[index]);
