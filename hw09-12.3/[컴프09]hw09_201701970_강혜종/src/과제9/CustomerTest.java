package 과제9;

class Person {
	String name;
	String adress;
	String phonenumber;

	public Person(String name, String adress, String phonenumber) {
		this.name = name;
		this.adress = adress;
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}

class Customer extends Person {
	public Customer(String name, String adress, String phonenumber) {
		super(name, adress, phonenumber);
		// TODO Auto-generated constructor stub
	}

	int customernumber;
	int mileage;

	public int getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void print() {
		System.out.println("<손님정보>");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + adress);
		System.out.println("전화번호 : " + phonenumber);

	}
}
	public class CustomerTest {
		public static void main(String[] args) {
			Customer customer = new Customer("강혜종", "대전광역시 동구 판암동", "010-XXXX-XXXX");
			customer.setCustomernumber(1998);
			customer.setMileage(1001);
			customer.print();
			System.out.println("고객번호: " + customer.getCustomernumber());
			System.out.println("마일리지 : " + customer.getMileage());
		}
	}
