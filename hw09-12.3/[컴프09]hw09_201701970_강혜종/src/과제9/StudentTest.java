package 과제9;

import java.util.Random;

class Student {
	String name;
	String studentnumber;
	String major;
	String grade;
	String credit;

	public Student(String name, String studentnumber, String major, String grade, String credit) {
		this.name = name;
		this.studentnumber = studentnumber;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}
}

class Undergraduate extends Student {
	String club;

	public Undergraduate(String name, String studentnumber, String major, String grade, String credit) {
		super(name, studentnumber, major, grade, credit);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void print() {
		System.out.println("<학부생>");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentnumber);
		System.out.println("학과 : " + major);
		System.out.println("학년 : " + grade);
	}
}

class Graduate extends Student {
	String assistant;
	String scholarshiprate;

	public Graduate(String name, String studentnumber, String major, String grade, String credit) {
		super(name, studentnumber, major, grade, credit);
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(int assistant) {
		if (assistant == 0) {
			this.assistant = "교육조교";
		} else {
			this.assistant = "연구조교";
		}
	}

	public String getScholarshiprate() {
		return scholarshiprate;
	}

	public void setScholarshiprate(int scholarshiprate) {
		for (int a = 0; a < 10; a++) {
			if (a == scholarshiprate) {
				this.scholarshiprate = "0." + scholarshiprate;
			}
		}
		if(scholarshiprate==10){
			this.scholarshiprate="1.0";
		}
	}

	public void print() {
		System.out.println("<대학원생>");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentnumber);
		System.out.println("학과 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이수학점 : " + credit);

	}
}

public class StudentTest {
	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("강혜종", "201701970", "컴퓨터공학과", "1학년", "18학점");
		undergraduate.setClub("S.P.G");

		Graduate graduate = new Graduate("강혜종", "201701970", "컴퓨터공학과", "1학년", "18학점");
		Random rand = new Random();
		graduate.setAssistant(rand.nextInt(2));
		graduate.setScholarshiprate(rand.nextInt(11));

		undergraduate.print();
		System.out.println("이수학점 : " + undergraduate.getCredit());
		System.out.println("동아리 : " + undergraduate.getClub());

		System.out.println();

		graduate.print();
		System.out.println("조교  유형: " + graduate.getAssistant());
		System.out.println("장학금 비율  : " + graduate.getScholarshiprate());

	}
}