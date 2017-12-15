package 과제1;

import java.util.Scanner;

public class Page73Number1 {
	public static void main(String[] args) {
		double x;
		double y;
		
		Scanner input = new Scanner(System.in);

		System.out.print("마일을 입력하시오: ");
		x = input.nextDouble();
		
		y = 1.609 * x;
		
		System.out.println((int) x + "마일은 " + y + "킬로미터 입니다.");

	}
}
