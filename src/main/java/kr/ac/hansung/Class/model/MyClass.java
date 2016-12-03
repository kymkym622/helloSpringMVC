package kr.ac.hansung.Class.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MyClass {
	int year;
	int semester;
	String code;
	String title;
	String type;
	int grades;

	public MyClass() {

	}

	public MyClass(int year,int semeseter,String code,String title,String type,int grades) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.title = title;
		this.type = type;
		this.grades = grades;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}
	public String toString() {
		return "수강신청 과목 [ 연도=" + year + ", 과목코드=" + code + ", 과목명=" + title + ", 구분=" + type+ ", 학점=" + grades+"]";
	}
}
