package com.gaudino.classdiary;

public class Course {
	
	private String name;
	private String schedule;
	private Teacher teacher;
	private Student[] students;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public String getInfo() {
		String info = "Course name = " + name + "\n";
		
		if (teacher != null) {
			info += teacher.getInfo();
		}
		
		if (students != null) {
			System.out.println("----Students----");
			for (Student student : students) {
				if (student != null) {
					info += student.getInfo();
					info += "\n";
				}
			}
			
			info += "\nClass middle = " + getMiddleClass();
		}
		
		return info;
	}
	
	public double getMiddleClass(){
		double plusSoma = 0;
		for (Student student : students) {
			if (student != null) {
				plusSoma += student.getMiddle();
			}
		}
		return plusSoma/students.length;
	}
	
}

