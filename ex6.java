import java.util.*;

public class ex6{
	static int test(int testval, int target, int begin, int end){
		if ((testval>begin)&&(testval<end))
			System.out.println("testval: " + testval + "is in range of " + begin + "and " + end);
		else System.out.println("testval: " + testval + "is NOT in range of " + begin + "and " + end);
		if (testval>target)
			return +1;
		else if (testval<target)
			return -1;
		else return 0;
	}
	public static void main (String[] args){
		System.out.println(test(10,5,0,10));
		System.out.println(test(5,10,0,10));
		System.out.println(test(5,5,0,10));
	}
}