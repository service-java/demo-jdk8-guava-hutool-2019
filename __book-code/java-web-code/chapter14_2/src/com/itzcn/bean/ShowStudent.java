package com.itzcn.bean;

public class ShowStudent {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void showStudent(){
		System.out.println("User [name=" + student.getName() + ", age=" + student.getAge() + ", sex=" + student.getSex() + "]");
	}

}
