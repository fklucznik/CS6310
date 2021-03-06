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
	
	//constructors
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
	
	//Setter methods
	public void SetStudentUUID(int newValue){
		this.studentUUID = newValue;
	}
	
	public void SetCourseID(int newValue){
		this.courseID = newValue;
	}
	
	public void SetInstructorUUID(int newValue){
		this.instructorUUID = newValue;
	}
	
	public void SetInstructorComments(String newValue){
		this.instructorComments = newValue;
	}
	
	public void SetFinalGrade(char newValue){
		this.finalGrade = newValue;
	}
	
	//Getter methods
	public int GetStudentUUID(){
		return studentUUID;
	}
	
	public int GetCourseID(){
		return courseID;
	}
	
	public int GetInstructorUUID(){
		return instructorUUID;
	}
	
	public String GetInstructorComments(){
		return instructorComments;
	}
	
	public char GetFinalGrade(){
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
	public static List<Records> StoreRecords() {

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
		    recordObject.SetStudentUUID(Integer.parseInt(records[0]));
		    recordObject.SetCourseID(Integer.parseInt(records[1]));		    
		    recordObject.SetInstructorUUID(Integer.parseInt(records[2]));		    
		    recordObject.SetInstructorComments(records[3]);
		    recordObject.SetFinalGrade(records[4].charAt(0));
		    
		    //add record object to the list
		    recordsList.add(recordObject);
		   }
		   //print values stored in the recordsList
		   //printRecordsList(recordsList);

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
		 //System.out.println("Done with records.csv");
		return recordsList;
		 }

	/**
	 * Commented out b/c not using at the moment
	private static void printRecordsList(List<Records> recordsList) {

        //talk through the list
		for(int i = 0; i < recordsList.size(); i++){
			
		//print contents of each item in the record object
	    System.out.println("records [studentUUID = " + recordsList.Get(i).GetStudentUUID() + ", courseID = "
			      + recordsList.Get(i).GetCourseID() + ", instructorUUID = " + recordsList.Get(i).GetInstructorUUID() + ", instructorComments = "
			      + recordsList.Get(i).GetInstructorComments() + ", finalGrade = " + recordsList.Get(i).GetFinalGrade() + "]");
		}
	} */
	
	/**
	 * Store instructorUUIDs from records.csv file in an ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static List<Integer> StoreRecordsInstructorUUID() {

		  String csvFileToRead = "records.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Integer> recordsInstructorUUIDList = new ArrayList<Integer>();

		  try {
			  
		   //create object to store values
		   int recordInstructorUUIDObject = 0;
		   
		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] records = line.split(splitBy);
		     
		    //add values from csv to recordObject
		    recordInstructorUUIDObject = Integer.parseInt(records[2]);		    
		    
		    //add record object to the list
		    recordsInstructorUUIDList.add(recordInstructorUUIDObject);
		   }
		   //print values stored in the recordsList
		   //printRecordsList(recordsList);

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
		 //System.out.println("Done with records.csv");
		return recordsInstructorUUIDList;
		 }
	
	/**
	 * Store courseID from records.csv file in an ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static List<Integer> StoreRecordsCourseID() {

		  String csvFileToRead = "records.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Integer> recordsCourseIDList = new ArrayList<Integer>();

		  try {
			  
		   //create object to store values
		   int recordCourseIDObject = 0;
		   
		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] records = line.split(splitBy);
		     
		    //add values from csv to recordObject
		    recordCourseIDObject = Integer.parseInt(records[1]);		    
		    
		    //add record object to the list
		    recordsCourseIDList.add(recordCourseIDObject);
		   }
		   //print values stored in the recordsList
		   //printRecordsList(recordsList);

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
		 //System.out.println("Done with records.csv");
		return recordsCourseIDList;
		 }
	
	/**
	 * Store studentUUID from records.csv file in an ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static List<Integer> StoreRecordsStudentUUID() {

		  String csvFileToRead = "records.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Integer> recordsStudentUUIDList = new ArrayList<Integer>();

		  try {
			  
		   //create object to store values
		   int recordStudentUUIDObject = 0;
		   
		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] records = line.split(splitBy);
		     
		    //add values from csv to recordObject
		    recordStudentUUIDObject = Integer.parseInt(records[0]);		    
		    
		    //add record object to the list
		    recordsStudentUUIDList.add(recordStudentUUIDObject);
		   }
		   //print values stored in the recordsList
		   //printRecordsList(recordsList);

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
		 //System.out.println("Done with records.csv");
		return recordsStudentUUIDList;
		 }
}
