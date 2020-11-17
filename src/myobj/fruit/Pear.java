package myobj.fruit;

public class Pear {

	void PrintThis() {
		System.out.println(this);
	}
	
	Pear retrunPear() {
		return this;
	}
	
	public static void main(String[] args) {
		new Pear().PrintThis();
		
		Pear pear01 = new Pear();
		System.out.println(pear01);
		pear01.PrintThis();
		System.out.println(pear01.retrunPear());
	}
}
