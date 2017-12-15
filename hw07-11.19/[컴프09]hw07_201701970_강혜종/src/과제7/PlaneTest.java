package ����7;

class Plane {

	private String production_company;
	private String model;
	private int Max_passenger;

	public static int planes = 0;

	public static int getPlanes() {
		return planes;
	}

	public String getProduction_company() {
		return production_company;
	}

	public void setProduction_company(String production_company) {
		this.production_company = production_company;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax_passenger() {
		return Max_passenger;
	}

	public void setMax_passenger(int max_passenger) {
		Max_passenger = max_passenger;
	}

	public Plane(String production_company) {
		this.production_company = production_company;
		planes++;
	}

	public Plane(String model, int Max_passenger) {
		this.model = model;
		this.Max_passenger = Max_passenger;
		planes++;
	}

	public void print() {
		if (production_company != null)
			System.out.println("������� ���ۻ�� " + production_company + "�Դϴ�.");

		if (model != null)
			System.out.println("������� ���� " + model + "�Դϴ�.");

		if (Max_passenger != 0)
			System.out.println("������� �ִ� �°��� ���� " + Max_passenger + "�Դϴ�.");
	}
}

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("ABC");
		Plane plane2 = new Plane("XYZ", 123);

		plane1.print();
		plane2.print();
		System.out.println("���ݱ��� ������ ������� ���� " + Plane.getPlanes() + "�Դϴ�.");
	}
}
