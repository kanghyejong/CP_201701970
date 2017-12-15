package 과제3;

import java.util.Scanner;

public class Page133Number3 {
	public static void main(String[] args) {
		int 키;
		double 표준체중;
		double 체중;

		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		키 = input.nextInt();
		표준체중 = (키 - 100) * 0.9;

		System.out.print("체중을 입력하시오 : ");
		체중 = input.nextDouble();
		if (체중 >= 표준체중 * 1.1)
			System.out.println("과체중입니다.");

		else if (체중 <= 표준체중 * 0.9)
			System.out.println("저체중입니다.");

		else
			System.out.println("표준체중은 " + 표준체중 + "kg으로 표준입니다.");
	}
}
