package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;
		
		while (true) { // 가장 큰 사이클
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber;
			
			int count=1;

			System.out.println(correctNumber);

			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("1-100");

			Scanner scan = new Scanner(System.in);
			System.out.print(count++ + ">>");
			int a = scan.nextInt();

			while (correctNumber != a) {
				if (correctNumber > a ) {
					System.out.println("더높게");
					minNumber = a;
				} else {
					System.out.println("더낮게");
					maxNumber = a;
				}
				
				System.out.println(minNumber+"-"+maxNumber);
				System.out.print(count++ + ">>");
				a = scan.nextInt();
			}

			System.out.println("맞았습니다.");
			System.out.println("다시 시작하시겠습니가?(y/n)");
			String answer = scan.next();

			if (answer.equals("y")) {
				// 종료하도록 작성한다.
				continue;
			} else {
				break;
			}
		}
	}
}