package 과제6;

import java.util.Scanner;

class Login{

	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	
	private String a, c;
	private int b, d;

	public void creat() {

		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오:");
		a = input.nextLine();
		System.out.print("비밀번호를 입력하시오:");
		b = input.nextInt();
	}

	public void check() {

		System.out.println("<로그인>");
		System.out.print("아이디를 입력하시오:");
		c = input2.nextLine();
		System.out.print("비밀번호를 입력하시오:");
		d = input2.nextInt();

		if ((a.equals(c)) && (b == d))
			System.out.println("로그인에 성공하였습니다.");
		else if (a.equals(c)&&(b!=d)) {
			System.out.println("로그인에 실패하였습니다.");
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (b == d) {
			System.out.println("로그인에 실패하였습니다.");
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("로그인에 실패하였습니다.");
			System.out.println("아디디와 비밀번호가 틀립니다.");
		}

	}
}
public class 계정 {
	public static void main(String[] args) {
		Login login = new Login();
		login.creat();
		login.check();

	}
}
