import java.util.IllegalFormatConversionException;

public class C12_tryCatchFinally {

	// # ���� ó��
	// - �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)��� �θ���
	// - ���������� Ʋ������ ���ܰ� �ƴ϶� �����̴�.
	// - ���α׷��Ӱ� ���ܿ� ���� ������ ��ġ�� �����شٸ�
	// ���α׷��� ������������ �ʰ� ����ؼ� �����ϰ� �ȴ�

	// # try
	// - ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	// - ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	// - ���ܰ� �߻��Ѵٸ� �ش� ���ܸ� �޴� catch������ �Ѿ�� �ȴ�
	// - catch���� �������� ����� �� �ִ�

	// # catch
	// - try�� ������ �ڵ忡�� ���ܰ� �߻��ϸ� �ش� catch������ �̵��Ѵ�
	// - ù ��° �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� �޴´�
	// - catch���� ��ø ����� �����ϴ�
	// - ExceptionŸ���� Catch���� ��� ���ܸ� catch�� �� �ִ�
	// �� Exception : ��� ������ �θ�Ÿ��

	// # finally
	// - try�� ������ ���� �߻� ���ο� ������� ������ ����Ǵ� ����

	public static void main(String[] args) {
		int[] abc = new int[10];

		try {
			System.out.println("try���� ����");

			System.out.println(abc[0]); // ���� �߻� �ڵ�

			// Integer.parseInt(str) : ���ڿ��� intŸ���� ������ ��ȯ�ϴ� �޼���
			System.out.println(Integer.parseInt("12"));// ���� �߻� �ڵ� 2

			System.out.printf("%d\n", 123);

			System.out.println("try���� ������");
			return;
		} catch (Exception e) {
			System.out.println("catch : " + e.getMessage());
			return;
		} finally {
			System.out.println(" /)/)");
			System.out.println("(.. )");
			System.out.println(" ��< )");
		}

//		} 
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�ε��� ���� : catch�� ����");
//			// System.out.println("�迭�� �ε����� ������Ƿ� ������ ���� ����ص帮�ڽ��ϴ�." + abc[9]);
//		} catch (NumberFormatException e) {
//			System.out.println("���ڰ� �ƴ� : catch�� ����");
//		} catch (IllegalFormatConversionException e) {
//			System.out.println("catch�� ���� :" + e.getMessage());
//
//			e.printStackTrace(); // ���� �߻��� �⺻�����̾��� ��
//			System.exit(0);
//		}

//		System.out.println("������� �� ����Ǿ����ϴ�.");

	}

}
