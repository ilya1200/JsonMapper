package com.myproject.app.Classes;

public class Structure {
	public String firstName;
	public String lastName;
	public int age;
	public Address address;
	public PhoneNumber phoneNumbers[];
	
	public String toString() {
		String str="firstName:"+firstName+"\n"+
				"lastName:"+lastName+"\n"+
				"age:"+age+"\n"+
				"Address:"+address.streetAddress + ","+ address.city + "," + address.postalCode + "\n"+
				"phoneNumbers:"+this.getPhones()+"\n";
		
		return str;
	}
	
	public String getPhones() {
		String phones="";
		
		for(int i=0 ; i<phoneNumbers.length;i++) {
			phones+= phoneNumbers[i].type + ":"+phoneNumbers[i].number + '\n';
		}
		
		return phones;
	}
}




    
