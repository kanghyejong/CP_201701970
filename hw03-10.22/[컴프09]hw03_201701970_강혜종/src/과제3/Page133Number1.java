package 과제3;

import java.util.Scanner;

public class Page133Number1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		a = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = input.nextInt();

		if ((a > b) && (a > c)) {
			if (b > c)
				System.out.println("정렬된 숫자: " + c + " " + b + " " + a);// a>b>c
			else if (c > b)
				System.out.println("정렬된 숫자: " + b + " " + c + " " + a);// a>c>b
		}

		else if ((b > a) && (b > c)) {
			if (a > c)
				System.out.println("정렬된 숫자: " + c + " " + a + " " + b);// b>a>c
			else if (c > a)
				System.out.println("정렬된 숫자: " + a + " " + c + " " + b);// b>c>a
		}

		else if ((c > a) && (c > b)) {
			if (a > b)
				System.out.println("정렬된 숫자: " + b + " " + a + " " + c);// c>a>b
			else if (b > a)
				System.out.println("정렬된 숫자: " + a + " " + b + " " + c);// c>b>a
		}
	}
}