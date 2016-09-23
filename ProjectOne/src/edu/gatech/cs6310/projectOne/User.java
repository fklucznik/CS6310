/**
 * 
 */
package edu.gatech.cs6310.projectOne;

/**
 * @author ubuntu
 *
 */
public class User {

//fields
	private int uuid;
	private String name;
	private String address;
	private String phone;
	
//constructor
	public User(int initUUID, String initName, String initAddress, String initPhone){
		uuid = initUUID;
		name = initName;
		address = initAddress;
		phone = initPhone;
	}
	
	public User(){
		uuid = 0;
		name = "";
		address = "";
		phone = "";
	}
	
//setter methods
	public void setUUID(int newValue){
		this.uuid = newValue;
	}
	
	public void setName(String newValue){
		this.name = newValue;
	}
	
	public void setAddress(String newValue){
		this.address = newValue;
	}
	
	public void setPhone(String newValue){
		this.phone = newValue;
	}
	
	//getter methods
		public int  getUUID(){
			return uuid;
		}
		
		public String getName(){
			return name;
		}
		
		public String getAddress(){
			return address;
		}
		
		public String getPhone(){
			return phone;
		}			
}
