package edu.gatech.cs6310.projectOne;


import java.util.Collections;
import java.util.List;


public class ProjectOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    //Calculate the total number of records in the records.csv file
		System.out.println(Records.RecordCount());
		
		//Calculate the total number of records in the students.csv file
		System.out.println(Student.StudentCount());
		 
		//Calculate the number of students who haven’t taken any classes
		System.out.println(StudentsNotTakingClasses());
		
		//Calculate the total number of records in the instructors.csv file
		System.out.println(Instructor.InstructorCount());
		
		//Calculate the number of instructors who haven’t taught any classes
		System.out.println(InstructorsNotTeaching()); 
		
		//Calculate the total number of records in the courses.csv file
		System.out.println(Courses.CourseCount());		 
		
		//Calculate the number of courses that haven’t been taken by any students
		System.out.println(CoursesNotTaken());
		
		//Calculate the total number of courses being offered during the Fall semester
		System.out.println(Courses.FallCourses());		 
		
		//Calculate the total number of courses being offered during the Spring semester
		System.out.println(Courses.SpringCourses());		 
		
		//Calculate the total number of courses being offered during the Summer semester
		System.out.println(Courses.SummerCourses());	
	}
	
	//counts the number of instructors who have not taught any classes based on the instructors.csv 
	//and records.csv
	private static int InstructorsNotTeaching() {
		
		//declare return val
		int count = 0;
		
		//declare occurances tracker
		int occurrences = 0;
		
		//get list array of instructors from the instructors.csv file
		List<Instructor> instructorsList = Instructor.StoreInstructors();
		
		//get list array of instructor UUIDs from the records.csv file
		List<Integer> recordsInstructorUUIDList = Records.StoreRecordsInstructorUUID();


        //talk through the list of instructors and count number of courses they have taught
		//count the number of instructors who have not taught any courses
		for(int i = 0; i < instructorsList.size(); i++){
			
		     //count the number of courses a particular instructor has taught	
		     occurrences = Collections.frequency(recordsInstructorUUIDList, instructorsList.get(i).getUUID());
		
		     //System.out.println("occurrences = " + occurrences);
		
		     //increase count if occurrences is 0
		     if (occurrences == 0) count++;
		
		     //reset counter
		     occurrences = 0;			
	     }	
		return count;
	}
	
	
	//counts the number of courses no students have taken based on the courses.csv 
	//and records.csv
	private static int CoursesNotTaken() {
		
		//declare return val
		int count = 0;
		
		//declare occurances tracker
		int occurrences = 0;
		
		//get list array of instructors from the instructors.csv file
		List<Courses> courseIDList = Courses.StoreCourses();
		
		//get list array of instructor UUIDs from the records.csv file
		List<Integer> recordsCourseIDList = Records.StoreRecordsCourseID();


        //talk through the list of instructors and count number of courses they have taught
		//count the number of instructors who have not taught any courses
		for(int i = 0; i < courseIDList.size(); i++){
			
		     //count the number of courses a particular instructor has taught	
		     occurrences = Collections.frequency(recordsCourseIDList, courseIDList.get(i).getCourseID());
		
		     //System.out.println("occurrences = " + occurrences);
		
		     //increase count if occurrences is 0
		     if (occurrences == 0) count++;
		
		     //reset counter
		     occurrences = 0;			
	     }	
		return count;
	}
	
    //calculates the number of students who haven’t taken any classes based on the students.csv
	//and records.csv
	private static int StudentsNotTakingClasses() {
		
		//declare return val
		int count = 0;
		
		//declare occurances tracker
		int occurrences = 0;
		
		//get list array of instructors from the instructors.csv file
		List<Student> studentsUUIDList = Student.StoreStudents();
		
		//get list array of instructor UUIDs from the records.csv file
		List<Integer> recordsStudentUUIDList = Records.StoreRecordsStudentUUID();


        //talk through the list of instructors and count number of courses they have taught
		//count the number of instructors who have not taught any courses
		for(int i = 0; i < studentsUUIDList.size(); i++){
			
		     //count the number of courses a particular instructor has taught	
		     occurrences = Collections.frequency(recordsStudentUUIDList, studentsUUIDList.get(i).getUUID());
		
		     //System.out.println("occurrences = " + occurrences);
		
		     //increase count if occurrences is 0
		     if (occurrences == 0) count++;
		
		     //reset counter
		     occurrences = 0;			
	     }	
		return count;
	}	
}
