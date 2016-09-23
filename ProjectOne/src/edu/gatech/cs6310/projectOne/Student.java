/**
 * 
 */
package edu.gatech.cs6310.projectOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ubuntu
 *
 */
public class Student extends User{

	//fields
	
	//constructor
	public Student(int initUUID, String initName, String initAddress, String initPhone) {
		super(initUUID, initName, initAddress, initPhone);
		// TODO Auto-generated constructor stub
	}
	
	public Student (){
		super();
	}
	
	//methods

	/**
	 * Prints contents of students.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	 * public int uuid
	 * public String name
	 * public String address
	 * public String phone
	*/
	public static void PrintStudents() {

		  String csvFileToRead = "students.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {

		    String[] students = line.split(splitBy);
			    System.out.println("students [uuid = " + students[0] + ", name = "
			    + students[1] + ", address = " + students[2] + ", phone = " + students[3] + "]");		    	
		  }

		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  } finally {
		   if (br != null) {
		    try {
		     br.close();
		    } catch (IOException e) {
		     e.printStackTrace();
		    }
		   }
		  }
		  System.out.println("Done with students.csv");
		 }
	
	/**
	 * Count students in students.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static int StudentCount() {

		  String csvFileToRead = "students.csv";
		  BufferedReader br = null;
		  int count = 0;

		  try {
		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((br.readLine()) != null) {
             count++; 
		   }
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  } finally {
		   if (br != null) {
		    try {
		     br.close();
		    } catch (IOException e) {
		     e.printStackTrace();
		    }
		   }
		 } return count;	
	}
	
	/**
	 * Store content of students.csv file in ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static List<Student> StoreStudents() {

		  String csvFileToRead = "students.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Student> studentsList = new ArrayList<Student>();

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] students = line.split(splitBy);
		    
		    //create student object to store values
		    Student studentObject = new Student();
		    
		    //add values from csv to studentObject
		    studentObject.setUUID(Integer.parseInt(students[0]));
		    studentObject.setName(students[1]);		    
		    studentObject.setAddress(students[2]);		    
		    studentObject.setPhone(students[3]);
		    
		    //add student object to the list
		    studentsList.add(studentObject);
		   }
		   //print values stored in the studentsList
		   //printStudentList(studentsList);

		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  } finally {
		   if (br != null) {
		    try {
		     br.close();
		    } catch (IOException e) {
		     e.printStackTrace();
		    }
		   }
		  }
		 //System.out.println("Done with students.csv");
		return studentsList;
		 }


	/**
	 * Commented out b/c not using at the moment
	//print students from list array
	private static void printStudentList(List<Student> studentsList) {

        //talk through the list
		for(int i = 0; i < studentsList.size(); i++){
			
		//print contents of each item in the student object
	    System.out.println("students [studentUUID = " + studentsList.get(i).getUUID() + ", name = "
			      + studentsList.get(i).getName() + ", address = " + studentsList.get(i).getAddress() + ", phone = "
			      + studentsList.get(i).getPhone() + "]");
		}
	}*/
	
	 
}
