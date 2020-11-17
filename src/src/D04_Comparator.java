import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.Student.Student;
import myobj.comp.StudentComaparatorA;

public class D04_Comparator {

	public static void main(String[] args) {

		List<String> words = new LinkedList<>();

		words.add("airplane");
		words.add("jets");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");

		Collections.sort(words);
//		System.out.println(words);

		List<Student> group = new LinkedList<>();
		for (int i = 0; i < 4; ++i) {
			group.add(new Student());
		}
//		Collections.sort(group, new StudentComaparatorA());
		Collections.sort(group, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (int) Math.ceil(o1.getAvg() - o2.getAvg());
			}
		});

		System.out.println(group);
		

		
	}

}
