package 과제7;

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
			System.out.println("강아지의 이름은 " + name + "입니다.");

		if (breed != null)
			System.out.println("강아지의 종은 " + breed + "입니다.");

		if (age != 0)
			System.out.println("강아지의 나이는 " + age + "살 입니다.");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog("흰둥이", 5);
		dog1.print();

		Dog dog2 = new Dog("검둥이", "진돗개", 4);
		dog2.print();
	}
}
