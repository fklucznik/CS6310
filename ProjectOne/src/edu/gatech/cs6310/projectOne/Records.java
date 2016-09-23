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
public class Records {
	
	//fields
	public int studentUUID;
	public int courseID;
	public int instructorUUID;
	public String instructorComments;
	public char finalGrade;
	
	//constructor
	public Records(int initStudentUUID, int initCourseID, int initInstructorUUID,
			String initInstructorComments, char initFinalGrade){
		studentUUID = initStudentUUID;
		courseID = initCourseID;
		instructorUUID = initInstructorUUID;
		instructorComments = initInstructorComments;
		finalGrade = initFinalGrade;
	}
	
	//methods
	public void setStudentUUID(int newValue){
		studentUUID = newValue;
	}
	
	public void setCourseID(int newValue){
		courseID = newValue;
	}
	
	public void setInstructorUUID(int newValue){
		instructorUUID = newValue;
	}
	
	public void setInstructorComments(String newValue){
		instructorComments = newValue;
	}
	
	public void setFinalGrade(char newValue){
		finalGrade = newValue;
	}
		
	/**
	 * Read records.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static void ReadRecords() {

		  String csvFileToRead = "records.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {

		    String[] records = line.split(splitBy);
		    System.out.println("records [studentUUID = " + records[0] + ", courseID = "
		      + records[1] + ", instructorUUID = " + records[2] + ", instructorComments = "
		      + records[3] + ", finalGrade = " + records[4] + "]");
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
		 System.out.println("Done with records.csv");
		 }
	
	/**
	 * Count records in records.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static int RecordCount() {

		  String csvFileToRead = "records.csv";
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
