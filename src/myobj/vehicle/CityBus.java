package myobj.vehicle;

abstract public class CityBus extends Bus {

	public CityBus() {
		this.model = "½Ã³»¹ö½º";
	}

	@Override
	public void pay() {
		System.out.println("2500¿ø");
	}

	@Override
	public void color() {
		System.out.println("³ì»ö°ú ÆÄ¶õ»ö");
	}

	@Override
	public void sound() {
		System.out.println("¶Ù¶Ù");
	}
}
