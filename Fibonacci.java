import java.util.*;

public class Fibonacci(int i){
	public static void main(String[] args){
		int num1 = 1;
		int num2 = 0;
		for (int j = 1; j <= i; j++){	
			System.out.print(num1 + " ");
			num1 = num1 + num2;
			num2 = num1;
		}	
	}
}