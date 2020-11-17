import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class E10_GlobalMessageServer {

	public static void main(String[] args) {

		ArrayList<Socket> clients = new ArrayList<>();

		// Socket�� Key������ �̿��� OutputStream�� �����Ѵ�
		// ���� �޼����� ���� �� : Key�� Socket�� ����
		// ��ü �޼����� ���� �� : ��� out�� �޼��� ����
		HashMap<Socket, PrintWriter> send_map = new HashMap<>();

		try {
			ServerSocket ss = new ServerSocket(3455);

			int count = 0;

			while (true) {
				// ���ӿ� ������ Ŭ���̾�Ʈ���� List�� �����Ͽ� �����Ѵ�
				System.out.println("������ ��ٸ����� ...");
				Socket user = ss.accept();

				// ������ �߰�
				clients.add(user);
				OutputStreamWriter osw = new OutputStreamWriter(user.getOutputStream());
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw);
				send_map.put(user, pw);

				for (PrintWriter out : send_map.values()) {
					pw.printf("<%s>���� ä�ù濡 �����ϼ̽��ϴ�.\n", user.getInetAddress());
					pw.flush();
				}

				if (count++ == 3) {
					break;
				}
			}
			System.out.println("������ ����Ǿ����ϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
