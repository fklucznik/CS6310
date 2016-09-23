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
	
//Setter methods
	public void SetUUID(int newValue){
		this.uuid = newValue;
	}
	
	public void SetName(String newValue){
		this.name = newValue;
	}
	
	public void SetAddress(String newValue){
		this.address = newValue;
	}
	
	public void SetPhone(String newValue){
		this.phone = newValue;
	}
	
	//Getter methods
		public int  GetUUID(){
			return uuid;
		}
		
		public String GetName(){
			return name;
		}
		
		public String GetAddress(){
			return address;
		}
		
		public String GetPhone(){
			return phone;
		}			
}
