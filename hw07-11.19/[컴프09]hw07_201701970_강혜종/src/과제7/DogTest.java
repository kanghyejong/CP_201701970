package ����7;

class Dog {
	private String name;
	public static String breed;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public void print() {
		if (name != null)
			System.out.println("�������� �̸��� " + name + "�Դϴ�.");

		if (breed != null)
			System.out.println("�������� ���� " + breed + "�Դϴ�.");

		if (age != 0)
			System.out.println("�������� ���̴� " + age + "�� �Դϴ�.");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog("�����", 5);
		dog1.print();

		Dog dog2 = new Dog("�˵���", "������", 4);
		dog2.print();
	}
}
