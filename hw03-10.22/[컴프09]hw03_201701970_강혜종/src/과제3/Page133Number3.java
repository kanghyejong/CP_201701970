package ����3;

import java.util.Scanner;

public class Page133Number3 {
	public static void main(String[] args) {
		int Ű;
		double ǥ��ü��;
		double ü��;

		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		Ű = input.nextInt();
		ǥ��ü�� = (Ű - 100) * 0.9;

		System.out.print("ü���� �Է��Ͻÿ� : ");
		ü�� = input.nextDouble();
		if (ü�� >= ǥ��ü�� * 1.1)
			System.out.println("��ü���Դϴ�.");

		else if (ü�� <= ǥ��ü�� * 0.9)
			System.out.println("��ü���Դϴ�.");

		else
			System.out.println("ǥ��ü���� " + ǥ��ü�� + "kg���� ǥ���Դϴ�.");
	}
}
