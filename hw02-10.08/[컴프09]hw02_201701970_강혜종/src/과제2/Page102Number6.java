package 과제2;

import java.util.Scanner;

public class Page102Number6 {
	public static void main(String[] args) {

		int dhqor;
		int qor;
		int dhtlq;
		int tlq;
		int total;

		Scanner input = new Scanner(System.in);

		System.out.print("500원의 개수를 입력하세요:");
		dhqor = input.nextInt();

		System.out.print("100원의 개수를 입력하세요:");
		qor = input.nextInt();

		System.out.print("50원의 개수를 입력하세요:");
		dhtlq = input.nextInt();

		System.out.print("10원의 개수를 입력하세요:");
		tlq = input.nextInt();

		total = 500 * dhqor + 100 * qor + 50 * dhtlq + 10 * tlq;

		System.out.println("저금통에 들어있는 돈의 액수는 " + total + "입니다.");
	}
}
