import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerrr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		
		System.out.println(n.isProbablePrime(100)?"prime":"not Prime");
		
		
		
	}

}
