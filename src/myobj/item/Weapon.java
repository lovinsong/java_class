package myobj.item;

abstract public class Weapon {
	int attack;
	
	// �⺻ ������ ���
	public Weapon(int attack) {
		this.attack = attack;
	}
	
	public int damage() {
		return attack;
	}
}
