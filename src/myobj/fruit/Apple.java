package myobj.fruit;

public class Apple {
	int calorie;
	String color;
	
	
	public Apple(String color) {
		calorie = 300;
		
		if(!color.equals("red")) {
			throw new InvalidColorException();
		}
	}

	public Apple eat() {
		try {
			if (calorie <= 0) {
				throw new NoMoreCalorieException();

 			}
		} catch (NoMoreCalorieException e) {
			System.out.println(e.getMessage());
			return this;
		}
		System.out.println("¸ÀÀÖ°Ô Àß ¸Ô¾ú½À´Ï´Ù.");
		calorie -= 100;
		return this;
	}

	public static void main(String[] args) {
		new Apple("red").eat().eat().eat().eat().eat();

//		"abcd".toUpperCase().toLowerCase().toUpperCase();
	}

}
