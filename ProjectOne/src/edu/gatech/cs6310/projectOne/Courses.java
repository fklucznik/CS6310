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
import java.util.Objects;

/**
 * @author ubuntu
 *
 */
public class Courses {
	
	//fields
		private int courseID;
		private String courseName;
		private String offeringOne;
		private String offeringTwo;
		
	//constructor
		public Courses(int initCourseID, String initCourseName, String initOfferingOne, String initOfferingTwo){
			courseID = initCourseID;
			courseName = initCourseName;
			offeringOne = initOfferingOne;
			offeringTwo = initOfferingTwo;
		}
		
		public Courses (){
			courseID = 0;
			courseName = "";
			offeringOne = "";
			offeringTwo = "";
		}
		
	//setter methods
		public void setCourseID(int newValue){
			this.courseID = newValue;
		}
		
		public void setCourseName(String newValue){
			this.courseName = newValue;
		}
		
		public void setOfferingOne(String newValue){
			this.offeringOne = newValue;
		}
		
		public void setOfferingTwo(String newValue){
			this.offeringTwo = newValue;
		}
		
		//getter methods
		public int getCourseID(){
			return courseID;
		}
		
		public String getCourseName(){
			return courseName;
		}
		
		public String getOfferingOne(){
			return offeringOne;
		}
		
		public String getOfferingTwo(){
			return offeringTwo;
		}		
		
		//other methods
		/**
		 * Print content of courses.csv file
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static void PrintCourses() {

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

		/**
		 * Store content of courses.csv file in ArrayList
		 * REF:  http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
		*/
		public static void StoreCourses() {

			  String csvFileToRead = "courses.csv";
			  BufferedReader br = null;
			  String line = "";
			  String splitBy = ",";
			  List<Courses> coursesList = new ArrayList<Courses>();

			  try {

			   br = new BufferedReader(new FileReader(csvFileToRead));
			   while ((line = br.readLine()) != null) {
	            
				//split on comma
			    String[] courses = line.split(splitBy);
			    
			    //create record object to store values
			    Courses courseObject = new Courses();
			    
			    if (courses.length  == 4){
			    //add values from csv to courseObject
			    courseObject.setCourseID(Integer.parseInt(courses[0]));    
			    courseObject.setCourseName(courses[1]);		    
			    courseObject.setOfferingOne(courses[2]);
			    courseObject.setOfferingTwo(courses[3]);
			    } else if (courses.length == 3){
				    //add values from csv to courseObject
				    courseObject.setCourseID(Integer.parseInt(courses[0]));    
				    courseObject.setCourseName(courses[1]);		    
				    courseObject.setOfferingOne(courses[2]);
				    } else if (courses.length == 2){
					    //add values from csv to courseObject
					    courseObject.setCourseID(Integer.parseInt(courses[0]));    
					    courseObject.setCourseName(courses[1]);		    
					    }
			    
			    //add record object to the list
			    coursesList.add(courseObject);
			   }
			   //print values stored in the coursesList
			   printCoursesList(coursesList);

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

		private static void printCoursesList(List<Courses> coursesList) {

	        //talk through the list
			for(int i = 0; i < coursesList.size(); i++){
				
			//print contents of each item in the record object
		    System.out.println("courses [courseID = " + coursesList.get(i).getCourseID() + ", courseName = "
				      + coursesList.get(i).getCourseName() + ", offeringOne = " + coursesList.get(i).getOfferingOne() + ", offeringTwo = "
				      + coursesList.get(i).getOfferingTwo() + "]");
			}
		}
}
