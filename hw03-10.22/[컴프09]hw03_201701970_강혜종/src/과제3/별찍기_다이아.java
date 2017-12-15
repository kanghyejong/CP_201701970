package 과제3;

public class 별찍기_다이아 {
	public static void main(String [] args){
		for (int a = 1; a <= 5; a++) {
			for (int b = 4; b >= a; b--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 2 * a - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		{
		for (int i = 1; i <= 5; i++) {
			for (int d = 1; d <= i; d++) {
				System.out.print(" ");
			}
			for (int o = 7; o >= 2 * i - 1; o--) {
				System.out.print("*");
			}
				System.out.println();

			
		}
	}
}
}
