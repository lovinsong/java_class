package myobj.monster;

public class Newmon {

	public static void main(String[] args) {

		Newbie mam = new Newbie("엄마", 500);
		Newbie sun = new Newbie("아들", 700);
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
		System.out.printf("아이디 : %s 는 레벨이 %d 이다.\n", id, lev);

	}

	public void upgrade() {
		System.out.printf("아이디 : %s 는 %s로 전직했습니다.\n", id, job);
	}

}

class Archer extends Newbie {
	String name;
	String job = "궁수";

	public Archer(String name, int level) {
		
	}
	
	public Archer() {
		super("아빠", 450);

	}

	public void askill(Newbie target) {
		System.out.printf("%s가 %s에게 활을 쐈습니다.\n", id, target.id);
	}
	public void upgrade() {
		System.out.printf("아이디 : %s 는 %s로 전직했습니다.\n", id, job);
	}

}

class Sniper extends Archer {
	String name;
	String job = "스나이퍼";

	Sniper sun = new Sniper();

	
	public Sniper() {
		super("아들", 700);
	}

	public void intro() {
		System.out.printf("아이디 : %s 는 레벨이 %d 이다.\n", id, lev);
	}

	public void askill(Newbie target) {
		System.out.printf("%s가 %s에게 총을 난사했습니다.\n", id, target.id);
	}

	public void upgrade() {
		System.out.printf("아이디 : %s 는 %s로 전직했습니다.\n", id, job);
	}

}
