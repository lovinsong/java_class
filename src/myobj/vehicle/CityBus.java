package myobj.vehicle;

abstract public class CityBus extends Bus {

	public CityBus() {
		this.model = "�ó�����";
	}

	@Override
	public void pay() {
		System.out.println("2500��");
	}

	@Override
	public void color() {
		System.out.println("����� �Ķ���");
	}

	@Override
	public void sound() {
		System.out.println("�ٶ�");
	}
}
