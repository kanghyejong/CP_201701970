package 과제1;

import java.util.Scanner;

public class Page73Number4 {
	public static void main(String[] args) {
		double C;
		double F;

		Scanner input = new Scanner(System.in);

		System.out.print("화씨온도를 입력하시오: ");
		F = input.nextDouble();
		
		C = (5 * (F - 32)) / 9;

		System.out.println("화씨온도 " + F + "의 섭씨온도는 " + C + "도 입니다.");

	}
}
