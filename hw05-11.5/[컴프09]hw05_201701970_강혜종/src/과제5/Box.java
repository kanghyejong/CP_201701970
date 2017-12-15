package 과제5;

public class Box {
	int 가로;
	int 세로;
	int 높이;
	int Volume;

	public int get가로() {
		return 가로;
	}

	public void set가로(int a) {
		가로 = a;
	}

	public int get세로() {
		return 세로;
	}

	public void set세로(int b) {
		세로 = b;
	}

	public int get높이() {
		return 높이;
	}

	public void set높이(int c) {
		높이 = c;
	}

	public int getVolume() {
		Volume=(가로*세로*높이);
		return Volume;
	}

	
	public void print() {
		System.out.println("박스의 부피는 " + getVolume());
	}
}
