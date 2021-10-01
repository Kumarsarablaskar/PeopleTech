package com.peopletech.fridy;

public class Friends {
  private String name;
  private int phonenumber;
  private String email;
public Friends(String name, int phonenumber, String email) {
	super();
	this.name = name;
	this.phonenumber = phonenumber;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Friends [name=" + name + ", phonenumber=" + phonenumber + ", email=" + email + "]";
}
  
}
