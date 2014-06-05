import java.util.*;

public class ex9{
	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int num1 = 0;
		int num2 = 1;
		int tmp = 0;
		for (int j = 1; j <= i; j++){	
			System.out.print(num2 + " ");
					
			tmp = num2;
			num2 = num1 + num2;
			num1 = tmp;
			
		}	
	}
}