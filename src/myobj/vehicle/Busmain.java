package myobj.vehicle;

public class Busmain {

	public static void main(String[] args) {
		CityBus bus1 = new CityBus() {
		};
		TownBus bus2 = new TownBus() {
		};
		//�� ĳ���� �ؼ� �� �� ���� �̻ڰ�
		System.out.println(bus1.model);
		bus1.pay();
		bus1.color();
		bus1.sound();

		bus2.pay();
		bus2.color();
		bus2.sound();
	}

}
