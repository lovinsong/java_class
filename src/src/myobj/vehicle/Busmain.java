package myobj.vehicle;

public class Busmain {

	public static void main(String[] args) {
		CityBus bus1 = new CityBus() {
		};
		TownBus bus2 = new TownBus() {
		};
		//업 캐스팅 해서 좀 더 보기 이쁘게
		System.out.println(bus1.model);
		bus1.pay();
		bus1.color();
		bus1.sound();

		bus2.pay();
		bus2.color();
		bus2.sound();
	}

}
