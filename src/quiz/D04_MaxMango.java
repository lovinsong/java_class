package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.fruit.Mango;
import myobj.fruit.MangoComparator;

public class D04_MaxMango {

	// # Į�θ��� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	// 100���� ������ ���� Į�θ��� ���� ���� �����غ�����

	// �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ� ��
	public static void main(String[] args) {

		List<Mango> group = new ArrayList<>();
		for (int i = 0; i < 100; ++i) {
			group.add(new Mango());
		}
		
		Mango most_delicious = Collections.max(group);
		
		System.out.println("���� ���ִ� ������ Į�θ� : " + most_delicious.calorie);
		System.out.println("���� ���ִ� ������ �絵 : " + most_delicious.sweet);
		
		Collections.sort(group, new MangoComparator());

		System.out.println(group);
	}

}
