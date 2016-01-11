package opentutorials;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		int i = 1; // 개행를 위한 변수
		int j = 0; // blank를 위한 변수
		int k = 0; // 별찍기 위한 변수

		for (i = 1; i <= 4; i++) // 개행을 해주기위한 for
		{
			for (j = 3; j >= i; j--) // 공백을 위한 for문
				System.out.print(" "); // 공백 출력
			for (k = 1; k <= i * 2 - 1; k++) // 홀수의 별을 위한 for문(i*2-1의 의미는 홀수를 까지
												// for문을 돌려주기 위함.)
				System.out.print("*"); // 별 출력
			System.out.println(); // 개행
		}

		for (i = 1; i <= 3; i++) // 나머지 세줄을 개행 해주기 위한 for 문
		{
			for (j = 1; j <= i; j++) // 공백을 위한 for문
				System.out.print(" "); // 공백 출력
			for (k = 5; k >= i * 2 - 1; k--) // 홀수의 별을 위한 for문
				System.out.print("*"); // 별 출력
			System.out.println(); // 개행

		}
	}
}
