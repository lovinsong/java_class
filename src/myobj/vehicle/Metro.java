package myobj.vehicle;

public class Metro {

	int line;
	int fee;
	int passenger;

	void ride() {


		this.line += 4;
		System.out.println(this.line + "ȣ���� �����ϴ�.");
		this.fee += 800;
		System.out.println(this.fee + "����Դϴ�.");
		this.passenger -= 250;
		System.out.println(this.passenger + "��ŭ ���Ƚ��ϴ�.");

	}
	
	public Metro() {
		line = 5;
		fee = 1300;
		passenger = 500;
	}
	
	
	
	
	
}
