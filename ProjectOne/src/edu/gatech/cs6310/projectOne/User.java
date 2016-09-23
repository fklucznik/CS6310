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
	public int uuid;
	public String name;
	public String address;
	public String phone;
	
//constructor
	public User(int initUUID, String initName, String initAddress, String initPhone){
		uuid = initUUID;
		name = initName;
		address = initAddress;
		phone = initPhone;
	}
	
//methods
	public void setUUID(int newValue){
		uuid = newValue;
	}
	
	public void setName(String newValue){
		name = newValue;
	}
	
	public void setAddress(String newValue){
		address = newValue;
	}
	
	public void setPhone(String newValue){
		phone = newValue;
	}
			
}
