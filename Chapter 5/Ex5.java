class Dog{
	Dog(int i) {
		System.out.println("This is a dog." + i);
	}
	
	void bark(int i){
		System.out.println("Dog is barking");
	}
	
	void bark(double d){
		System.out.println("Dog is howling");
	}
}

public class Ex5{
	public static void main(String[] args){
		Dog d = new Dog(5);
		d.bark(1);
		d.bark(1.0);
	}
}