package ����1;

import java.util.Scanner;

public class Page101Number4 {
	public static void main(String[] args) {
		int r;
		int h;
		double V;

		Scanner input = new Scanner(System.in);

		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = input.nextInt();

		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextInt();

		V = r * r * 3.141592 * h;

		System.out.println("������� ���Ǵ� " + V + "�Դϴ�.");
	}
}
