package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {
//1. ������ ����� ���� ����
//2. game start �� ��������� ���� �������Ѵ� -> shuffle

	// �ٸ� �Լ������� ������ ����� �� �ֵ��� �Լ� �ۿ� ������ �����Ҽ� �ִ�
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;

	public static int[] game_index; // {2, 2, 4}

	public static int[] shuffle() {
		// int�� �Ұ�� 52 % 13 : 0 - 12 �����̵�, 13 - 25 ��Ʈ, ... <<-- �̰� ���� �迭 �ʿ����.
		// String "CA","C2", ...."CK" / "SA", "S2" .... "SK" ...
		// char 123456789ABCD << ���� �����ϴ�.
		int[] deck = new int[52];

		for (int i = 0; i < deck.length; ++i) {
			deck[i] = i;
		}

		for (int i = 0; i < 200; ++i) {

			int ran = (int) (Math.random() * 51 + 1);

			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;

		}

		return deck;

	}

	public static void draw(int drawer) {
		switch (drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++];
			break;
		}
	}

	public static String prettyCard(int card) {
		char[] shape = { '��', '��', '��', '��' };
		String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		int s_index = card / 13;
		int v_index = card % 13;

		return shape[s_index] + value[v_index];

	}

	public static void print_game(int mode) {
		System.out.println("DEALER :");
		System.out.println("\t");
		for (int i = 0; i < game_index[0]; ++i) {
			if (mode == 0 && i == 0) {
				System.out.print("X ");
			} else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		if (mode == 0) {
			System.out.println();
		} else {
			System.out.printf("(%d)\n", check_value(0));
		}

		System.out.println("PLAYER ī�� : ");
		System.out.println("\t");
		for (int i = 0; i < game_index[1]; ++i) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n", check_value(1));
//		System.out.println();
	}

	public static int getSum(int[] values) {
		int sum = 0;
		int ace = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 0) {
				sum += 11;
				ace += 1;
			} else if (values[i] >= 10) {
				sum += 10;
			} else {
				sum += values[i] + 1;
			}
		}

		// A�� 1�� �̻� �����ϸ鼭 ���� 21�� ���� �� A�� 1�� �����Ѵ�
		while (sum > 21 && ace > 0) {
			sum -= 10;
			ace -= 1;
		}
		return sum;
	}

	public static int check_value(int user) {
		int[] values = new int[game_index[user]];

		for (int i = 0; i < values.length; ++i) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;
		}
		return getSum(values);
	}

	public static int game_start() {
		// ������ ������ ���� ���� �ϳ� �����Ѵ�
		deck = shuffle();

		// ���࿡ �ʿ��� �������� �ʱ�ȭ�Ѵ�
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];

		// ������� ������ ������ �����Ѵ�
//		 System.out.println(Arrays.toString(deck));

		// (1) ī�� �̱�(����(0) �� ��, �÷��̾�(1) �� ��)
		draw(0);
		draw(0);
		draw(1);
		draw(1);

		Scanner console = new Scanner(System.in);
		int player_value;
		// # �÷��̾��� ����
		while ((player_value = check_value(1)) < 21) {
			// # ���� ���� ���
			print_game(0);
			
			System.out.println("1.hit\t2.stand\n>> ");
			int select = console.nextInt();

			if (select == 2) {
				break;
			} else if (select == 1) {
				draw(1);
			}


		}

		// ������ ���� �̰� ��� ������ ����� �� ����� ����
		print_game(1);
		
		int dealer_value = check_value(0);
		while ((dealer_value = check_value(0)) <= 16) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();}
		// ����� ����

		return check_game(dealer_value, player_value);
	}

	public static int check_game(int d, int p) {
		if (d > 21 && p > 21) {
			return 0;
		} else if (d == p) {
			return 0;
		} else if (p <= 21 && d > 21) {
			return p == 21 ? 2 : 1;
		} else if (p <= 21 && p > d) {
			return p == 21 ? 2 : 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int player_money = 10000;

		while (player_money > 0) {
			int betting = 5000;
			player_money -= betting;

			// boolean Ÿ������ ���޴´� �� �� �� 3��������
			// ������ ����� �޾ƿ´�.
			int game_result = game_start();

			StringBuilder msg = new StringBuilder("���� ��� : ");

			switch (game_result) {
			case 1:
				player_money += betting * 2;
				msg.append("�¸�\n");
				break;
			case 2:
				player_money += (int) (betting * 2.5);
				msg.append("21�� �¸�\n");
				break;
			case 0:
				player_money += betting;
				msg.append("���º�");
				break;
			default:
				msg.append("�й�");
				break;
			}

			msg.append("���� �ܾ� : " + player_money + "��\n");

			System.out.println(msg);
		}
	}

}

// ī�� ���� ����
//	public static String card_choice() {
//	Random ran = new Random();
//	String[][] cardDeck = new String[4][13];
//	
//	int[]shape = new int[4];
//	int[]number = new int[13];
//		 String[] deck = { "��", "��", "��", "��" };
//	 String[] number2 = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
//	 int[][] card = concat
//	}

// ī�� ����
//	public static int suf(int i) {
//		// ī�� ����
//		
//		Random ran = new Random();
//		String[] suffle = new String[2];
//		String[] card_list = new String[52];
//
//		for (int i = 0; i < 10000; ++i) {
//			int random_index = ran.nextInt(51) + 1;
//
//			String temp = card_list[0];
//			card_list[0] = card_list[random_index];
//			card_list[random_index] = temp;
//		}
//		// ����̴´�
//		for (int i = 0; i < 2; ++i)
//			return 0;
//	}

//

// # ������ ��������

// * ���� ����
// 1. ����(��ǻ��)�� ī�带 2�� �� �̴´�
// �� ��, ������ ī��� �� �� �������´�
// 2. ����ڴ� ī�带 ���� �� ������(hit) ������(stand)�� �����Ѵ�
// 3. ����ڰ� ���߸� ������ ������ �ִ� ī�带 ������ �� ��Ģ�� ���� ī�带 �̴´�
// (��ǻ�ʹ� ���� ī�� ���� 16�����϶� ������ �̰�, 17 �̻��̶�� ������ �����)
// 4. �������� ���� ���ų� ��Ȯ�ϰ� 21�̶�� �¸�(���� �ݾ׸�ŭ �÷��̾��� ���� ������)
// �������� ���� ���ų� 21�� ������ �й� (���� �ݾ׸�ŭ �÷��̾��� ���� ��������)
// ������ ī������ ���ٸ� ���º�

// �� ó������ ������ �̴´�.
// �� A�� ���� 21�������� 1�� ����ϰ� 21���� �϶��� 11�� ����Ѵ�
// �� J, Q, K�� 10�� �ش��Ѵ�.
// �� �� ī��� ���纰�� ���徿 �����Ѵ�.

// 1 ~ 9 �� ����
// A :10, B:J, C: Q, D: K
// String deck = "123456789ABCD";

//		StringBuilder card_d = new StringBuilder();
//		
//		String d_set="123456789JQKA";
//		
//		StringBuilder card_c = new StringBuilder();
//		
//		String c_set="123456789JQKA";
//		
//		StringBuilder card_s = new StringBuilder();
//		
//		String s_set="123456789JQKA";
//		
//		StringBuilder card_h = new StringBuilder();
//		
//		String h_set="123456789JQKA";

// ������ ���� ���ڿ��� ���� ��, ���ڿ��� ���� ������ ���� �� ����غ�����

//		 String deck = "123456789ABCD"
//				+ "123456789ABCD"
//				+ "123456789ABCD"
//				+ "123456789ABCD";
//	
//		Random ran = new Random();
//		
//		StringBuilder suf = new StringBuilder();
//		
//		System.out.println(ran.nextFloat());
//
//	public static void main(String[] args) {
//		Random ran = new Random();
//		Scanner sc = new Scanner(System.in);
//		int hum = 0;
//		
//		int[] card = new int[40];
//		
//		for(int i =0; i <card.length; ++i) {
//			card[i]= i + 1;
//		}
//		for(int i = 0; i < 1000; ++i) {
//			int random_index = ran.nextInt(40);
//		int temp = card[0];
//		card[0] = card[random_index];
//		card[random_index] = temp;
//		}
//		if(card[i] > 40) {
//			card[i] - 30;
//		else if (card[i] > 30)
//			card[i] -
//		}
//		for(int i = 0; i < 2; ++i) {
////			System.out.println(card[i]);
//			System.out.println(card[i]);
//		}
//	
//		while (true) {
//			System.out.println("1. ���� �����ϱ�");
//			System.out.println("2. ���� �����ϱ�");
//			System.out.println(" > ");
//			int cmd = sc.nextInt();
//			switch (cmd) {
//			case 1:
//				switch (cmd) {
//				case 1:
//					System.out.println("�׷� ī�� �� ���� �޽��ϴ�");
//					System.out.println("ī�带 �� �����÷��� 1��");
//				case 2:
//					System.out.println("������ ���� �մϴ�.");
//				default:
//					System.out.println("�ٽ� �����Ͻʽÿ�");
//					continue;
//				}
//			case 2:
//				System.out.println("�׸� �����÷��� 2��");
//				break;
//			default:
//				System.out.println("�ٽ� �����Ͻʽÿ�");
//				continue;
//			}
//
//		}