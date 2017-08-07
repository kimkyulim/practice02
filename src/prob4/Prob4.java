package prob4;

import java.lang.reflect.Array;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] ar = new char[str.length()]; 
		for(int i=0; i<str.length(); i++) {
			ar[i] =str.charAt((str.length()-1) - i );
		}

		return ar;
	}

	public static void printCharArray(char[] array){
		
		/* 코드를 완성합니다 */
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
