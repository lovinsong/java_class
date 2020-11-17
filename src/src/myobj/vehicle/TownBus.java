package myobj.vehicle;

abstract public class TownBus extends Bus {

	public TownBus() {
		this.model = "¸¶À»";
	}

	@Override
	public void pay() {
		System.out.println("900¿ø");
	}

	@Override
	public void color() {
		System.out.println("³ë¶õ»ö");
	}

	@Override
	public void sound() {
		System.out.println("»§»§");
	}
}
