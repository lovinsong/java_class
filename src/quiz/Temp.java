package quiz;

import java.util.HashMap;

public class Temp {
	
	String out_group;
	
	// 1. 새로운 그룹을 추가하는 메서드
	// 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
	
	// 3. 등록된 모든 전화번호를 보기 좋게 출력하는 메서드
	
	// 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	
	public void addOutGroup(String out_group) {
		
		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
		phone_book.put(out_group, new HashMap<>());
		
	}
	
	public void addInGroup(String in_group) {
		
		
	}
	
	public void print() {
		



		
	}
	
	public void seach() {
		
	}
	
}
