package quiz;

import java.util.Scanner;

public class B09_strupcase {

	// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������
	// �� ������ �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ����
	
	public static void main(String[] args) {

		System.out.println("���� > ");
		String str = new Scanner(System.in).nextLine();
		
		StringBuilder strb = new StringBuilder();		
		
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				// �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���
				// ch -= Math.abs('a' - 'A');
				// ch = (char)(ch - 'a' +'A');
				ch -= 32;				
			}
			strb.append(ch);
		}
		System.out.println(strb);
	    }
	    
	}

//
//System.out.print("���ڿ� > ");
//
//String word= new Scanner(System.in).nextLine();
//
//char change[] = new char[word.length()]; 
//
//for(int i = 0; i < word.length(); i++){
//   change[i] = word.charAt(i);
//   if(change[i] >= 65 && change[i] <= 90)
//	   		change[i] += 32;
//   else if(change[i] >= 97 && change[i] <= 122)
//            change[i] -= 32;
//   System.out.print(change[i]);
//}
//    System.out.println();

//char Alph;
//
//System.err.println("�Է� > ");
//Scanner sc = new Scanner(System.in);
//
//Alph = sc.nextLine().charAt(0);
//
//
//for(int i = 0 ; i < Alph; i++) {
//	if(Alph >= 'a' && Alph <= 'z')
//		break;
//}
//System.out.println((char)(Alph - ('a' - 'A')));
//
