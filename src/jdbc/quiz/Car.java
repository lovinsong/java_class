package jdbc.quiz;

public class Car {

	private String plateNumber; 
	private String usage;
	private String ctype;		
	
	//	�߰� �ѱ� �з�	
	// 	 - �ڰ��� : �����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����� (PRIVATE)
	// 	 - �Ϲݿ�(�ýÿ� ���� ��������) : �ƹٻ��� (BUSINESS)
	// 	 - �뿩�����(����ī) : ����ȣ (RENTAL) 
	final static String alls = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����־ƹٻ�������ȣ";
	final static String normals = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ�����";
	final static String taxis = "�ƹٻ���";
	final static String rents = "����ȣ";
	
	// ���� �ڵ��� ������ ������ִ� �޼��� 
	public static Car ran() {	
		return new Car(
				String.format("%02d%c %04d",
					(int)(Math.random() * 99),
					alls.charAt((int)(Math.random() * alls.length())),
					(int)(Math.random() * 9900) + 100
				)
		);
	}
	
	// 	������ ���� 0100~9999 ����	
	private Car(String plateNumber) {
		this.plateNumber = plateNumber;
		init();		
	}	
	
	// plateNumber ���� : 01�� 1234
	private void init() {
		int num1 = Integer.parseInt(plateNumber.substring(0, 2));	
		String mid = plateNumber.substring(2, 3);
		int num2 = Integer.parseInt(plateNumber.substring(4));
		
		//  ���� ��ȣ�� 
		//		01 ~ 69 : �¿��� / 
		//  	70 ~ 79 : ������ /
		// 		80 ~ 97 : ȭ���� / 
		//		98 ~ 99 : Ư����(����,�ý�,�ù� ���)
		if (num1 < 1 || num1 > 99) {
			ctype = "�ҹ���";
		} else if (num1 < 70) {
			ctype = "�¿���";
		} else if (num1 < 80) {
			ctype = "������";
		} else if (num1 < 98) {
			ctype = "ȭ����";
		} else {
			ctype = "Ư����";
		}
		
		if (normals.contains(mid)) {
			usage = "�ڰ���";
		} else if (taxis.contains(mid)) {
			usage = "�Ϲݿ�����";
		} else if (rents.contains(mid)) {
			usage = "�������";
		} else {
			usage = "�ҹ���";
		}
	}
	
	public static void main(String[] args) {
		Car car1 = Car.ran();
		
		System.out.println(car1.plateNumber);
		System.out.println(car1.usage);
		System.out.println(car1.ctype);		
	}
	
	public String getCtype() {
		return ctype;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public String getUsage() {
		return usage;
	}
}