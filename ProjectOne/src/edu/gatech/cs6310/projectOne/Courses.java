/**
 * 
 */
package edu.gatech.cs6310.projectOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * @author ubuntu
 *
 */
public class Courses {
	
	//fields
		public int courseID;
		public String courseName;
		public String offeringOne;
		public String offeringTwo;
		
	//constructor
		public Courses(int initCourseID, String initCourseName, String initOfferingOne, String initOfferingTwo){
			courseID = initCourseID;
			courseName = initCourseName;
			offeringOne = initOfferingOne;
			offeringTwo = initOfferingTwo;
		}
		
	//methods
		public void setCourseID(int newValue){
			courseID = newValue;
		}
		
		public void setOfferingOne(String newValue){
			offeringOne = newValue;
		}
		
		public void setOfferingTwo(String newValue){
			offeringTwo = newValue;
		}

		/**
		 * Read courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static void ReadCourses() {

			  String csvFileToRead = "courses.csv";
			  BufferedReader br = null;
			  String line = "";
			  String splitBy = ",";

			  try {

			   br = new BufferedReader(new FileReader(csvFileToRead));
			   while ((line = br.readLine()) != null) {

			    String[] courses = line.split(splitBy);
			    
			    if (courses.length == 2){
				    System.out.println("courses [courseID = " + courses[0] + ", courseName = "
				    + courses[1] + "]");		    	
			   }
			    if (courses.length == 3){
				    System.out.println("courses [courseID = " + courses[0] + ", courseName = "
				    + courses[1] + ", offeringOne = " + courses[2] + "]");		    	
			   }
			    if (courses.length == 4){
				    System.out.println("courses [courseID = " + courses[0] + ", courseName = "
				    + courses[1] + ", offeringOne = " + courses[2] + ", offeringTwo = " + courses[3] + "]");		    	
			   }
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
			  System.out.println("Done with courses.csv");
			 }
		
		/**
		 * Count courses in courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static int CourseCount() {

			  String csvFileToRead = "courses.csv";
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
		 * Count summer courses in courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static int SummerCourses() {

			  String csvFileToRead = "courses.csv";
			  BufferedReader br = null;
			  String line = "";
			  String splitBy = ",";
			  int count = 0;

			  try {

			   br = new BufferedReader(new FileReader(csvFileToRead));
			   
			   while ((line = br.readLine()) != null) {

			    String[] courses = line.split(splitBy); 	
			   
			    if (courses.length == 3){
			    	if (Objects.equals("Summer", courses[2])) count++;		    	
			    }
		
			    if (courses.length == 4){
			    	if (Objects.equals("Summer", courses[2]))count++;
			    	if (Objects.equals("Summer", courses[3]))count++;
			    }
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
		 * Count fall courses in courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static int FallCourses() {

			  String csvFileToRead = "courses.csv";
			  BufferedReader br = null;
			  String line = "";
			  String splitBy = ",";
			  int count = 0;

			  try {

			   br = new BufferedReader(new FileReader(csvFileToRead));
			   
			   while ((line = br.readLine()) != null) {

			    String[] courses = line.split(splitBy); 	
			   
			    if (courses.length == 3){
			    	if (Objects.equals("Fall", courses[2])) count++;		    	
			    }
		
			    if (courses.length == 4){
			    	if (Objects.equals("Fall", courses[2]))count++;
			    	if (Objects.equals("Fall", courses[3]))count++;
			    }
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
		 * Count spring courses in courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static int SpringCourses() {

			  String csvFileToRead = "courses.csv";
			  BufferedReader br = null;
			  String line = "";
			  String splitBy = ",";
			  int count = 0;

			  try {

			   br = new BufferedReader(new FileReader(csvFileToRead));
			   
			   while ((line = br.readLine()) != null) {

			    String[] courses = line.split(splitBy); 	
			   
			    if (courses.length == 3){
			    	if (Objects.equals("Spring", courses[2])) count++;		    	
			    }
		
			    if (courses.length == 4){
			    	if (Objects.equals("Spring", courses[2]))count++;
			    	if (Objects.equals("Spring", courses[3]))count++;
			    }
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
