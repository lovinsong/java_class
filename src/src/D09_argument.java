
public class D09_argument {

	// Eclipse���� argument �׽�Ʈ�ϱ�
	
	// 1. �ش� ���� ��Ŭ��
	// 2. Run and Debug -> Edit
	// 3. Arguments�� ���ϴ� �� �߰�
	
	
	public static void main(String[] args) {

		System.out.println("���� ���� �ɼ� : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "��° ���α׷� ���� �ɼ� : " + args[i]);
		}

	}

}
