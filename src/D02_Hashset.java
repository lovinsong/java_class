import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Hashset {

	// #
	// - 집합을 구현해놓은 클래스
	// - 요소로 같은 값이 들어오는 것을 허용하지 않는다

	// # Hash
	// - 어떤 값을 넣었을때 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	// - 예측할 수 없는 값을 이용하므로 정렬이 불가능하다
	// - 생성된 값으로 원래 값을 찾는 것이 불가능에 가깝다
	// - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
	// - 속도가 빠르고 보안성도 뛰어난 알고리즘

	// abcd1234!@#$ -> 676453421
	// abcd1234!@$ -> 342461651

	// a -> 53423231
	// b -> 15616516
	// c -> 65198452

	public static void main(String[] args) {

		HashSet<Integer> even = new HashSet<>();

		// Set에는 똑같은 데이터를 저장할 수 없다
		even.add(2);
		even.add(2);
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		even.add(14);
		even.add(16);
		even.add(18);

		// Hash를 이용하는 클래스는 순서
		System.out.println(even);

		// Hashset은 index가 없기 때문에 하나만 꺼낼 수가 없다
		for (int i : even) {
			System.out.println("하나씩 꺼내서 사용 : " + i);
		}

		ArrayList<String> animal_list = new ArrayList<>();

		animal_list.add("zibra");
		animal_list.add("zibra");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("tiger");
		animal_list.add("eagle");
		animal_list.add("eagle");

		Collections.shuffle(animal_list);
		System.out.println(animal_list);

		// #다른 종류의 컬렉션을 Set으로 손쉽게 변경할 수 있다
		// 중복이 제거되는 효과가 있다
		Set<String> animal_set = new HashSet<>(animal_list);
		System.out.println("중복제거 : " + animal_set);

		System.out.println("ealge".hashCode());
		System.out.println("zibra".hashCode());

		// # 컬렉션을 배열로 변환하기 1
		// - Object[]로 반환하는 방식
		Object[] animal_arr = animal_list.toArray();

		// String으로 받을 때 다운 캐스팅이 필요함
		String first_animal = (String) animal_arr[0];
		System.out.println(first_animal);

		// # 컬렉션을 배열로 변환하기 2
		// - 미리 만들어둔 해당 제네릭 배열을 전달하는 방식
		String[] animal_arr2 = new String[animal_set.size()];
		animal_set.toArray(animal_arr2);

		first_animal = animal_arr2[0];
		System.out.println(first_animal);

		// contains : 컬렉션에 해당 요소가 있는지 여부를 반환
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));

		// size : 컬렉션 크기 반환
		System.out.println(animal_set.size());

		// remove : 컬렉션 요소 삭제 (삭제 성공시 true 반환)
		// 인터페이스로 만들어져있어서 remove에 대해 다름
		System.out.println(animal_set.remove("lion"));

		// # 다른 컬렉션을 이용하는 메서드들
		Set<Character> alphabets01 = new HashSet<>();
		Set<Character> alphabets02 = new HashSet<>();

		Collections.addAll(alphabets01, 'A', 'B', 'C', 'D', 'E');
		Collections.addAll(alphabets02, 'D', 'E', 'F', 'G', 'H');

		System.out.println(alphabets01);
		System.out.println(alphabets02);

		// 1. addAll(collection) : 다른 컬렉션의 모든 값을 추가한다
		List<Character> alpha_all = new ArrayList<>();
		
		alpha_all.addAll(alphabets01);
		alpha_all.addAll(alphabets02);
		
		System.out.println(alpha_all);
		
		// 2. removeAll(collection) : 다른 컬렉션과 일치하는 모든 값을 제거한다
		Set<Character> to_remove = new HashSet<>();
		
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);
		System.out.println(alpha_all);
		
		// 3. retainAll(collection) : 전달한 다른 컬렉션과 일치하는 값만 유지한다
		List<Character> to_retain = new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		// 4. containsAll(collection) 
		// - 전달한 컬렉션의 모든 요소가 포함되어 있는지 확인한다
		Collections.addAll(alpha_all, 'A', 'B', 'C', 'D');
		
		Set<Character> must_contain = new HashSet<>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
//		must_contain.add('Z');
		
		System.out.println(alpha_all + "에 " +
		must_contain + "이 모두 포함되어 있나요?" +
		alpha_all.containsAll(must_contain));
		
		
		
		
		
		
	}

}
