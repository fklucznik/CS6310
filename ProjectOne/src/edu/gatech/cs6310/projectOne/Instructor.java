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
public class Instructor extends User{
	
	//fields
	

	//constructor
	public Instructor(int initUUID, String initName, String initAddress, String initPhone) {
		super(initUUID, initName, initAddress, initPhone);
		// TODO Auto-generated constructor stub
	}
	
	//methods

	/**
	 * Read instructors.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	 * public int uuid
	 * public String name
	 * public String address
	 * public String phone
	*/
	public static void ReadInstructors() {

		  String csvFileToRead = "instructors.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {

		    String[] instructors = line.split(splitBy);
			    System.out.println("instructors [uuid = " + instructors[0] + ", name = "
			    + instructors[1] + ", address = " + instructors[2] + ", phone = " + instructors[3] + "]");		    	
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
		  System.out.println("Done with instructors.csv");
		 }
	
	/**
	 * Count instructors in instructors.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static int InstructorCount() {

		  String csvFileToRead = "instructors.csv";
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
		 }
	 return count;	
	}
}
