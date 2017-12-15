package 과제1;

import java.util.Scanner;

public class Page101Number4 {
	public static void main(String[] args) {
		int r;
		int h;
		double V;

		Scanner input = new Scanner(System.in);

		System.out.print("원기둥 밑면의 반지름은 입력하시오: ");
		r = input.nextInt();

		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextInt();

		V = r * r * 3.141592 * h;

		System.out.println("원기둥의 부피는 " + V + "입니다.");
	}
}
