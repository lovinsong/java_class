package myobj.machine;

public interface Electronics extends Charge, Code, Use {

	// ���� ��� �������̽�

	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�

	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����Ҷ�����
	// ���� �Һ񷮸�ŭ�� ������ �Һ��Ѵ�

	// 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�

	// �� ���߿� ������ �� �� �ʿ��� �޼������ �����Ѵ�
	void setConnect(ElectricSource src);
	
	String execute();

	
	
	
	//	Generator getConnectedGenertor();
	
}

//class Computer implements Electronics {
//	void Com(Computer c) {
//		c.computer();
//		c.kpower();
//		c.kpower_code();
//	}
//
//	@Override
//	public void charge() {
//		kpower();
//		kpower_code();
//	}
//
//	@Override
//	public void use() {
//		computer();
//	}
//
//	@Override
//	public void code() {
//		computer();
//	}
//
//}
