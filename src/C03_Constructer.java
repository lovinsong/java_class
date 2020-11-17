import java.util.Scanner;

public class C03_Constructer {

	// #Ŭ������ ������ (Constructor)
	
	//	-  Ŭ������ �̸��� �Ȱ��� �̸��� �Լ�(new�� �Բ� ����Ѵ�)
	//	Scanner sc = new Scanner();
	//	String str = new String("yes");
	
	//	- new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����Ѵ�
	//	- �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�
	//	- �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ����
	//		�⺻ �����ڰ� �ڵ����� �����ȴ�
	
	//	�� �⺻ ������ - �Ű������� ���� ������ 
	public static void main(String[] args) {
		Orange o1 = new Orange();
		Orange o2 = new Orange(5, 5, "green");
		
		System.out.println(o1.color);
		System.out.println(o1.size);
		System.out.println(o1.sweet);
		
		System.out.println(o2.color);
		
		Strawberry s1 = new Strawberry();
		
		Grape g1 = new Grape(4);
		Grape g2 = new Grape(25);
		
		for( int i =0; i < 5; ++i) {
			g1.eat();
		}
		
		// �Ʊ� ������ Ŭ������ �����ڸ� 2���� �߰��غ�����
		// * myobj.fruit, myobj.vehicle
	}
}

//���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�
class Grape{
	int podo;
	int skin;
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�
	public Grape() {
		this(8); 
		
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� �����ؾ� �Ѵ�
	}	
	public void eat() {
		if(podo == 0) {
			System.err.println("�� ������ �� �Ծ����ϴ�.");
			System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n", podo, skin);
			return;
		}
		podo --;
		skin ++;
		System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n", podo, skin);
	}
	
}

// �����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�
class Strawberry{
	int seed;
	String color;
}

class Orange{
	
	int sweet;
	int size;
	String color;
	
	// # �������� Ư¡
	//	- ���� Ÿ���� ���� Ŭ������� ���� �̸��� ������
	//	- �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�
	//	- �ַ� �ν��Ͻ� ������ ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�
		sweet = 10;
		size = 5;
		color = "orange";
	}
	
	// # �����ڵ� �Լ�ó�� �����ε��� �����ϴ�
	//	- �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ������ �ִ�
	public Orange(int sweet, int size, String color) {
		// # this
		//	- Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
		// �ʵ� ���� ������������ ��ġ�� ���
		// this�� �̿��� ����� ���������� ��Ȯ�ϰ� �Ҽ� �ִ�
		
		// �� this�� ���� ���� �ν��Ͻ� ������ �ȴ�.
		this.sweet = sweet;
		this.size = size;
		this.color = color;
		
	}
}