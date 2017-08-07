package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 : ");

		int num = scan.nextInt();
		int temp = num;
		
		for(int i = 0; i < MONEYS.length; i++) {
			System.out.println(MONEYS[i] + "만원 : " + temp / MONEYS[i] + "개");
			temp = temp % MONEYS[i];
		}
 	}
}