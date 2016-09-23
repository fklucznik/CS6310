package edu.gatech.cs6310.projectOne;


public class ProjectOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Import records data
		//Records.ReadRecords(); 
		
		//Import courses data
		//Courses.ReadCourses();
		
		//Import students data
		//Student.ReadStudents();
			
		//Import instructors data
		//Instructor.ReadInstructors();
		
	    //Calculate the total number of records in the records.csv file
		System.out.println(Records.RecordCount());
		
		//Calculate the total number of records in the students.csv file
		System.out.println(Student.StudentCount());
		 
		//Calculate the number of students who haven’t taken any classes
		
		//Calculate the total number of records in the instructors.csv file
		System.out.println(Instructor.InstructorCount());
		
		//Calculate the number of instructors who haven’t taught any classes
		 
		
		//Calculate the total number of records in the courses.csv file
		System.out.println(Courses.CourseCount());		 
		
		//Calculate the number of courses that haven’t been taken by any students
		 
		
		//Calculate the total number of courses being offered during the Fall semester
		System.out.println(Courses.FallCourses());		 
		
		//Calculate the total number of courses being offered during the Spring semester
		System.out.println(Courses.SpringCourses());		 
		
		//Calculate the total number of courses being offered during the Summer semester
		System.out.println(Courses.SummerCourses());	
	}
	


}
