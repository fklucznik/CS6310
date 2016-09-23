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
public class Instructor extends User{
	
	//constructor
	public Instructor(int initUUID, String initName, String initAddress, String initPhone) {
		super(initUUID, initName, initAddress, initPhone);
		// TODO Auto-generated constructor stub
	}
	
	public Instructor (){
		super();
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
	public static void PrintInstructors() {

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
	
	/**
	 * Store content of instructors.csv file in ArrayList
	 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	*/
	public static List<Instructor> StoreInstructors() {

		  String csvFileToRead = "instructors.csv";
		  BufferedReader br = null;
		  String line = "";
		  String splitBy = ",";
		  List<Instructor> instructorsList = new ArrayList<Instructor>();

		  try {

		   br = new BufferedReader(new FileReader(csvFileToRead));
		   while ((line = br.readLine()) != null) {
            
			//split on comma
		    String[] instructors = line.split(splitBy);
		    
		    //create instructor object to store values
		    Instructor instructorObject = new Instructor();
		    
		    //add values from csv to instructorObject
		    instructorObject.SetUUID(Integer.parseInt(instructors[0]));
		    instructorObject.SetName(instructors[1]);		    
		    instructorObject.SetAddress(instructors[2]);		    
		    instructorObject.SetPhone(instructors[3]);
		    
		    //add instructor object to the list
		    instructorsList.add(instructorObject);
		   }
		   //print values stored in the instructorsList
		   //printInstructorList(instructorsList);

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
		 //System.out.println("Done with instructors.csv");
		return instructorsList;
		 }

	/**
	 * Commented out b/c not using at the moment
	//print instructors from list array
	private static void printInstructorList(List<Instructor> instructorsList) {

        //talk through the list
		for(int i = 0; i < instructorsList.size(); i++){
			
		//print contents of each item in the instructor object
	    System.out.println("instructors [instructorUUID = " + instructorsList.Get(i).GetUUID() + ", name = "
			      + instructorsList.Get(i).GetName() + ", address = " + instructorsList.Get(i).GetAddress() + ", phone = "
			      + instructorsList.Get(i).GetPhone() + "]");
		}
	} */	
}
