package 과제10;

import java.util.Scanner;

class Shape {
	protected int width;
	protected int height;

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}
}

class Triangle extends Shape {
	private int base, height;

	public Triangle(int width, int height) {
		super(width, height);

		this.base = width;
		this.height = height;
	}

	public int area() {
		return (base * height) / 2;
	}
}

class Rectangle extends Shape {
	public Rectangle(int width, int height) {
		super(width, height);
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int width, int height) {
		super(width, height);

		if (width == height)
			this.radius = width;
		else
			System.out.println("반지름은 두개의 값이 같아야합니다.");
	}

	public int area() {
		return (int) ((radius * radius) * 3.14);
	}

}

public class ShapeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("<도형의 넓이 계산 프로그램>");

		System.out.print("삼각형의 밑변과 높이를 순서대로 입력하시오 : ");
		Triangle triangle = new Triangle(scan.nextInt(), scan.nextInt());

		System.out.print("직사각형의 가로와 세로를 순서대로 입력하시오 : ");
		Rectangle rectangle = new Rectangle(scan.nextInt(), scan.nextInt());

		System.out.print("원의 반지름 값을 두 번 입력하시오 : ");
		Circle circle = new Circle(scan.nextInt(), scan.nextInt());

		Shape[] shape = new Shape[3];
		shape[0] = triangle;
		shape[1] = rectangle;
		shape[2] = circle;

		for (int i = 0; i < shape.length; i++) {
			if (i == 0)
				System.out.println("삼각형의 넓이는 : " + shape[i].area());
			else if (i == 1)
				System.out.println("직사각형의 넓이는 : " + shape[i].area());
			else
				System.out.println("원의 넓이는 : " + shape[i].area());
		}

	}
}
