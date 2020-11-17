package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class D07_countFruits {

	private enum Fruit {
		APPLE, BANANA, ORANGE, KIWI
	}

	// 다음 리스트를 이용해 각 과일이 몇개 인지를 저장한 Map을 생성해보세요

	static List<Fruit> fruits;

	static {
		fruits = new ArrayList<>();

		for (int i = 0; i < 50; ++i) {
			fruits.add(Fruit.values()[(int) (Math.random() * 4)]);
		}
	}

	public static void main(String[] args) {

		Map<Fruit, Integer> fruit_count_map = new HashMap<>();
		
		for(Fruit fruit : Fruit.values()){
			int freq = Collections.frequency(fruits, fruit);
			fruit_count_map.put(fruit, freq);
//			System.out.printf("%s가 %d개 있습니다. \n", fruit , freq);
		}
		
		System.out.println(fruit_count_map);
		
		
//		System.out.println(fruits);
//
//		int count = 0;
//		Map<String,Integer> map = new HashMap<>();
//		for(int i = 0; i <fruits.size(); ++i) {
//			count++;
//		}
//		System.out.println(map);
		
//		int count_apple = 0;
//		int count_banana = 0;
//		int count_orange = 0;
//		int count_kiwi = 0;
//		
//		
//		for(Fruit fruit : fruits) {
//			if(fruits.equals(Fruit.APPLE)) {
//				++count_apple;
//			}else if(fruits.equals("BANANA")) {
//				count_banana++;
//			}else if(fruits.equals("ORANGE")) {
//				count_orange++;
//			}else if(fruits.equals("KIWI")) {
//				count_kiwi++;
//			}
//		}
//		
//		System.out.println("APPLE : " + count_apple);
//		System.out.println("BANANA : " + count_banana);
//		System.out.println("ORANGE : " + count_orange);
//		System.out.println("KIWI : " + count_kiwi);
//
//		System.out.println("APPLE의 등장 횟수  : " + Collections.frequency(fruits, "APPLE"));
//		System.out.println("BANANA의 등장 횟수 : " + Collections.frequency(fruits, "BANANA"));
//		System.out.println("ORANGE의 등장 횟수 : " + Collections.frequency(fruits, "ORANGE"));
//		System.out.println("KIWI의 등장 횟수   : " + Collections.frequency(fruits, "KIWI"));

	}

}
