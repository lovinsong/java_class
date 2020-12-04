import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class E09_Client {

	public static void main(String[] args) {

		// E08�� �����ϴ� ���α׷�

		try {
			
			for (int i = 0; i < 999900; i++) {
				
			Socket s = new Socket("localhost", 3455);
			System.out.println("���ῡ �����߽��ϴ�.");

			PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

			System.out.println("Enter�� ������ ������ �޼����� �����մϴ�.");
			out.println("[Client] Hello!");				
			out.close();`
			s.close();
			}
			System.out.println("�޼����� ���������� �����߽��ϴ�.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
