import java.math.BigInteger;     //For inheriting BigInteger classes
import java.util.Scanner;

public class BigIntegerrr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		BigInteger n = sc.nextBigInteger();   //For taking bigInter as input by the system 
		
		System.out.println(n.isProbablePrime(100)?"prime":"not Prime");  //checking prime numbers with in built bigInterger method that is isProbable prime
		
		
		
	}

}
