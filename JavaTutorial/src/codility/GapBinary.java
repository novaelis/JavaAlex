package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GapBinary {

	public long solution(long N) {

		return fromIntToBinary(N);

		// write your code in Java SE 8
	}

	public long fromIntToBinary(long N) {

		String binaryNumber = Long.toBinaryString(N); // parsing form int to String of binary
		long LongBinaryNumber = Long.parseLong(binaryNumber); // parsing from String to int

		return LongBinaryNumber;
	}

	public boolean isValidNumber(long N) {

		if (N % 2 != 0 && howMuchDigitHasIt(N) > 2) {
			return true;
		}
		return false;
	}

	public static int howMuchDigitHasIt(long N) {

		return String.valueOf(N).length();

	}

	public ArrayList<Long> fromIntToArray(long N) {
		
		ArrayList<Long> listOfDigits = new ArrayList<Long>();
		
		do {
			listOfDigits.add(N%10);
			N /= 10;
		}while(N!=0);
		
		Collections.reverse(listOfDigits);
		
		return listOfDigits;	
	}
	
	public int logestSequenceOf0(ArrayList<Long> numbers) {
		
		
		
	}
	



	public static void main(String[] args) {

		GapBinary gb = new GapBinary();

		Scanner in = new Scanner(System.in);
		long number = Long.parseLong(in.nextLine());

		System.out.println("number is: " + number + " and binary is: " + gb.solution(number));
		System.out.println("number of digits is: " + gb.howMuchDigitHasIt(gb.solution(number)));
		System.out.println("number is valid: " + gb.isValidNumber(gb.solution(number)));
		System.out.println("ArrayList of number is: " + gb.fromIntToArray(gb.solution(number)));
	}

}
