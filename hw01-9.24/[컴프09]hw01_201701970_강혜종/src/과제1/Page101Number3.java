package ����1;

import java.util.Scanner;

public class Page101Number3 {

	public static void main(String[] args) {
		int c;
		double i;
		int f;

		Scanner input = new Scanner(System.in);

		System.out.print("Ű�� �Է��Ͻÿ�: ");
		c = input.nextInt();

		f = (int) (c / 2.54) / 12;

		i = (c / 2.54) % 12;

		System.out.println(c + "cm�� " + f + "��Ʈ " + i + "��ġ�Դϴ�.");
	}

}
