package ����6;

import java.util.Scanner;

public class ���ڿ����� {

	public static String reverse(String s) {
		String c="";
		for (int a = s.length()-1; a>=0; a--){
			char b=s.charAt(a);
			c+=b;
			
		}
			return c;
	}



	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String str;

		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		str = Input.nextLine();

		System.out.println(reverse(str));
	}
}
