package 과제5;

public class EmployeeTest {
	public static void main(String []args){
	Employee employee= new Employee();
	employee.set이름("강혜종");
	employee.set전화번호("010-6724-0083");
	employee.set연봉("1억");
	
	System.out.println("직원의 이름은 " + employee.get이름());
	System.out.println("직원의 전화번호는 " + employee.get전화번호());
	System.out.println("직원의 연봉은 " + employee.get연봉());
	
	}
}
