package ����1;

import java.util.Scanner;

public class Page73Number4 {
	public static void main(String[] args) {
		double C;
		double F;

		Scanner input = new Scanner(System.in);

		System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
		F = input.nextDouble();
		
		C = (5 * (F - 32)) / 9;

		System.out.println("ȭ���µ� " + F + "�� �����µ��� " + C + "�� �Դϴ�.");

	}
}
