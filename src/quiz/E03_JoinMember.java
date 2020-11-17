package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;

public class E03_JoinMember {

	// 1.����ڰ� �ڽ��� ���������� �Է��ϸ�
	// �� ������ ������� �̸����� �� ���Ͽ� �����غ�����

	// 2. ������� �̸��� ���� ������ �ش� ����ڰ�
	// (1) ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ������ְ�
	// (2) ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼��带 �ۼ��غ�����

	// 3. ����� ������� ������ ������ �� �ִ� �޼��带 �����غ�����

	// �� D:\\java_io\\member\\ ���丮�� ������ ��

	static class Member {
		
		String name;
		int age;
		String blood_type;
		String tel;

		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}

		public Member update(Member to_update) {

			return new Member(to_update.name == null ? this.name : to_update.name,
					to_update.age == -1 ? this.age : to_update.age,
					to_update.blood_type == null ? this.blood_type : to_update.blood_type,
					to_update.tel == null ? this.tel : to_update.tel);
		}

		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s", name, age, blood_type, tel);
		}

	}

	public static void modify(Member to_update) throws IOException {

		// to_update�� �̸��� �������� ���� �������� �����ǰ� �������� �����ǵ��� �����
		String dir = "D:\\java_io\\member\\";
		String filename = to_update.name + ".txt";

		BufferedReader br = null;
		PrintWriter pw = null;

		// ���� �����͸� �о���δ�
		try {
			br = new BufferedReader(new FileReader(dir + filename, Charset.forName("UTF-8")));
			String[] data = br.readLine().split("/");

			Member before = new Member(data[0], Integer.parseInt(data[1]), data[2], data[3]);

			// �⺻�����͸� ���ο� �����ͷ� �����
			Member after = before.update(to_update);

			// �ϼ��� after�� ���Ͽ� ����
			pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename, Charset.forName("UTF-8"))));

			// MemberŬ������ toString�� �̿��Ѵ�
			pw.print(after);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				br.close();
			if (pw != null)
				pw.close();

		}

	}

	public static boolean checkNotMember(String name) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = name + ".txt";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(dir + filename, Charset.forName("UTF-8")));

			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ���� >>\n", data[0]);
			System.out.println("�̸� : " + data[0]);
			System.out.println("���� : " + data[1]);
			System.out.println("������ : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return false;

		} catch (FileNotFoundException e) {
			System.out.println("[Systme] - ȸ�������� �����մϴ�");
			return true;
		} finally {
			if (br != null)
				br.close();

		}

	}

	public static void save(Member info) throws IOException {

		String dir = "D:\\java_io\\member\\";
		String filename = info.name + ".txt";

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename, Charset.forName("UTF-8"))));

		pw.print(info);
		pw.close();
	}

	public static void main(String[] args) throws IOException {

		Member to_update = new Member("��浿", -1, "c", null);
		modify(to_update);
//		try {
//			// InputStreamReader : InputStream�� ���ڷ� ��ȯ (byte -> char)
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//			System.out.print("�̸� >");
//			String name = br.readLine();
//
//			if (checkNotMember(name)) {
//				System.out.print("���� > ");
//				int age = Integer.parseInt(br.readLine());
//
//				System.out.println("������ > ");
//				String blood_type = br.readLine();
//
//				System.out.println("��ȭ��ȣ >");
//				String tel = br.readLine();
//
//				save(new Member(name, age, blood_type, tel));
//
//				br.close();
//			}
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}

	}

//	String member = null;
//	String info = null;
//
//	HashMap<String, HashMap<String, String>> joinmember;
//
//	public E03_JoinMember() {
//		joinmember = new HashMap<>();
//	}
//
//	// �̸� ��� ������ ��ȯ
//	public boolean addMember(String member) {
//		if (joinmember.containsKey(member)) {
//			System.err.println("�̹� �����ϴ� �̸��Դϴ�.");
//			return false;
//		} else {
//			joinmember.put(member, new HashMap<>());
//			System.out.println("���ο� �̸��� �߰� �Ǿ����ϴ�." + member);
//			return true;
//		}
//
//	}
//
//	// ����
//	public boolean addMemberInfo(String member, String info) {
//		if (joinmember.containsKey(member)) {
//			System.out.println("������ �����մϴ�.");
//			return true;
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		E03_JoinMember member_m = new E03_JoinMember();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸��� �Է��Ͻÿ�\n>");
//		String name = sc.nextLine();
//		member_m.addMember(name);
//
//		System.out.println("������ �Է��ϼ���\n>");
//		String info = sc.nextLine();
//		member_m.addMemberInfo(name, info);
//
//		try {
//
//			FileWriter fw = new FileWriter("D:\\java_io\\member\\" + name + ".txt", Charset.forName("UTF-8"));
//
//			BufferedWriter bw = new BufferedWriter(fw, 2048);
//
//			PrintWriter pw = new PrintWriter(bw);
//
//			pw.write(info);
//
//			pw.close();
//			bw.close();
//			fw.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
