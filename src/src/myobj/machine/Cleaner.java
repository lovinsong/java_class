package myobj.machine;

public class Cleaner implements Electronics{
	
	ElectricSource src;
	int power;
	
	
	public Cleaner() {
		this.power = 30;
	}
	
	@Override
	public void setConnect(ElectricSource src) {
		this.src = src;
	}
	
	@Override
	public String execute() {
		System.out.println("û�ұ⸦ 1ȸ ����߽��ϴ�.");
		src.consum(power);
		
		
		return null;
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

}
