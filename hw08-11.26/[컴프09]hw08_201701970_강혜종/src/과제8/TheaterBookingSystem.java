package ����8;

import java.util.Scanner;

public class TheaterBookingSystem {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int[] tbs = new int[10];
		for(int i=0;i<10;i++){
			tbs[i]=0;
		}	
		
	while(true) {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		int a = scan.nextInt();
		if(a==1){
		
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("------------------------------");
		
		for(int i = 1; i<=10;i++){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		
		for(int i = 0;i<10;i++ ){
			System.out.print(tbs[i]+" ");
		}
		System.out.println();
		System.out.print("����� �¼��� �����Ͻðڽ��ϱ�?");
		int seat = scan.nextInt();
		tbs[seat]=1;
		System.out.println("���� �Ǿ����ϴ�.");
		}
		else 
			break;
		}
	}
}
