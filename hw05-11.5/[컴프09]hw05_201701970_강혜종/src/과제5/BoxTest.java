package 과제5;

public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box();
		box.set가로(10);
		box.set세로(20);
		box.set높이(50);

		System.out.println("박스의 가로는 " + box.get가로());
		System.out.println("박스의 세로는 " + box.get세로());
		System.out.println("박스의 높이는 " + box.get높이());
		box.print();
	}
}
