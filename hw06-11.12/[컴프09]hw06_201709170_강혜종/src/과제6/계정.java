package ����6;

import java.util.Scanner;

class Login{

	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	
	private String a, c;
	private int b, d;

	public void creat() {

		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�:");
		a = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		b = input.nextInt();
	}

	public void check() {

		System.out.println("<�α���>");
		System.out.print("���̵� �Է��Ͻÿ�:");
		c = input2.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		d = input2.nextInt();

		if ((a.equals(c)) && (b == d))
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		else if (a.equals(c)&&(b!=d)) {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (b == d) {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			System.out.println("�Ƶ��� ��й�ȣ�� Ʋ���ϴ�.");
		}

	}
}
public class ���� {
	public static void main(String[] args) {
		Login login = new Login();
		login.creat();
		login.check();

	}
}
