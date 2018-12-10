package dd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max = a;
		int sum = b + c;
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("삼각형의 변의 길이는 양수여야만 합니다.");
		} else {

			if (max < b) {
				max = b;
				sum = a + c;
			}
			if (max < c) {
				max = c;
				sum = b + a;
			}

			if (max < sum) {
				System.out.println("삼각형입니다");
			} else {
				System.out.println("삼각형이 아닙니다");
			}
		}

	}
}
