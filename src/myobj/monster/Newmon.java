package myobj.monster;

public class Newmon {

	public static void main(String[] args) {

		Newbie mam = new Newbie("����", 500);
		Newbie sun = new Newbie("�Ƶ�", 700);
		mam.intro();

		Archer fam = new Archer();
//		fam.intro();
		fam.askill(mam);
		fam.upgrade();
//		
//		sun.intro();
//
//		sun.upgrade();


	}
}

class Newbie {
	String id;
	int lev;
	String job;

	public Newbie() {

	}

	public Newbie(String id, int lev) {
		this.id = id;
		this.lev = lev;
	}

	public void intro() {
		System.out.printf("���̵� : %s �� ������ %d �̴�.\n", id, lev);

	}

	public void upgrade() {
		System.out.printf("���̵� : %s �� %s�� �����߽��ϴ�.\n", id, job);
	}

}

class Archer extends Newbie {
	String name;
	String job = "�ü�";

	public Archer(String name, int level) {
		
	}
	
	public Archer() {
		super("�ƺ�", 450);

	}

	public void askill(Newbie target) {
		System.out.printf("%s�� %s���� Ȱ�� �����ϴ�.\n", id, target.id);
	}
	public void upgrade() {
		System.out.printf("���̵� : %s �� %s�� �����߽��ϴ�.\n", id, job);
	}

}

class Sniper extends Archer {
	String name;
	String job = "��������";

	Sniper sun = new Sniper();

	
	public Sniper() {
		super("�Ƶ�", 700);
	}

	public void intro() {
		System.out.printf("���̵� : %s �� ������ %d �̴�.\n", id, lev);
	}

	public void askill(Newbie target) {
		System.out.printf("%s�� %s���� ���� �����߽��ϴ�.\n", id, target.id);
	}

	public void upgrade() {
		System.out.printf("���̵� : %s �� %s�� �����߽��ϴ�.\n", id, job);
	}

}
