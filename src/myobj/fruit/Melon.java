
package myobj.fruit;

// ※클래스 하나당 파일 하나가 바람직하다
public class Melon {
	int price;
	public String store;
	public String contry;

	public void product() {
		if(price == 0 ) {
			System.out.printf("현재 가격은 %d원입니다.\n ", price);
			System.err.println("더이상 떨어질 가격이없습니다.");
		}
		System.out.println(this.price + "원 입니다.");
	
		}

//		System.out.println(this.store + "에서만 취급합니다.");
//		System.out.println(this.contry + "가 원산지 입니다.");
	public Melon() {
		price = 20000;
		store = "도매상";
		contry = "브라질";
	}

	
	
	
	
	
	
}
