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
public class Records {
	
	//fields
	private int studentUUID;
	private int courseID;
	private int instructorUUID;
	private String instructorComments;
	private char finalGrade;
	
	//constructor
	public Records(){
		studentUUID = 0;
		courseID = 0;
		instructorUUID = 0;
		instructorComments = "";
		finalGrade = 'z';
	}
	
	public Records(int initStudentUUID, int initCourseID, int initInstructorUUID,
			String initInstructorComments, char initFinalGrade){
		studentUUID = initStudentUUID;
		courseID = initCourseID;
		instructorUUID = initInstructorUUID;
		instructorComments = initInstructorComments;
		finalGrade = initFinalGrade;
	}
	
	//setter methods
	public void setStudentUUID(int newValue){
		this.studentUUID = newValue;
	}
	
	public void setCourseID(int newValue){
		this.courseID = newValue;
	}
	
	public void setInstructorUUID(int newValue){
		this.instructorUUID = newValue;
	}
	
	public void setInstructorComments(String newValue){
		this.instructorComments = newValue;
	}
	
	public void setFinalGrade(char newValue){
		this.finalGrade = newValue;
	}
	
	//getter methods
	public int getStudentUUID(){
		return studentUUID;
	}
	
	public int getCourseID(){
		return courseID;
	}
	
	public int getInstructorUUID(){
		return instructorUUID;
	}
	
	public String getInstructorComments(){
		return instructorComments;
	}
	
	public char getFinalGrade(){
		return finalGrade;
	}
	
	//other methods
	/**
	 * Print content of records.csv file
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static void PrintRecords() {

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
	
	/**
	 * Store content of records.csv file in ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static void StoreRecords() {

		  String csvFileToRead = "records.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Records> recordsList = new ArrayList<Records>();

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] records = line.split(splitBy);
		    
		    //create record object to store values
		    Records recordObject = new Records();
		    
		    //add values from csv to recordObject
		    recordObject.setStudentUUID(Integer.parseInt(records[0]));
		    recordObject.setCourseID(Integer.parseInt(records[1]));		    
		    recordObject.setInstructorUUID(Integer.parseInt(records[2]));		    
		    recordObject.setInstructorComments(records[3]);
		    recordObject.setFinalGrade(records[4].charAt(0));
		    
		    //add record object to the list
		    recordsList.add(recordObject);
		   }
		   //print values stored in the recordsList
		   printRecordsList(recordsList);

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

	private static void printRecordsList(List<Records> recordsList) {

        //talk through the list
		for(int i = 0; i < recordsList.size(); i++){
			
		//print contents of each item in the record object
	    System.out.println("records [studentUUID = " + recordsList.get(i).getStudentUUID() + ", courseID = "
			      + recordsList.get(i).getCourseID() + ", instructorUUID = " + recordsList.get(i).getInstructorUUID() + ", instructorComments = "
			      + recordsList.get(i).getInstructorComments() + ", finalGrade = " + recordsList.get(i).getFinalGrade() + "]");
		}
	}
}
