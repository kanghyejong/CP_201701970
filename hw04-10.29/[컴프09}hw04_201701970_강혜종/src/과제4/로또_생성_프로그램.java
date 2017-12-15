package 과제4;

import java.util.Random;

public class 로또_생성_프로그램 {
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		num1 = rand.nextInt(44) + 1;
		num2 = rand.nextInt(44) + 1;
		num3 = rand.nextInt(44) + 1;
		num4 = rand.nextInt(44) + 1;
		num5 = rand.nextInt(44) + 1;
		num6 = rand.nextInt(44) + 1;
		
		while (true) {
			if (num1 == num2) {
				num2 = rand.nextInt(44) + 1;
				continue;
			}
			break;
		}

		while (true) {
			if (num1 == num3) {
				num3 = rand.nextInt(44) + 1;
				continue;
			} else if (num2 == num3) {
				num3 = rand.nextInt(44) + 1;
				continue;
			}
			break;
		}

		while (true) {
			if (num1 == num4) {
				num4 = rand.nextInt(44) + 1;
				continue;
			} else if (num2 == num4) {
				num4 = rand.nextInt(44) + 1;
				continue;
			} else if (num3 == num4) {
				num4 = rand.nextInt(44) + 1;
				continue;
			}
			break;
		}

		while (true) {
			if (num1 == num5) {
				num5 = rand.nextInt(44) + 1;
				continue;
			} else if (num2 == num5) {
				num5 = rand.nextInt(44) + 1;
				continue;
			} else if (num3 == num5) {
				num5 = rand.nextInt(44) + 1;
				continue;
			} else if (num4 == num5) {
				num5 = rand.nextInt(44) + 1;
				continue;
			}
			break;
		}

		while (true) {
			if (num1 == num6) {
				num6 = rand.nextInt(44) + 1;
				continue;
			} else if (num2 == num6) {
				num6 = rand.nextInt(44) + 1;
				continue;
			} else if (num3 == num6) {
				num6 = rand.nextInt(44) + 1;
				continue;
			} else if (num4 == num6) {
				num6 = rand.nextInt(44) + 1;
				continue;
			} else if (num5 == num6) {
				num6 = rand.nextInt(44) + 1;
				continue;
			}
			break;
		}

		System.out.println("<로또 생성 프로그램>");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
	}
}
