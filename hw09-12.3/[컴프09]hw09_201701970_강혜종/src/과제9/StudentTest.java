package ����9;

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
		System.out.println("<�кλ�>");
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + studentnumber);
		System.out.println("�а� : " + major);
		System.out.println("�г� : " + grade);
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
			this.assistant = "��������";
		} else {
			this.assistant = "��������";
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
		System.out.println("<���п���>");
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + studentnumber);
		System.out.println("�а� : " + major);
		System.out.println("�г� : " + grade);
		System.out.println("�̼����� : " + credit);

	}
}

public class StudentTest {
	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("������", "201701970", "��ǻ�Ͱ��а�", "1�г�", "18����");
		undergraduate.setClub("S.P.G");

		Graduate graduate = new Graduate("������", "201701970", "��ǻ�Ͱ��а�", "1�г�", "18����");
		Random rand = new Random();
		graduate.setAssistant(rand.nextInt(2));
		graduate.setScholarshiprate(rand.nextInt(11));

		undergraduate.print();
		System.out.println("�̼����� : " + undergraduate.getCredit());
		System.out.println("���Ƹ� : " + undergraduate.getClub());

		System.out.println();

		graduate.print();
		System.out.println("����  ����: " + graduate.getAssistant());
		System.out.println("���б� ����  : " + graduate.getScholarshiprate());

	}
}