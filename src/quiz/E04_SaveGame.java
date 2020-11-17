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
			// 디렉토리가 없는 경우 디렉토리를 먼저 생성한다
			File dir = new File("D:\\java_io\\game");

			if (!dir.exists()) {
				dir.mkdir();
			}

			// 새 게임 인스턴스가 생성되면 파일에서 전적을 읽은 뒤
			// 변수들을 초기화 한다
			try {
				fin = new FileInputStream(new File(dir, "save.sav"));
				din = new DataInputStream(fin);

				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();

			} catch (FileNotFoundException e) {
				// 게임을 처음 실행했을 때 발생하는 예외
				System.out.println("처음 실행입니다. 세이브 파일을 생성합니다");
				try {
					fout = new FileOutputStream(new File(dir, "save.sav"));
					dout = new DataOutputStream(fout);

					dout.writeInt(0); // win
					dout.writeInt(0); // draw
					dout.writeInt(0); // lose
					dout.writeInt(5000); // money

					// 데이터를 쓴 뒤 인스터스 변수들을 초기화 한다
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;

				} catch (Exception e1) {
					System.err.println("세이브 파일 생성 도중 에러 발생 : " + e1.getMessage());
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
			System.out.println(" 플레이어의 현재 정보");
			System.out.printf(" %d승 %d무 %d패\t %d원 보유중\n", win, draw, lose, money);
		}

		public void execute_game() {
			br = new BufferedReader(new InputStreamReader(System.in));

			int com_select = (int) (Math.random() * 3);
			int user_select = -1;
			while (true) {
				try {

					System.out.println(" 가위(0), 바위(1), 보(2) > ");
					user_select = Integer.parseInt(br.readLine());

					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("범위를 벗어났습니다.");
					}

					break;

				} catch (NumberFormatException e) {
					System.out.println("제대로 선택해주세요");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			int timer = 200;

			try {
				System.err.print("가");
				Thread.sleep(500);
				System.err.print("위");
				Thread.sleep(500);
				System.err.print("  ");
				Thread.sleep(500);
				System.err.print("바");
				Thread.sleep(500);
				System.err.print("위");
				Thread.sleep(500);
				System.err.print("  ");
				Thread.sleep(500);
				System.err.print("보");
				Thread.sleep(500);
				System.err.print("!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.printf(" 사용자 선택 : " + user_select);
			System.out.println(" 컴퓨터 선택 : " + com_select);

			if (user_select == com_select) {
				++draw;
				System.out.println("무승부!");
			} else if (user_select == (com_select + 1) % 3) {
				++win;
				money += 500;
				System.out.println("유저 승리 (+500원) ");
			} else if ((user_select + 1) % 3 == com_select) {
				++lose;
				money -= 500;
				System.out.println("유저 패배 (-500원) ");
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

			System.out.println(" 계속하시겠습니까? (Y/N) ");
			if (!"Y".equalsIgnoreCase(br.readLine())) {
				game.save();
				System.out.println("진행 결과가 저장되었습니다. 프로그램을 종료합니다");

				break;
			}
		}

	}

	// 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든후
	// 프로그램 종료시 자동으로 플레이어의 전적을 파일에 저장해보세요

	// 프로그램 실행시 전적을 불러오도록 만들어보세요

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
//			return String.format("%d회/%d승/%d패/%d무", total, win, lose, draw);
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

//		// 디렉토리 생성메서드
//		File dir = new File("D:\\java_io\\game");
//
//		// 디렉토리가 존재하지 않을때만 새로 생성하기
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
//			System.out.println("파일출력완료");
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
//			System.out.println("가위(1) 바위(2) 보(3) 게임시작");
//			while (true) {
//				int computer = (int) (Math.random() * 3 + 1);
//				int user = sc.nextInt();
//				System.out.print("컴퓨터 : ");
//				if (computer == 1) {
//					System.out.println("가위");
//				} else if (computer == 2) {
//					System.out.println("바위");
//				} else if (computer == 3) {
//					System.out.println("보");
//				} else {
//					System.out.println("에러");
//				}
//				System.out.print("유저 : ");
//				if (user == 1) {
//					System.out.println("가위");
//				} else if (user == 2) {
//					System.out.println("바위");
//				} else if (user == 3) {
//					System.out.println("보");
//				} else {
//					System.out.println("다시 입력");
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
//				System.out.println("총 " + total_c + " 번 승: " + win_c + " 패: " + lose_c + " 비김: " + draw_c);
//
//			}
//		} catch (FileNotFoundException e) {
//			System.err.println("해당 파일이 없습니다.");
//		}
//	}

}
