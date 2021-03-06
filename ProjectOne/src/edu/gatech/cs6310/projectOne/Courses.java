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
		private String offeringThree;
		
	//constructors
		public Courses(int initCourseID, String initCourseName, 
				String initOfferingOne, String initOfferingTwo, String initOfferingThree){
			courseID = initCourseID;
			courseName = initCourseName;
			offeringOne = initOfferingOne;
			offeringTwo = initOfferingTwo;
			offeringThree= initOfferingThree;
		}
		
		public Courses (){
			courseID = 0;
			courseName = "";
			offeringOne = "";
			offeringTwo = "";
			offeringThree = "";
		}
		
	//Setter methods
		public void SetCourseID(int newValue){
			this.courseID = newValue;
		}
		
		public void SetCourseName(String newValue){
			this.courseName = newValue;
		}
		
		public void SetOfferingOne(String newValue){
			this.offeringOne = newValue;
		}
		
		public void SetOfferingTwo(String newValue){
			this.offeringTwo = newValue;
		}
		
		public void SetOfferingThree(String newValue){
			this.offeringThree = newValue;
		}
		
		//Getter methods
		public int GetCourseID(){
			return courseID;
		}
		
		public String GetCourseName(){
			return courseName;
		}
		
		public String GetOfferingOne(){
			return offeringOne;
		}
		
		public String GetOfferingTwo(){
			return offeringTwo;
		}	
		
		public String GetOfferingThree(){
			return offeringThree;
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
			    if (courses.length == 5){
				    System.out.println("courses [courseID = " + courses[0] + ", courseName = "
				    + courses[1] + ", offeringOne = " + courses[2] + ", offeringTwo = " + courses[3] 
				    		+ ", offeringThree = " + courses[4] + "]");		    	
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
			    
			    if (courses.length == 5){
			    	if (Objects.equals("Summer", courses[2]))count++;
			    	if (Objects.equals("Summer", courses[3]))count++;
			    	if (Objects.equals("Summer", courses[4]))count++;
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
			    
			    if (courses.length == 5){
			    	if (Objects.equals("Fall", courses[2]))count++;
			    	if (Objects.equals("Fall", courses[3]))count++;
			    	if (Objects.equals("Fall", courses[4]))count++;
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
		
			    if (courses.length == 5){
			    	if (Objects.equals("Spring", courses[2]))count++;
			    	if (Objects.equals("Spring", courses[3]))count++;
			    	if (Objects.equals("Spring", courses[4]))count++;
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
		public static List<Courses>  StoreCourses() {

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

			    if (courses.length  == 5){
			    //add values from csv to courseObject
			    courseObject.SetCourseID(Integer.parseInt(courses[0]));    
			    courseObject.SetCourseName(courses[1]);		    
			    courseObject.SetOfferingOne(courses[2]);
			    courseObject.SetOfferingTwo(courses[3]);
			    courseObject.SetOfferingThree(courses[4]);
			       } else if (courses.length  == 4){
			       //add values from csv to courseObject
			       courseObject.SetCourseID(Integer.parseInt(courses[0]));    
			       courseObject.SetCourseName(courses[1]);		    
			       courseObject.SetOfferingOne(courses[2]);
			       courseObject.SetOfferingTwo(courses[3]);
			       } else if (courses.length == 3){
				       //add values from csv to courseObject
				       courseObject.SetCourseID(Integer.parseInt(courses[0]));    
				       courseObject.SetCourseName(courses[1]);		    
				       courseObject.SetOfferingOne(courses[2]);
				       } else if (courses.length == 2){
					       //add values from csv to courseObject
					       courseObject.SetCourseID(Integer.parseInt(courses[0]));    
					      courseObject.SetCourseName(courses[1]);		    
					      }
			    
			    //add record object to the list
			    coursesList.add(courseObject);
			   }
			   //print values stored in the coursesList
			   //printCoursesList(coursesList);

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
			 //System.out.println("Done with courses.csv");
			return coursesList;
			 }

/**
 * 
 * Commented out b/c not using right now.

		private static void printCoursesList(List<Courses> coursesList) {

	        //talk through the list
			for(int i = 0; i < coursesList.size(); i++){
				
			//print contents of each item in the record object
		    System.out.println("courses [courseID = " + coursesList.Get(i).GetCourseID() + ", courseName = "
				      + coursesList.Get(i).GetCourseName() + ", offeringOne = " + coursesList.Get(i).GetOfferingOne() + ", offeringTwo = "
				      + coursesList.Get(i).GetOfferingTwo() + ", offeringThree = " + coursesList.Get(i).GetOfferingThree()+ "]");
			}
		} */
}
