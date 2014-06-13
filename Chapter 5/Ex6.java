import java.util.*;

class Dog{
	Dog(int i, double j) {
		System.out.println("This is a dog." + " int: " + i + " double: " + j);
	}
	
	Dog(double j, int i) {
		System.out.println("This is NOT a dog."  + " double: " + j + " int: " + i );
	}
}

public class Ex6{
	public static void main(String[] args){
		Dog d = new Dog(5, 5.0);
		Dog b = new Dog(1.0, 1);
	}
}