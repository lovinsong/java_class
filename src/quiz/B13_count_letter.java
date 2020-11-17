package quiz;

public class B13_count_letter {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보세요
	// (대소문자 구분X)

	public static void main(String[] args) {

		String msg = "Hello My name is Tomb I love KImCHI and U";
		msg = msg.toUpperCase();
		// 대소문자 미리 변경

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
			System.out.printf("%c가 등장한 횟수는 %d번 입니다.\n",
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
