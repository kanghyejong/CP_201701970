package ����3;

import java.util.Scanner;

public class Page133Number1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;

		Scanner input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = input.nextInt();

		if ((a > b) && (a > c)) {
			if (b > c)
				System.out.println("���ĵ� ����: " + c + " " + b + " " + a);// a>b>c
			else if (c > b)
				System.out.println("���ĵ� ����: " + b + " " + c + " " + a);// a>c>b
		}

		else if ((b > a) && (b > c)) {
			if (a > c)
				System.out.println("���ĵ� ����: " + c + " " + a + " " + b);// b>a>c
			else if (c > a)
				System.out.println("���ĵ� ����: " + a + " " + c + " " + b);// b>c>a
		}

		else if ((c > a) && (c > b)) {
			if (a > b)
				System.out.println("���ĵ� ����: " + b + " " + a + " " + c);// c>a>b
			else if (b > a)
				System.out.println("���ĵ� ����: " + a + " " + b + " " + c);// c>b>a
		}
	}
}