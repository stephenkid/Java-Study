import java.util.*;

public class ex7{
	public static void testSwitch(int i) {
		switch(i){
			case 1 : System.out.println("Case "+i); //break;
			case 2 : System.out.println("Case "+i); //break;
			case 3 : System.out.println("Case "+i); //break;
			case 4 : System.out.println("Case "+i); //break;
			case 5 : System.out.println("Case "+i); //break;
		}
	}
	public static void main(String[] args){
		for (int j = 1; j<=5; j++)
			testSwitch(j);
	}
	
}