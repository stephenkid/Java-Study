import java.util.*;

class Dog{
	Dog(int i) {
		System.out.println("This is a dog." + i);
	}
}

public class Ex4{
	public static void main(String[] args){
		Dog d = new Dog(5);
	}
}