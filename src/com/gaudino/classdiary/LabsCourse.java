package com.gaudino.classdiary;

import java.util.Scanner;

public class LabsCourse {

	public static void main(String[] args){
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter with course name: ");
			String courseName = scan.nextLine();
			
			System.out.println("Enter with course schedule: ");
			String courseSchedule = scan.nextLine();
			
			System.out.println("Enter with teacher name: ");
			String teacherName = scan.nextLine();
			
			System.out.println("Enter with teacher department: ");
			String teacherDepartment = scan.nextLine();
			
			System.out.println("Enter with teacher email: ");
			String teacherEmail = scan.nextLine();
			
			Course course = new Course();
			course.setName(courseName);
			course.setSchedule(courseSchedule);
			
			Teacher teacher = new Teacher();
			teacher.setName(teacherName);
			teacher.setDepartment(teacherDepartment);
			teacher.setEmail(teacherEmail);
			
			course.setTeacher(teacher);
			
			System.out.println("----Student----");
			
			Student[] students = new Student[5];
			for (int i = 0; i < students.length; i++) {
				
				scan.nextLine();
				
				System.out.println("Enter with student name " + (i+1));
				String studentName = scan.nextLine();
				
				System.out.println("Enter with student register ");
				String studentRegister = scan.nextLine();
				
				double[] notes = new double[4];
				
				for (int j = 0; j < notes.length; j++) {
					System.out.println("Enter with note " + (j+1));
					notes[j] = scan.nextDouble();
				}
				
				Student student = new Student();
				student.setName(studentName);
				student.setGrades(notes);
				student.setRegister(studentRegister);
				
				students[i] = student;
			}
			
			course.setStudents(students);
			
			System.out.println(course.getInfo());
		}
		
		
	}
	
}

