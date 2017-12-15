package 과제2;

import java.util.Scanner;

public class Page102Number7 {
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		double vud;
		double meter;
		
		System.out.print("몇 평인지 입력하시오 : ");
		vud=input.nextDouble();
		meter= 3.3058*vud;
		
		System.out.println(vud+"의 평당미터는 "+ meter+"m2입니다.");
	}
}
