
package myobj.fruit;

// ��Ŭ���� �ϳ��� ���� �ϳ��� �ٶ����ϴ�
public class Melon {
	int price;
	public String store;
	public String contry;

	public void product() {
		if(price == 0 ) {
			System.out.printf("���� ������ %d���Դϴ�.\n ", price);
			System.err.println("���̻� ������ �����̾����ϴ�.");
		}
		System.out.println(this.price + "�� �Դϴ�.");
	
		}

//		System.out.println(this.store + "������ ����մϴ�.");
//		System.out.println(this.contry + "�� ������ �Դϴ�.");
	public Melon() {
		price = 20000;
		store = "���Ż�";
		contry = "�����";
	}

	
	
	
	
	
	
}
