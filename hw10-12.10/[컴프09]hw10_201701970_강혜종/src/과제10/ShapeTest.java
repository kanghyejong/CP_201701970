package ����10;

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
			System.out.println("�������� �ΰ��� ���� ���ƾ��մϴ�.");
	}

	public int area() {
		return (int) ((radius * radius) * 3.14);
	}

}

public class ShapeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("<������ ���� ��� ���α׷�>");

		System.out.print("�ﰢ���� �غ��� ���̸� ������� �Է��Ͻÿ� : ");
		Triangle triangle = new Triangle(scan.nextInt(), scan.nextInt());

		System.out.print("���簢���� ���ο� ���θ� ������� �Է��Ͻÿ� : ");
		Rectangle rectangle = new Rectangle(scan.nextInt(), scan.nextInt());

		System.out.print("���� ������ ���� �� �� �Է��Ͻÿ� : ");
		Circle circle = new Circle(scan.nextInt(), scan.nextInt());

		Shape[] shape = new Shape[3];
		shape[0] = triangle;
		shape[1] = rectangle;
		shape[2] = circle;

		for (int i = 0; i < shape.length; i++) {
			if (i == 0)
				System.out.println("�ﰢ���� ���̴� : " + shape[i].area());
			else if (i == 1)
				System.out.println("���簢���� ���̴� : " + shape[i].area());
			else
				System.out.println("���� ���̴� : " + shape[i].area());
		}

	}
}
