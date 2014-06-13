class Bee {
	int count = 1;
	Bee(){
		System.out.println("Here is Bee! No args!");
	}
	
	Bee(int i){
		this();
		count = i;
		System.out.println("Here are " + count + "Bee! With args!");
		
	}
}

public class Ex9{
	public static void main(String[] args){
		Bee b = new Bee(1);
	}
}