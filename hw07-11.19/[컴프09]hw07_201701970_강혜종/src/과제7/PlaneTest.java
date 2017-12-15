package 과제7;

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
			System.out.println("비행기의 제작사는 " + production_company + "입니다.");

		if (model != null)
			System.out.println("비행기의 모델은 " + model + "입니다.");

		if (Max_passenger != 0)
			System.out.println("비행기의 최대 승객의 수는 " + Max_passenger + "입니다.");
	}
}

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("ABC");
		Plane plane2 = new Plane("XYZ", 123);

		plane1.print();
		plane2.print();
		System.out.println("지금까지 생성된 비행기의 수는 " + Plane.getPlanes() + "입니다.");
	}
}
