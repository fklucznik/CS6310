/**
 * 
 */
package edu.gatech.cs6310.projectOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	
	//methods

	/**
	 * Read students.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	 * public int uuid
	 * public String name
	 * public String address
	 * public String phone
	*/
	public static void ReadStudents() {

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
	 
}
