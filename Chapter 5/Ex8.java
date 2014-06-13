class Apple{
	void pickApple() {
		eatApple();
		this.eatApple();
	}
	
	void eatApple() {
		System.out.println("This is an apple. Yummy!");
	}
}

public class Ex8{
	public static void main(String[] args){
		Apple a = new Apple();
		a.pickApple();
	}
}