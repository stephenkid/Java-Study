import java.util.*;

class Rock {
	String s1 = "Rock 1!" ;
	String s2;
	
	Rock() {
		s2 = "Rock 2!";
	}
}

public class Ex2{
	public static void main(String[] args){
		Rock r = new Rock();
		System.out.println(r.s1);
		System.out.println(r.s2);
	}
}