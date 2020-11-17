import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {

	// # TreeSet
	// - �ߺ����� ������ �� ����
	// - �����͸� ������ �� ������������ �����Ѵ�
	// - ��ҷ� null�� ������� �ʴ´�
	// - ���� �ӵ��� ���� ��� ������ ����/�˻� �ӵ��� ������

	// �� �ߺ����� + ���ϴ� �κ����� ���� + ũ�� ����

	public static void main(String[] args) {

		TreeSet<Mango> sweet_mango_tree = new TreeSet<>(new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				// Set�� ���� �����͸� ������� �ʱ� ������,
				// ���� �絵�� ���� ���� ��� ������� �ȴ�
				// return o1.sweet - o2.sweet;

				// ���� �絵�� ���������� ����id�������� �ٽ� �����ϱ�
				int sweet_value = o1.sweet - o2.sweet;

				// id ��� hashCode()�� ����ص� �ȴ� (�ش� ��ü�� �����ϰ� �����ϴ� ��)
				return sweet_value == 0 ? o1.hashCode() - o2.hashCode() : sweet_value;

			}
		});

		for (int i = 0; i < 500; ++i) {
			sweet_mango_tree.add(new Mango());
		}
		System.out.println(sweet_mango_tree);
		System.out.println("TreeSet�� ����� ���� : " + sweet_mango_tree.size());

		// Comparable���� return 0�� ���� ��ü���� �ǹ��Ѵ�
		Set<Mango> basic_comp_tree = new TreeSet<>();

		for (int i = 0; i < 3000; ++i) {
			basic_comp_tree.add(new Mango());
		}
		System.out.println("Basic tree�� ����� ���� : " + basic_comp_tree.size());

		// #TreeSet Ȱ��

		// descendingSet() : ������������ ���ĵ� Set�� ��ȯ
		System.out.println(sweet_mango_tree.descendingSet());

		// # TreeSet�� ���ϴ� �������� ������ ����ϱ�

		// #HeadSet(to Element) : �� �պ��� ���ϴ� ��ġ������ Set�� ��ȯ
		Set<Mango> hset = sweet_mango_tree.headSet(new Mango(0, 4, 500));
		System.out.println("HeadSet : " + hset);
		System.out.println("hSet�� ����: " + hset.size());

		// tailSet(from Element) : ���ϴ� ���غ��� �� ������������ Set�� ��ȯ
		SortedSet<Mango> tSet = sweet_mango_tree.tailSet(new Mango(0, 4, 500));
		System.out.println("tSet�� ����: " + tSet.size());

		System.out.println("�Ʒ��� tSet�� �ٽ� ������");
		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0, 8, 1000));
		System.out.println("h_tSet�� ����: " + h_tSet.size());

		SortedSet<Mango> t_tSet = tSet.tailSet(new Mango(0, 8, 1000));
		System.out.println("t_tSet�� ����: " + t_tSet.size());

		// SubSet(from, to)
		SortedSet<Mango> result = sweet_mango_tree.subSet(new Mango(0, 7, 1000), new Mango(0, 9, 1000));
		System.out.println(result);

		// # TreeSet��Ҹ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<>();

		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(11);
		int_tree.add(40);
		int_tree.add(3);

		// floor, ceiling
		// - �ش� �� �������� ���� ����� ����/���� ���� �ϳ� ��ȯ
		// - ���� ���� �ִٸ� �ش� ���� �٤Ӥ�ȯ�Ѵ�

		// lower, higher
		// - �ش� �� �������� ���� ����� ����/���� ���� �ϳ� ��ȯ
		// - ������ ���� ���� ���� �����Ѵ�

		System.out.println("ceileing : " + int_tree.ceiling(11));
		System.out.println("floor : " + int_tree.floor(11));
		System.out.println();
		System.out.println("higher : " + int_tree.higher(11));
		System.out.println("lower : " + int_tree.lower(11));
	}

}
