package myobj.vehicle;

abstract public class TownBus extends Bus {

	public TownBus() {
		this.model = "����";
	}

	@Override
	public void pay() {
		System.out.println("900��");
	}

	@Override
	public void color() {
		System.out.println("�����");
	}

	@Override
	public void sound() {
		System.out.println("����");
	}
}
