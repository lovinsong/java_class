package quiz;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E04_SaveGame {

	static class Game {

		public final static String SAVEPATH;
		public final static File SAVEDIR;
		public final static File SAVEFILE;

		static {

			SAVEPATH = "D:\\java_io\\game\\save.sav";
			SAVEDIR = new File("D:\\java_io\\game");
			SAVEFILE = new File("D:\\java_io\\game\\save.sav");
		}

		int win;
		int draw;
		int lose;
		int money;

		// input
		FileInputStream fin = null;
		DataInputStream din = null;
		BufferedReader br = null;

		// output
		FileOutputStream fout = null;
		DataOutputStream dout = null;

		public Game() {
			// ���丮�� ���� ��� ���丮�� ���� �����Ѵ�
			File dir = new File("D:\\java_io\\game");

			if (!dir.exists()) {
				dir.mkdir();
			}

			// �� ���� �ν��Ͻ��� �����Ǹ� ���Ͽ��� ������ ���� ��
			// �������� �ʱ�ȭ �Ѵ�
			try {
				fin = new FileInputStream(new File(dir, "save.sav"));
				din = new DataInputStream(fin);

				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();

			} catch (FileNotFoundException e) {
				// ������ ó�� �������� �� �߻��ϴ� ����
				System.out.println("ó�� �����Դϴ�. ���̺� ������ �����մϴ�");
				try {
					fout = new FileOutputStream(new File(dir, "save.sav"));
					dout = new DataOutputStream(fout);

					dout.writeInt(0); // win
					dout.writeInt(0); // draw
					dout.writeInt(0); // lose
					dout.writeInt(5000); // money

					// �����͸� �� �� �ν��ͽ� �������� �ʱ�ȭ �Ѵ�
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;

				} catch (Exception e1) {
					System.err.println("���̺� ���� ���� ���� ���� �߻� : " + e1.getMessage());
				} finally {
					try {

						if (dout != null)
							dout.close();
						if (fout != null)
							fout.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (din != null)
						din.close();
					if (fin != null)
						fin.close();
				} catch (IOException e) {

				}
			}

			print_game();
		}

		public void print_game() {
			System.out.println(" �÷��̾��� ���� ����");
			System.out.printf(" %d�� %d�� %d��\t %d�� ������\n", win, draw, lose, money);
		}

		public void execute_game() {
			br = new BufferedReader(new InputStreamReader(System.in));

			int com_select = (int) (Math.random() * 3);
			int user_select = -1;
			while (true) {
				try {

					System.out.println(" ����(0), ����(1), ��(2) > ");
					user_select = Integer.parseInt(br.readLine());

					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("������ ������ϴ�.");
					}

					break;

				} catch (NumberFormatException e) {
					System.out.println("����� �������ּ���");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			int timer = 200;

			try {
				System.err.print("��");
				Thread.sleep(500);
				System.err.print("��");
				Thread.sleep(500);
				System.err.print("  ");
				Thread.sleep(500);
				System.err.print("��");
				Thread.sleep(500);
				System.err.print("��");
				Thread.sleep(500);
				System.err.print("  ");
				Thread.sleep(500);
				System.err.print("��");
				Thread.sleep(500);
				System.err.print("!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.printf(" ����� ���� : " + user_select);
			System.out.println(" ��ǻ�� ���� : " + com_select);

			if (user_select == com_select) {
				++draw;
				System.out.println("���º�!");
			} else if (user_select == (com_select + 1) % 3) {
				++win;
				money += 500;
				System.out.println("���� �¸� (+500��) ");
			} else if ((user_select + 1) % 3 == com_select) {
				++lose;
				money -= 500;
				System.out.println("���� �й� (-500��) ");
			}

			print_game();
		}

		public void save() {
			try {
				fout = new FileOutputStream("D:\\java_io\\game\\save.sav");
				dout = new DataOutputStream(fout);

				dout.writeInt(win);
				dout.writeInt(draw);
				dout.writeInt(lose);
				dout.writeInt(money);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (dout != null)
						dout.close();
					if (fout != null)
						fout.close();
				} catch (Exception e) {

				}
			}
		}

	}

	public static void main(String[] args) throws IOException {

		Game game = new Game();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			game.execute_game();

			System.out.println(" ����Ͻðڽ��ϱ�? (Y/N) ");
			if (!"Y".equalsIgnoreCase(br.readLine())) {
				game.save();
				System.out.println("���� ����� ����Ǿ����ϴ�. ���α׷��� �����մϴ�");

				break;
			}
		}

	}

	// ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ������
	// ���α׷� ����� �ڵ����� �÷��̾��� ������ ���Ͽ� �����غ�����

	// ���α׷� ����� ������ �ҷ������� ��������

//	static class count {
//		String com_str = "";
//		String user_str = "";
//		int win;
//		int lose;
//		int draw;
//		int total;
//
//		public count(int win_c, int lose_c, int draw_c, int total_c) {
//			this.win = win_c;
//			this.lose = lose_c;
//			this.draw = draw_c;
//			this.total = total_c;
//		}
//
//		@Override
//		public String toString() {
//
//			return String.format("%dȸ/%d��/%d��/%d��", total, win, lose, draw);
//		}
//		
//	}
//
//	public static void save(count info) throws IOException {
//		
//		String dir = "D:\\java_io\\game\\";
//		String filename = info.total + ".txt";
//		
//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename, Charset.forName("UTF-8"))));
//		
//		pw.print(info);
//		pw.close();
//	}

//		// ���丮 �����޼���
//		File dir = new File("D:\\java_io\\game");
//
//		// ���丮�� �������� �������� ���� �����ϱ�
//		if (!dir.exists()) {
//			dir.mkdir();
//		}

//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir, Charset.forName("UTF-8"))));
//		
//		pw.close();
//		

//		try {
//			DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dir), 2048));
//
//			dout.close();
//
//			System.out.println("������¿Ϸ�");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try {
//			DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\java_io\\game")));
//			din.close();
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try {
//			FileInputStream fin = new FileInputStream(dir);
//
//			Scanner sc = new Scanner(System.in);
//
//			int win_c = 0;
//			int lose_c = 0;
//			int draw_c = 0;
//			int total_c = 0;
//
//			System.out.println("����(1) ����(2) ��(3) ���ӽ���");
//			while (true) {
//				int computer = (int) (Math.random() * 3 + 1);
//				int user = sc.nextInt();
//				System.out.print("��ǻ�� : ");
//				if (computer == 1) {
//					System.out.println("����");
//				} else if (computer == 2) {
//					System.out.println("����");
//				} else if (computer == 3) {
//					System.out.println("��");
//				} else {
//					System.out.println("����");
//				}
//				System.out.print("���� : ");
//				if (user == 1) {
//					System.out.println("����");
//				} else if (user == 2) {
//					System.out.println("����");
//				} else if (user == 3) {
//					System.out.println("��");
//				} else {
//					System.out.println("�ٽ� �Է�");
//				}
//				if (computer == user) {
//					System.out.println("draw");
//					total_c++;
//					draw_c++;
//				} else if ((computer == 1 && user == 2) || (computer == 2 && user == 3 || computer == 3 && user == 1)) {
//					System.out.println("user win");
//					total_c++;
//					win_c++;
//				} else if ((computer == 1 && user == 3) || (computer == 2 && user == 1 || computer == 3 && user == 2)) {
//					System.out.println("computer win");
//					total_c++;
//					lose_c++;
//				}
//				System.out.println("�� " + total_c + " �� ��: " + win_c + " ��: " + lose_c + " ���: " + draw_c);
//
//			}
//		} catch (FileNotFoundException e) {
//			System.err.println("�ش� ������ �����ϴ�.");
//		}
//	}

}
