package 과제1;

import java.util.Scanner;

public class Page101Number3 {

	public static void main(String[] args) {
		int c;
		double i;
		int f;

		Scanner input = new Scanner(System.in);

		System.out.print("키를 입력하시오: ");
		c = input.nextInt();

		f = (int) (c / 2.54) / 12;

		i = (c / 2.54) % 12;

		System.out.println(c + "cm는 " + f + "피트 " + i + "인치입니다.");
	}

}
