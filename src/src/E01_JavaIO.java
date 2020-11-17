import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {

	// # Java I/O (input and Output)
	// - �ڹٴ� ��Ʈ���� �̿��� ������� �ٷ��
	// - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ��� (Input)
	// - ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ��� (Output)

	// # Stream
	// - �����͵��� ������ ���
	// - �Է¹����� ����ϴ� ��θ� InputStream�̶�� �θ���
	// - ����Ҷ� ����ϴ� ��θ� OutputStream�̶�� �θ���
	// - �����Ͱ� Stream�� ���� �̵��Ҷ��� �����͸� 0�� 1�� ��ȯ�Ͽ� �����Ѵ�

	// # OutputStream Ŭ������ ���� �޼���
	// - write(int)
	// - write(byte[])
	// - flush : ��Ƴ��� �����͸� �����Ѵ�
	// - close : ��Ʈ���� ����Ѵ� (�ݴ´�)

	// #InputStream Ŭ������ ���� �޼���
	// - int read() : ���� ����Ʈ�� �о�´�, EOF�� �����ϸ� -1�� ��ȯ
	//
	// - close() : ��Ʈ���� �ݴ´� (�޸� ����)

	// �� EOF - end of file

	public static void main(String[] args) {

		// # FileOutputStream
		// - ���Ͽ� ����ϴµ� Ưȭ�� OutputStream
		// - Java IO Ŭ�������� �ʼ������� ó���ؾ��ϴ� ���ܰ� �����Ѵ�

		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\testout.txt");

			// 1. int�� ����ϴ� ���
//			fout.write(65);

			// 2. byte[]�� ����ϴ� ���
			byte[] data = "abcdefg".getBytes();
			fout.write(data);

			// Java IO�� ��Ʈ������ �޸𸮸� gc�� �����ذ��� �ʱ� ������
			// �� �� ��Ʈ���� �ݵ�� ���α׷��Ӱ� ���� �ݾ��־�� �Ѵ�
			fout.close();

			System.out.println("���� ����");
		} catch (FileNotFoundException e) {
			System.err.println("������ ��ã�ҽ��ϴ�.");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �̻��� ����");
		}

		
		
		// # java.io.FileINputStream
		//	- ���Ϸκ��� �Է��� �޴µ� Ưȭ�� InputStream
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\testout.txt");
			
			byte[] bytes = new byte[100];
			
			// ���� ���� -1�� �ƴѵ��� ��� �о���δ�
			int ch = -1;
			int index = 0;
			while((ch = fin.read()) != -1) {
				bytes[index++] = (byte) ch;
			}
			
			System.out.println("byte[]�� ����� ���� : " + Arrays.toString(bytes));
			
			System.out.println(new String(bytes));
			
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("�ش� ������ ã�� ���߽��ϴ�");
		} catch(IOException e) {
			System.err.println("IO���� �����߻�");
		}
		
		
		// # FileInputStream, FileOutputStream�� �����͸� �ڵ�� �о���� ������
		//	���α׷��Ӱ� ���� ���·� �������ϴ� ������ �ʿ��ϴ�
		
		
		
	}

}
