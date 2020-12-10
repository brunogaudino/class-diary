package com.gaudino.classdiary;

public class Student {
	
	private String name;
	private String register;
	private double[] grades;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public String getInfo() {
		String info = "Student name = " + name + "; ";
		info += "Register = " + register + "; ";
		info += "Notes = ";
		
		double plusSum = 0;
		for (double note : grades) {
			plusSum += note;
			info += note + " ";
		}
		
		double middle = plusSum/4;
		info += "\n" + "Middle = " + middle + " - ";
		if(middle >= 7) {
			info += "OK";
		} else {
			info += "Disapproved";
		}
		
		return info;
	}
	
	public double getMiddle() {
		double plusSum = 0;
		for (double note : grades) {
			plusSum += note;
		}
		return plusSum/4;
	}
	

}

