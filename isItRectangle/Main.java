package dd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max = a;
		int sum = b + c;
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("�ﰢ���� ���� ���̴� ������߸� �մϴ�.");
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
				System.out.println("�ﰢ���Դϴ�");
			} else {
				System.out.println("�ﰢ���� �ƴմϴ�");
			}
		}

	}
}
