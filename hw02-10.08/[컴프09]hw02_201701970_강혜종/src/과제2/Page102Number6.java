package ����2;

import java.util.Scanner;

public class Page102Number6 {
	public static void main(String[] args) {

		int dhqor;
		int qor;
		int dhtlq;
		int tlq;
		int total;

		Scanner input = new Scanner(System.in);

		System.out.print("500���� ������ �Է��ϼ���:");
		dhqor = input.nextInt();

		System.out.print("100���� ������ �Է��ϼ���:");
		qor = input.nextInt();

		System.out.print("50���� ������ �Է��ϼ���:");
		dhtlq = input.nextInt();

		System.out.print("10���� ������ �Է��ϼ���:");
		tlq = input.nextInt();

		total = 500 * dhqor + 100 * qor + 50 * dhtlq + 10 * tlq;

		System.out.println("�����뿡 ����ִ� ���� �׼��� " + total + "�Դϴ�.");
	}
}
