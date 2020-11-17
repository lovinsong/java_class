package myobj.vehicle;

public class Metro {

	int line;
	int fee;
	int passenger;

	void ride() {


		this.line += 4;
		System.out.println(this.line + "호선을 탔습니다.");
		this.fee += 800;
		System.out.println(this.fee + "요금입니다.");
		this.passenger -= 250;
		System.out.println(this.passenger + "만큼 내렸습니다.");

	}
	
	public Metro() {
		line = 5;
		fee = 1300;
		passenger = 500;
	}
	
	
	
	
	
}
